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

package quickfix.mina;

import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.mina.common.IoSession;
import org.apache.mina.common.IoSessionConfig;
import org.apache.mina.transport.socket.nio.SocketSessionConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.FieldConvertError;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.IntConverter;

/**
 * This class holds the QFJ settings information related to networking options.
 */
public class NetworkingOptions {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final Boolean keepAlive;
    private final Boolean oobInline;
    private final Integer receiveBufferSize;
    private final Boolean reuseAddress;
    private final Integer sendBufferSize;
    private final Integer soLinger;
    private final Boolean tcpNoDelay;
    private final Integer trafficClass;
    private final Boolean synchronousWrites;
    private final Integer synchronousWriteTimeout;
    
    public static final String SETTING_SOCKET_KEEPALIVE = "SocketKeepAlive";
    public static final String SETTING_SOCKET_OOBINLINE = "SocketOobInline";
    public static final String SETTING_SOCKET_RECEIVE_BUFFER_SIZE = "SocketReceiveBufferSize";
    public static final String SETTING_SOCKET_REUSE_ADDRESS = "SocketReuseAddress";
    public static final String SETTING_SOCKET_SEND_BUFFER_SIZE = "SocketSendBufferSize";
    public static final String SETTING_SOCKET_LINGER = "SocketLinger";
    public static final String SETTING_SOCKET_TCP_NODELAY = "SocketTcpNoDelay";
    public static final String SETTING_SOCKET_TRAFFIC_CLASS = "SocketTrafficClass";
    public static final String SETTING_SOCKET_SYNCHRONOUS_WRITES = "SocketSynchronousWrites";
    public static final String SETTING_SOCKET_SYNCHRONOUS_WRITE_TIMEOUT = "SocketSynchronousWriteTimeout";

    public static final String IPTOC_LOWCOST = "IPTOS_LOWCOST";
    public static final String IPTOC_RELIABILITY = "IPTOS_RELIABILITY";
    public static final String IPTOC_THROUGHPUT = "IPTOS_THROUGHPUT";
    public static final String IPTOC_LOWDELAY = "IPTOS_LOWDELAY";
    public static final Map<String, Integer> trafficClasses = new HashMap<String, Integer>();
    static {
        trafficClasses.put(IPTOC_LOWCOST, Integer.valueOf(0x02));
        trafficClasses.put(IPTOC_RELIABILITY, Integer.valueOf(0x04));
        trafficClasses.put(IPTOC_THROUGHPUT, Integer.valueOf(0x08));
        trafficClasses.put(IPTOC_LOWDELAY, Integer.valueOf(0x10));
    }

    public NetworkingOptions(Properties properties) throws FieldConvertError {
        keepAlive = getBoolean(properties, SETTING_SOCKET_KEEPALIVE, null);
        oobInline = getBoolean(properties, SETTING_SOCKET_OOBINLINE, null);
        receiveBufferSize = getInteger(properties, SETTING_SOCKET_RECEIVE_BUFFER_SIZE, null);
        reuseAddress = getBoolean(properties, SETTING_SOCKET_REUSE_ADDRESS, null);
        sendBufferSize = getInteger(properties, SETTING_SOCKET_SEND_BUFFER_SIZE, null);
        soLinger = getInteger(properties, SETTING_SOCKET_LINGER, null);
        tcpNoDelay = getBoolean(properties, SETTING_SOCKET_TCP_NODELAY, Boolean.TRUE);
        synchronousWrites = getBoolean(properties, SETTING_SOCKET_SYNCHRONOUS_WRITES, Boolean.FALSE);
        synchronousWriteTimeout = getInteger(properties, SETTING_SOCKET_SYNCHRONOUS_WRITE_TIMEOUT, 30000);
        
        Integer trafficClassSetting;
        try {
            trafficClassSetting = getInteger(properties, SETTING_SOCKET_TRAFFIC_CLASS, null);
        } catch (FieldConvertError e) {
            // Try parsing the enums
            String trafficClassEnumString = properties.getProperty(SETTING_SOCKET_TRAFFIC_CLASS);
            int trafficClassBits = 0;
            String[] trafficClassEnums = trafficClassEnumString.split("[,|]");
            for (int i = 0; i < trafficClassEnums.length; i++) {
                if (trafficClasses.containsKey(trafficClassEnums[i])) {
                    trafficClassBits |= trafficClasses.get(trafficClassEnums[i])
                            .intValue();
                } else {
                    throw new FieldConvertError("Can't parse traffic class: "
                            + trafficClassEnums[i]);
                }
            }
            trafficClassSetting = Integer.valueOf(trafficClassBits);
            log.info("Socket option: " + SETTING_SOCKET_TRAFFIC_CLASS + "= 0x"
                    + Integer.toHexString(trafficClassBits) + " (" + trafficClassEnumString + ")");
        }
        
        trafficClass = trafficClassSetting;
    }

    private Boolean getBoolean(Properties properties, String key, Boolean defaultValue) throws FieldConvertError {
        Boolean value = properties.containsKey(key) ? Boolean.valueOf(BooleanConverter
                .convert(properties.getProperty(key))) : defaultValue;
        logOption(key, value);
        return value;
    }

    private void logOption(String key, Object value) {
        if (value != null) {
            log.info("Socket option: " + key + "=" + value);
        }
    }

    private Integer getInteger(Properties properties, String key, Integer defaultValue) throws FieldConvertError {
        Integer value = properties.containsKey(key) ? Integer.valueOf(IntConverter.convert(properties
                .getProperty(key))) : defaultValue;
        logOption(key, value);
        return value;
    }

    public void apply(IoSession session) throws SocketException {
        IoSessionConfig sessionConfig = session.getConfig();
        if (sessionConfig instanceof SocketSessionConfig) {
            SocketSessionConfig socketSessionConfig = (SocketSessionConfig) sessionConfig;
            if (keepAlive != null) {
                socketSessionConfig.setKeepAlive(keepAlive.booleanValue());
            }
            if (oobInline != null) {
                socketSessionConfig.setOobInline(oobInline.booleanValue());
            }
            if (receiveBufferSize != null) {
                socketSessionConfig.setReceiveBufferSize(receiveBufferSize.intValue());
            }
            if (reuseAddress != null) {
                socketSessionConfig.setReuseAddress(reuseAddress.booleanValue());
            }
            if (sendBufferSize != null) {
                socketSessionConfig.setSendBufferSize(sendBufferSize.intValue());
            }
            if (soLinger != null) {
                int linger = soLinger.intValue();
                socketSessionConfig.setSoLinger(linger);
            }
            if (tcpNoDelay != null) {
                socketSessionConfig.setTcpNoDelay(tcpNoDelay.booleanValue());
            }
            if (trafficClass != null) {
                socketSessionConfig.setTrafficClass(trafficClass.intValue());
            }
        }
    }

    public Boolean getSynchronousWrites() {
        return synchronousWrites;
    }
    
    public Integer getSynchronousWriteTimeout() {
        return synchronousWriteTimeout;
    }
}
