package quickfix.mina.message;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.common.ByteBuffer;
import org.apache.mina.protocol.ProtocolDecoderOutput;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.ProtocolViolationException;
import org.apache.mina.protocol.codec.MessageDecoder;
import org.apache.mina.protocol.codec.MessageDecoderResult;

import quickfix.mina.CriticalSessionProtocolException;

public class FIXMessageDecoder implements MessageDecoder {
    private static final byte[] HEADER_PATTERN = "8=FIX.?.?\0019=".getBytes();
    private static final byte[] CHECKSUM_PATTERN = "10=???\001".getBytes();
    private static final byte[] LOGON_PATTERN = "\00135=A\001".getBytes();

    private Log log = LogFactory.getLog(getClass());

    // Parsing states
    private static final int SEEKING_HEADER = 1;
    private static final int PARSING_LENGTH = 2;
    private static final int READING_BODY = 3;
    private static final int PARSING_CHECKSUM = 4;

    private int state;
    private int bodyLength;
    private int messageStartPosition;
    private int bodyStartPosition;
    private int position;
    private String messageString;
    private int headerOffset;

    private void resetState() {
        state = SEEKING_HEADER;
        bodyLength = 0;
        messageStartPosition = 0;
        bodyStartPosition = 0;
        position = 0;
        messageString = null;
    }

    public FIXMessageDecoder() {
        resetState();
    }

    public MessageDecoderResult decodable(ProtocolSession session, ByteBuffer in) {
        headerOffset = indexOf(in, in.position(), HEADER_PATTERN);
        return headerOffset != -1 ? MessageDecoderResult.OK : MessageDecoderResult.NEED_DATA;
    }

    public MessageDecoderResult decode(ProtocolSession session, ByteBuffer in,
            ProtocolDecoderOutput out) throws ProtocolViolationException {
        while (true) {
            try {
                if (state == SEEKING_HEADER) {
                    
                    messageStartPosition = indexOf(in, in.position(), HEADER_PATTERN);
                    log.debug("found header");

                    position = messageStartPosition + HEADER_PATTERN.length;
                    state = PARSING_LENGTH;
                }
                if (state == PARSING_LENGTH) {
                    if (position >= in.limit()) {
                        break;
                    }
                    byte ch = in.get(position++);
                    while (Character.isDigit((char) ch)) {
                        bodyLength = bodyLength * 10 + (ch - '0');
                        if (position < in.limit()) {
                            ch = in.get(position++);
                        } else {
                            break;
                        }
                    }
                    if (ch == '\001') {
                        bodyStartPosition = position;
                        state = READING_BODY;
                        log.debug("reading body, length = " + bodyLength);
                    } else if (position < in.limit()) {
                        handleError(in, "Error in message length", false);
                    }
                }
                if (state == READING_BODY) {
                    if ((in.limit() - position) < bodyLength) {
                        break;
                    }
                    position += bodyLength;
                    state = PARSING_CHECKSUM;
                }
                if (state == PARSING_CHECKSUM) {
                    if (startsWith(in, position, CHECKSUM_PATTERN)) {
                        log.debug("parsing checksum");
                        position += CHECKSUM_PATTERN.length;
                    } else {
                        if (position + CHECKSUM_PATTERN.length < in.limit()) {
                            handleError(in, "did not find checksum field, bad length?", isLogon(in,
                                    messageStartPosition));
                            if (in.remaining() > 0) {
                                continue;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    messageString = getMessageString(in);
                    out.write(messageString);
                    resetState();
                    return MessageDecoderResult.OK;
                }
            } catch (Throwable t) {
                state = SEEKING_HEADER;
                if (t instanceof ProtocolViolationException) {
                    throw (ProtocolViolationException) t;
                } else {
                    throw new ProtocolViolationException(t);
                }
            }
        }
        return MessageDecoderResult.NEED_DATA;
    }

    private String getMessageString(ByteBuffer buffer) {
        byte[] data = new byte[position - messageStartPosition];
        buffer.position(messageStartPosition);
        buffer.get(data);
        return new String(data);
    }

    private void handleError(ByteBuffer buffer, String text, boolean disconnect)
            throws ProtocolViolationException {
        // FEATURE allow configurable recovery position
        //int newOffset = messageStartPosition + 1;
        // Following recovery position is compatible with QuickFIX C++
        // but drops messages unnecessarily in corruption scenarios.
        int newOffset = bodyStartPosition + bodyLength;
        int nextHeader = indexOf(buffer, newOffset, HEADER_PATTERN);
  
        if (nextHeader != -1) {
            buffer.position(nextHeader);
        } else {
            buffer.position(buffer.limit());
        }
        // TODO REVIEW how is this related to resetState?
        state = SEEKING_HEADER;
        position = 0;
        bodyLength = 0;
        if (disconnect) {
            throw new CriticalSessionProtocolException(text);
        }
    }

    private boolean isLogon(ByteBuffer buffer, int position) {
        return indexOf(buffer, position, LOGON_PATTERN) != -1;
    }

    private static int indexOf(ByteBuffer buffer, int position, byte[] data) {
        for (int offset = position, limit = buffer.limit() - data.length + 1; offset < limit; offset++) {
            if (buffer.get(offset) == data[0] && startsWith(buffer, offset, data)) {
                return offset;
            }
        }
        return -1;
    }

    private static boolean startsWith(ByteBuffer buffer, int bufferOffset, byte[] data) {
        if (bufferOffset + data.length > buffer.limit()) {
            return false;
        }
        for (int dataOffset = 0, bufferLimit = buffer.limit() - data.length + 1; dataOffset < data.length
                && bufferOffset < bufferLimit; dataOffset++, bufferOffset++) {
            if (buffer.get(bufferOffset) != data[dataOffset] && data[dataOffset] != '?') {
                return false;
            }
        }
        return true;
    }

}
