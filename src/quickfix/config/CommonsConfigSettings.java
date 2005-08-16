package quickfix.config;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.DatabaseConfiguration;
import org.apache.commons.configuration.MapConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;
import org.apache.commons.configuration.XMLConfiguration;

import quickfix.ConfigError;
import quickfix.SessionID;
import quickfix.SessionSettings;

public class CommonsConfigSettings {
    private static final String DEFAULT_SESSION_KEY = "default";
    private Set configuredSessionIDs = new HashSet();
    private final CompositeConfiguration configuration = new ExtendedCompositeConfiguration();
    private SessionSettings settings;

    public CommonsConfigSettings(String filename, boolean includeSystemProperties)
            throws ConfigError {
        this(new String[] { filename }, includeSystemProperties);
    }

    public CommonsConfigSettings(String[] filenames, boolean includeSystemProperties)
            throws ConfigError {
        if (includeSystemProperties) {
            configuration.addConfiguration(new SystemConfiguration());
        }
        for (int i = 0; i < filenames.length; i++) {
            addSource(filenames[i]);
        }
        initializeSettings();
    }

    private void addSource(String filename) throws ConfigError {
        try {
            if (filename.endsWith(".properties")) {
                addPropertiesSource(filename);
            } else if (filename.endsWith(".xml")) {
                addXmlSource(filename);
            } else if (filename.endsWith(".cfg")) {
                addQuickFixSource(filename);
            } else if (filename.endsWith(".jdbc")) {
                addJdbcSource(filename);
            } else {
                throw new ConfigError("unknown configuration file type");
            }
        } catch (ConfigurationException e) {
            throw new ConfigError(e);
        }
    }

    private void addJdbcSource(String filename) throws ConfigError {
        try {
            Configuration c = new PropertiesConfiguration(getResource(filename));
            String dataSourceClass = c.getString("datasource.class");
            Configuration datasourceConfig = c.subset("datasource");
            DataSource dataSource = (DataSource) Class.forName(dataSourceClass).newInstance();
            Iterator keys = datasourceConfig.getKeys();
            while (keys.hasNext()) {
                String key = (String) keys.next();
                if (!"class".equals(key)) {
                    setBeanProperty(dataSource, key, datasourceConfig);
                }
            }
            String table = c.getString("table");
            String nameColumn = c.getString("nameColumn");
            String keyColumn = c.getString("keyColumn");
            String valueColumn = c.getString("valueColumn");
            String name = c.getString("name");
            configuration.addConfiguration(new DatabaseConfiguration(dataSource, table, nameColumn,
                    keyColumn, valueColumn, name));
        } catch (ConfigurationException e) {
            throw new ConfigError(e);
        } catch (InstantiationException e) {
            throw new ConfigError(e);
        } catch (IllegalAccessException e) {
            throw new ConfigError(e);
        } catch (ClassNotFoundException e) {
            throw new ConfigError(e);
        }
    }

