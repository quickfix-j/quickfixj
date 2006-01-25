package quickfix.mina.message;

import org.apache.mina.protocol.codec.DemuxingProtocolCodecFactory;

public class FIXProtocolCodecFactory extends DemuxingProtocolCodecFactory {

    public FIXProtocolCodecFactory() {
        super.register(FIXMessageDecoder.class);
        super.register(FIXMessageEncoder.class);
    }
}
