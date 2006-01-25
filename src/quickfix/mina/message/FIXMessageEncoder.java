package quickfix.mina.message;

import java.util.HashSet;
import java.util.Set;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.protocol.ProtocolEncoderOutput;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.ProtocolViolationException;
import org.apache.mina.protocol.codec.MessageEncoder;

import quickfix.Message;
import edu.emory.mathcs.backport.java.util.Collections;

public class FIXMessageEncoder implements MessageEncoder {

    private static final Set TYPES;

    static {
        Set types = new HashSet();
        types.add(Message.class);
        types.add(String.class);
        TYPES = Collections.unmodifiableSet(types);
    }

    public Set getMessageTypes() {
        return TYPES;
    }

    public void encode(ProtocolSession session, Object message, ProtocolEncoderOutput out)
            throws ProtocolViolationException {
        String fixMessageString;
        if (message instanceof String) {
            fixMessageString = (String) message;
        } else {
            try {
                fixMessageString = ((Message) message).toString();
            } catch (ClassCastException e) {
                throw new ProtocolViolationException("Invalid FIX message object type: "
                        + message.getClass(), e);
            }
        }

        ByteBuffer buffer = ByteBuffer.allocate(fixMessageString.length());
        buffer.put(fixMessageString.getBytes());
        buffer.flip();
        out.write(buffer);
    }

}
