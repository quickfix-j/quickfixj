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

import quickfix.field.ApplVerID;
import quickfix.field.MsgType;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import static quickfix.FixVersions.BEGINSTRING_FIX40;
import static quickfix.FixVersions.BEGINSTRING_FIX41;
import static quickfix.FixVersions.BEGINSTRING_FIX42;
import static quickfix.FixVersions.BEGINSTRING_FIX43;
import static quickfix.FixVersions.BEGINSTRING_FIX44;
import static quickfix.FixVersions.BEGINSTRING_FIXT11;
import static quickfix.FixVersions.FIX50;
import static quickfix.FixVersions.FIX50SP1;
import static quickfix.FixVersions.FIX50SP2;
import static quickfix.FixVersions.FIXLATEST;

/**
 * The default factory for creating FIX message instances.
 */
public class DefaultMessageFactory implements MessageFactory {
    private final Map<String, MessageFactory> messageFactories = new ConcurrentHashMap<>();

    private final ApplVerID defaultApplVerID;

    /**
     * Constructs a DefaultMessageFactory, which dynamically loads and delegates to
     * the default version-specific message factories, if they are available at runtime.
     * <p>
     * Callers can set the {@link Thread#setContextClassLoader context classloader},
     * which will be used to load the classes if {@link Class#forName Class.forName}
     * fails to do so (e.g. in an OSGi environment).
     * <p>
     * Equivalent to {@link #DefaultMessageFactory(String) DefaultMessageFactory}({@link ApplVerID#FIX50 ApplVerID.FIX50}).
     */
    public DefaultMessageFactory() {
        this(ApplVerID.FIX50SP2);
    }

    /**
     * Constructs a DefaultMessageFactory, which dynamically loads and delegates to
     * the default version-specific message factories, if they are available at runtime.
     * <p>
     * Callers can set the {@link Thread#setContextClassLoader context classloader},
     * which will be used to load the classes if {@link Class#forName Class.forName}
     * fails to do so (e.g. in an OSGi environment).
     *
     * @param defaultApplVerID ApplVerID value used by default for {@link #create(String, ApplVerID, String)}
     */
    public DefaultMessageFactory(String defaultApplVerID) {
        Objects.requireNonNull(defaultApplVerID, "defaultApplVerID");

        this.defaultApplVerID = new ApplVerID(defaultApplVerID);

        // To loosen the coupling between this factory and generated code, the
        // message factories are discovered at run time using reflection
        addFactory(BEGINSTRING_FIX40);
        addFactory(BEGINSTRING_FIX41);
        addFactory(BEGINSTRING_FIX42);
        addFactory(BEGINSTRING_FIX43);
        addFactory(BEGINSTRING_FIX44);
        addFactory(BEGINSTRING_FIXT11);
        addFactory(FIX50);
        addFactory(FIX50SP1);
        addFactory(FIX50SP2);
        addFactory(FIXLATEST);
    }

    private void addFactory(String beginString) {
        String packageVersion = beginString.replace(".", "").toLowerCase();
        try {
            addFactory(beginString, "quickfix." + packageVersion + ".MessageFactory");
        } catch (ClassNotFoundException e) {
            // ignore - this factory is not available
        }
    }

    /**
     * Adds a factory of the given class, which will be delegated to for creating
     * Message instances from messages with the given begin string.
     * <p>
     * Callers can set the {@link Thread#setContextClassLoader context classloader},
     * which will be used to load the classes if {@link Class#forName Class.forName}
     * fails to do so (e.g. in an OSGi environment).
     *
     * @param beginString the begin string whose messages will be delegated to the factory
     * @param factoryClassName the name of the factory class to instantiate and add
     * @throws ClassNotFoundException if the named factory class cannot be found
     * @throws RuntimeException if the named factory class cannot be instantiated
     */
    @SuppressWarnings("unchecked")
    public void addFactory(String beginString, String factoryClassName) throws ClassNotFoundException {
        // try to load the class
        Class<? extends MessageFactory> factoryClass = null;
        try {
            // try using our own classloader
            factoryClass = (Class<? extends MessageFactory>) Class.forName(factoryClassName);
        } catch (ClassNotFoundException e) {
                // try using context classloader (i.e. allow caller to specify it)
            Thread.currentThread().getContextClassLoader().loadClass(factoryClassName);
        }
        // if factory is found, add it
        if (factoryClass != null) {
            addFactory(beginString, factoryClass);
        }
    }

    /**
     * Adds a factory of the given class, which will be delegated to for creating
     * Message instances from messages with the given begin string.
     *
     * @param beginString the begin string whose messages will be delegated to the factory
     * @param factoryClass the class of the factory to instantiate and add
     * @throws RuntimeException if the given factory class cannot be instantiated
     */
    public void addFactory(String beginString, Class<? extends MessageFactory> factoryClass) {
        try {
            MessageFactory factory = factoryClass.newInstance();
            messageFactories.put(beginString, factory);
        } catch (Exception e) {
            throw new RuntimeException("can't instantiate " + factoryClass.getName(), e);
        }
    }

    @Override
    public Message create(String beginString, String msgType) {
        return create(beginString, defaultApplVerID, msgType);
    }

    @Override
    public Message create(String beginString, ApplVerID applVerID, String msgType) {
        MessageFactory messageFactory = messageFactories.get(beginString);
        if (beginString.equals(BEGINSTRING_FIXT11) && !MessageUtils.isAdminMessage(msgType)) {
            if (applVerID == null) {
                applVerID = new ApplVerID(defaultApplVerID.getValue());
            }
            messageFactory = messageFactories.get(MessageUtils.toBeginString(applVerID));
        }

        if (messageFactory != null) {
            return messageFactory.create(beginString, applVerID, msgType);
        }

        Message message = new Message();
        message.getHeader().setString(MsgType.FIELD, msgType);

        return message;
    }

    public Group create(String beginString, String msgType, int correspondingFieldID) {
        MessageFactory messageFactory = messageFactories.get(beginString);
        if (messageFactory != null) {
            return messageFactory.create(beginString, msgType, correspondingFieldID);
        }
        throw new IllegalArgumentException("Unsupported FIX version: " + beginString);
    }
}
