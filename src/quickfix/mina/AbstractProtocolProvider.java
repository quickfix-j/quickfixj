package quickfix.mina;

import org.apache.mina.protocol.ProtocolCodecFactory;
import org.apache.mina.protocol.ProtocolProvider;

import quickfix.mina.message.FIXProtocolCodecFactory;

public abstract class AbstractProtocolProvider implements ProtocolProvider {

    private static final FIXProtocolCodecFactory CODEC_FACTORY = new FIXProtocolCodecFactory();

    public ProtocolCodecFactory getCodecFactory() {
        return CODEC_FACTORY;
    }
}
