package org.quickfixj.jmx.mbean.stats;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.openmbean.OpenDataException;

import org.quickfixj.jmx.mbean.ObjectNameFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JamonJmxExporter {
    private Logger log = LoggerFactory.getLogger(getClass());

    public void export(MBeanServer mbeanServer) {
        try {
            JamonStatistics statistics = new JamonStatistics();
            ObjectNameFactory nameFactory = new ObjectNameFactory();
            nameFactory.addProperty("type", "Statistics");
            ObjectName statisticsName = nameFactory.createName();
            mbeanServer.registerMBean(statistics, statisticsName);
        } catch (OpenDataException e) {
            log.error(e.getMessage(), e);
        } catch (JMException e) {
            log.error(e.getMessage());
        }
    }
}
