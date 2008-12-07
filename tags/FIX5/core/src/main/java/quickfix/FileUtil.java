/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileUtil {
    public static String fileAppendPath(String pathPrefix, String pathSuffix) {
        return pathPrefix + (pathPrefix.endsWith(File.separator) ? "" : File.separator)
                + pathSuffix;
    }

    public static String sessionIdFileName(SessionID sessionID) {
        return sessionID.getBeginString() + "-" + sessionID.getSenderCompID()
                + optionalField("_", sessionID.getSenderSubID())
                + optionalField("_", sessionID.getSenderLocationID()) + "-"
                + sessionID.getTargetCompID() + optionalField("_", sessionID.getTargetSubID())
                + optionalField("_", sessionID.getTargetLocationID())
                + optionalField("-", sessionID.getSessionQualifier());
    }

    private static String optionalField(String delim, String value) {
        return !value.equals(SessionID.NOT_SET) ? delim + value : "";
    }

    public enum Location {
        /**
         * Load from the filesystem.
         */
        FILESYSTEM,

        /*
         * Load from the thread's context class loader
         */
        CONTEXT_RESOURCE,

        /**
         * Load a class resource
         */
        CLASS_RESOURCE,

        /**
         * Load a resource from the classpath
         */
        CLASSLOADER_RESOURCE,

        /**
         * Load a resource identified by an URI
         */
        URL
    };

    /**
     * Attempt to open a file/resource from a series of locations. This method is
     * convenient but may not provide enough feedback (e.g., malformed URL) for some
     * uses. The series of locations tried is the filesystem, thread context
     * class loader, class resource, classloader (system classpath resource), and URL.
     * @param clazz
     * @param name
     * @return input stream if found, or null otherwise.
     */
    public static InputStream open(Class<?> clazz, String name) {
        return open(clazz, name, Location.FILESYSTEM, 
                Location.CONTEXT_RESOURCE, Location.CLASS_RESOURCE,
                Location.CLASSLOADER_RESOURCE, Location.URL);
    }

    /**
     * Attempt to open a file/resource from a series of locations. This method is
     * convenient but may not provide enough feedback (e.g., malformed URL) for some
     * uses.
     * 
     * @param clazz a class (can be null) for resource searches
     * @param name the name of the file/resource
     * @param locations a series of locations that will be searched.
     * @return an input stream or null if the file/resource could not be found.
     */
    public static InputStream open(Class<?> clazz, String name, Location... locations) {
        InputStream in = null;
        for (int i = 0; i < locations.length; i++) {
            switch (locations[i]) {
            case FILESYSTEM:
                try {
                    in = new FileInputStream(name);
                } catch (FileNotFoundException e) {
                    // ignore
                }
                break;
            case CONTEXT_RESOURCE:
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null) {
                    in = contextClassLoader.getResourceAsStream(name);
                }
                break;
            case CLASS_RESOURCE:
                if (clazz != null) {
                    in = clazz.getResourceAsStream(name);
                }
                break;
            case CLASSLOADER_RESOURCE:
                if (clazz != null) {
                    in = clazz.getClassLoader().getResourceAsStream(name);
                }
                break;
            case URL:
                try {
                    in = new URL(name).openStream();
                } catch (MalformedURLException e) {
                    // ignore
                } catch (IOException e) {
                    // ignore
                }
                break;
            }
            if (in != null) {
                break;
            }
        }

        return in;
    }
}