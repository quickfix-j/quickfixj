package quickfix.mina;

import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.common.Session;
import org.apache.mina.common.SessionConfig;
import org.apache.mina.io.socket.SocketSessionConfig;

import quickfix.FieldConvertError;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.IntConverter;

/**
 * This class holds the QFJ settings information related to networking options.
 */
public class NetworkingOptions {
    private Log log = LogFactory.getLog(getClass());
    private Boolean keepAlive;
    private Boolean oobInline;
    private Integer receiveBufferSize;
    private Boolean reuseAddress;
    private Integer sendBufferSize;
    private Integer sessionReceiveBufferSize;
    private Integer soLinger;
    private Boolean tcpNoDelay;
    private Integer trafficClass;

    public static final String SETTING_SOCKET_KEEPALIVE = "SocketKeepAlive";
    public static final String SETTING_SOCKET_OOBINLINE = "SocketOobInline";
    public static final String SETTING_SOCKET_RECEIVE_BUFFER_SIZE = "SocketReceiveBufferSize";
    public static final String SETTING_SOCKET_REUSE_ADDRESS = "SocketReuseAddress";
    public static final String SETTING_SOCKET_SEND_BUFFER_SIZE = "SocketSendBufferSize";
    public static final String SETTING_SESSION_RECEIVE_BUFFER_SIZE = "MinaSessionReceiveBufferSize";
    public static final String SETTING_SOCKET_LINGER = "SocketLinger";
    public static final String SETTING_SOCKET_TCP_NODELAY = "SocketTcpNoDelay";
    public static final String SETTING_SOCKET_TRAFFIC_CLASS = "SocketTrafficClass";

    public static final String IPTOC_LOWCOST = "IPTOS_LOWCOST";
    public static final String IPTOC_RELIABILITY = "IPTOS_RELIABILITY";
    public static final String IPTOC_THROUGHPUT = "IPTOS_THROUGHPUT";
    public static final String IPTOC_LOWDELAY = "IPTOS_LOWDELAY";
    public static final Map trafficClasses = new HashMap();
    static {
        trafficClasses.put(IPTOC_LOWCOST, new Integer(0x02));
        trafficClasses.put(IPTOC_RELIABILITY, new Integer(0x04));
        trafficClasses.put(IPTOC_THROUGHPUT, new Integer(0x08));
        trafficClasses.put(IPTOC_LOWDELAY, new Integer(0x10));
    }

    public NetworkingOptions(Properties properties) throws FieldConvertError {
        keepAlive = getBoolean(properties, SETTING_SOCKET_KEEPALIVE);
        oobInline = getBoolean(properties, SETTING_SOCKET_OOBINLINE);
        receiveBufferSize = getInteger(properties, SETTING_SOCKET_RECEIVE_BUFFER_SIZE);
        reuseAddress = getBoolean(properties, SETTING_SOCKET_REUSE_ADDRESS);
        sendBufferSize = getInteger(properties, SETTING_SOCKET_SEND_BUFFER_SIZE);
        sessionReceiveBufferSize = getInteger(properties, SETTING_SESSION_RECEIVE_BUFFER_SIZE);
        soLinger = getInteger(properties, SETTING_SOCKET_LINGER);
        tcpNoDelay = getBoolean(properties, SETTING_SOCKET_TCP_NODELAY);

        try {
            trafficClass = getInteger(properties, SETTING_SOCKET_TRAFFIC_CLASS);
        } catch (FieldConvertError e) {
            // Try parsing the enums
            String trafficClassEnumString = properties.getProperty(SETTING_SOCKET_TRAFFIC_CLASS);
            int trafficClassBits = 0;
            String[] trafficClassEnums = trafficClassEnumString.split("[,|]");
            for (int i = 0; i < trafficClassEnums.length; i++) {
                if (trafficClasses.containsKey(trafficClassEnums[i])) {
                    trafficClassBits |= ((Integer) trafficClasses.get(trafficClassEnums[i]))
                            .intValue();
                } else {
                    throw new FieldConvertError("Can't parse traffic class: "
                            + trafficClassEnums[i]);
                }
            }
            trafficClass = new Integer(trafficClassBits);
            log.info("Socket option: " + SETTING_SOCKET_TRAFFIC_CLASS + "= 0x"
                    + Integer.toHexString(trafficClassBits) + " (" + trafficClassEnumString + ")");
        }
    }

    private Boolean getBoolean(Properties properties, String key) throws FieldConvertError {
        Boolean value = properties.containsKey(key) ? new Boolean(BooleanConverter
                .convert(properties.getProperty(key))) : null;
        logOption(key, value);
        return value;
    }

    private void logOption(String key, Object value) {
        if (value != null) {
            log.info("Socket option: " + key + "=" + value);
        }
    }

    private Integer getInteger(Properties properties, String key) throws FieldConvertError {
        Integer value = properties.containsKey(key) ? new Integer(IntConverter.convert(properties
                .getProperty(key))) : null;
        logOption(key, value);
        return value;
    }

    public void apply(Session session) throws SocketException {
        SessionConfig sessionConfig = session.getConfig();
        if (sessionConfig instanceof SocketSessionConfig) {
            SocketSessionConfig socketSessionConfig = (SocketSessionConfig) sessionConfig;
            if (keepAlive != null) {
                socketSessionConfig.setKeepAlive(keepAlive.booleanValue());
            }
            if (oobInline != null) {
                socketSessionConfig.setOOBInline(oobInline.booleanValue());
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
            if (sessionReceiveBufferSize != null) {
                socketSessionConfig
                        .setSessionReceiveBufferSize(sessionReceiveBufferSize.intValue());
            }
            if (soLinger != null) {
                int linger = soLinger.intValue();
                socketSessionConfig.setSoLinger(linger > 0, linger);
            }
            if (tcpNoDelay != null) {
                socketSessionConfig.setTcpNoDelay(tcpNoDelay.booleanValue());
            }
            if (trafficClass != null) {
                socketSessionConfig.setTrafficClass(trafficClass.intValue());
            }
        }
    }

}
