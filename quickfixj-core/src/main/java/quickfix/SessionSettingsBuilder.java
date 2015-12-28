package quickfix;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SessionSettingsBuilder {

    private static final SessionSettingsLoader LEGACY = new SessionSettingsLoader.LegacyLoader();
    private static final SessionSettingsLoader YAML = new SessionSettingsLoader.YamlLoader();

    private SessionSettingsLoader loader;
    private Properties properties;

    public SessionSettingsBuilder() {
        this.properties = new Properties();
    }

    public SessionSettingsBuilder legacy() {
        this.loader = LEGACY;
        return this;
    }

    public SessionSettingsBuilder yaml() {
        this.loader = YAML;
        return this;
    }

    public SessionSettingsBuilder withProperties(Properties properties) {
        this.properties.clear();
        this.properties.putAll(properties);

        return this;
    }

    public SessionSettings build(String fileName) throws ConfigError {
        return this.loader.load(this.properties, this.getInputStream(fileName));
    }

    public SessionSettings build(InputStream in) throws ConfigError {
        return this.loader.load(this.properties, in);
    }

    private static InputStream getInputStream(String fileName) throws ConfigError{
        InputStream in = SessionSettingsBuilder.class.getClassLoader().getResourceAsStream(fileName);
        if (in == null) {
            try {
                in = new FileInputStream(fileName);
            } catch (final IOException e) {
                throw new ConfigError(e.getMessage());
            }
        } else {
            in = new BufferedInputStream(in);
        }

        return in;
    }
}