    private void setBeanProperty(DataSource dataSource, String key, Configuration datasourceConfig)
            throws ConfigError {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(dataSource.getClass());
            PropertyDescriptor[] properties = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < properties.length; i++) {
                if (properties[i].getName().equals(key)) {
                    if (properties[i].getWriteMethod() == null) {
                        throw new ConfigError("can't write property: " + properties[i].getName());
                    }
                    String data = datasourceConfig.getString(key);
                    properties[i].getWriteMethod().invoke(dataSource, new Object[] { data });
                }
            }
        } catch (IllegalAccessException e) {
            throw new ConfigError(e);
        } catch (InvocationTargetException e) {
            throw new ConfigError(e);
        } catch (IntrospectionException e) {
            throw new ConfigError(e);
        }

    }

    private void addQuickFixSource(String filename) throws ConfigError {
        URL resource = getResource(filename);
        configuration.addConfiguration(new QuickFixConfiguration(resource));
    }

    private void addXmlSource(String filename) throws ConfigError, ConfigurationException {
        URL resource = getResource(filename);
        configuration.addConfiguration(new XMLConfiguration(transform(resource)));
    }

    private void addPropertiesSource(String filename) throws ConfigError, ConfigurationException {
        URL resource = getResource(filename);
        configuration.addConfiguration(new PropertiesConfiguration(resource));
    }

    private URL getResource(String filename) throws ConfigError {
        URL resource = getClass().getClassLoader().getResource(filename);
        if (resource == null) {
            try {
                resource = new File(filename).toURL();
            } catch (MalformedURLException e) {
                throw new ConfigError(e);
            }
        }
        if (resource == null) {
            throw new ConfigError("can't locate config: " + filename);
        }
        return resource;
    }

    private File transform(URL resource) throws ConfigError {
        try {
            InputStream xslStream = getClass().getResourceAsStream("configurationAdapter.xsl");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            StreamSource streamSource = new StreamSource(xslStream);
            Transformer transformer = transformerFactory.newTransformer(streamSource);
            File transformedConfigFile = File.createTempFile("qfjconfig", "xml");
            transformedConfigFile.deleteOnExit();
            FileOutputStream transformedConfigStream = new FileOutputStream(transformedConfigFile);
            transformer.transform(
                    new javax.xml.transform.stream.StreamSource(resource.openStream()),
                    new javax.xml.transform.stream.StreamResult(transformedConfigStream));
            transformedConfigStream.close();
            return transformedConfigFile;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new ConfigError(e);
        }
    }

    private void initializeSettings() throws ConfigError {
        if (settings != null) {
            return;
        }

        settings = new SessionSettings();

        List sessionNames = configuration.getList("session");
        for (int i = 0; i < sessionNames.size(); i++) {
            String sessionName = (String) sessionNames.get(i);
            Configuration sessionConfig = getSessionConfiguration(sessionName);
            String beginString = sessionConfig.getString("BeginString");
            String senderCompID = sessionConfig.getString("SenderCompID");
            String targetCompID = sessionConfig.getString("TargetCompID");
            String sessionQualifier = sessionConfig.getString("SessionQualifier");
            if (beginString != null && senderCompID != null && targetCompID != null) {
                SessionID sessionID = new SessionID(beginString, senderCompID, targetCompID,
                        sessionQualifier);
                if (configuredSessionIDs.contains(sessionID)) {
                    throw new ConfigError(sessionID + " configured multiple times");
                }
                Iterator keys = sessionConfig.getKeys();
                while (keys.hasNext()) {
                    String key = (String) keys.next();
                    settings.setString(sessionID, key, sessionConfig.getString(key));
                }
                configuredSessionIDs.add(sessionID);
            }
        }
    }

    private Map configSubsetCache = new HashMap();

    private Configuration getSessionConfiguration(String sessionKey) {
        CompositeConfiguration sessionConfig = (CompositeConfiguration) configSubsetCache
                .get(sessionKey);
        if (sessionConfig == null) {
            sessionConfig = new CompositeConfiguration();
            Configuration leafConfiguration = configuration.subset(sessionKey);
            leafConfiguration.setProperty("session.name", sessionKey);
            sessionConfig.addConfiguration(leafConfiguration);
            List inherits = leafConfiguration.getList("inherit");
            for (int i = 0; i < inherits.size(); i++) {
                configuration.clearProperty(sessionKey + ".inherit");
                sessionConfig.addConfiguration(getSessionConfiguration((String) inherits.get(i)));
            }
            if (!DEFAULT_SESSION_KEY.equals(sessionKey)) {
                sessionConfig.addConfiguration(getSessionConfiguration(DEFAULT_SESSION_KEY));
            }
            configSubsetCache.put(sessionKey, sessionConfig);
        }
        return sessionConfig;
    }

    public CompositeConfiguration getConfiguration() {
        return configuration;
    }

    public SessionSettings getSessionSettings() {
        return settings;
    }

    public List getSessionNames() {
        return configuration.getList("session");
    }

    private final class ExtendedCompositeConfiguration extends CompositeConfiguration {
        // Workaround for bug in composite configuration
        public List getList(String key, List defaultValue) {
            int configurationCount = configuration.getNumberOfConfigurations();
            if (configurationCount == 1) {
                return super.getList(key);
            } else {
                List list = new ArrayList();
                for (int i = 0; i < configurationCount; i++) {
                    Configuration config = getConfiguration(i);
                    list.addAll(config.getList(key));
                }
                if (list.isEmpty()) {
                    return defaultValue;
                }
                return list;
            }
        }
    }

    private class QuickFixConfiguration extends MapConfiguration {
        public QuickFixConfiguration(URL filename) throws ConfigError {
            super(new HashMap());
            try {
                SessionSettings settings = new SessionSettings(filename.openStream());
                Iterator sections = settings.sectionIterator();
                while (sections.hasNext()) {
                    SessionID sessionID = (SessionID) sections.next();
                    Properties p = settings.getSessionProperties(sessionID);
                    Enumeration keys = p.keys();
                    while (keys.hasMoreElements()) {
                        String key = (String) keys.nextElement();
                        String configKey = sessionID.toString() + "." + key;
                        addProperty(configKey, p.getProperty(key));
                    }
                    addProperty("session", sessionID.toString());
                }
            } catch (IOException e) {
                throw new ConfigError(e);
            }
        }

        /*
         * Bug Fix for MapConfiguration, which doesn't correctly handle multiple
         * valued properties.
         * 
         * Commons Configuration 1.0 - Bugzilla
         */
        protected void addPropertyDirect(String key, Object obj) {
            Object currentValue = getProperty(key);
            if (currentValue == null) {
                getMap().put(key, obj);
            } else if (List.class.isAssignableFrom(currentValue.getClass())) {
                ((List) currentValue).add(obj);
            } else {
                List values = new ArrayList();
                values.add(currentValue);
                values.add(obj);
                getMap().put(key, values);
            }
        }
    }
}
