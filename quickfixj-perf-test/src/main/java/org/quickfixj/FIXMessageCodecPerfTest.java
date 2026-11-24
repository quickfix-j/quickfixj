package org.quickfixj;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import quickfix.field.AllocAccount;
import quickfix.field.AllocQty;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.OrdType;
import quickfix.field.OrderQty;
import quickfix.field.Price;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TransactTime;
import quickfix.fix44.NewOrderSingle;
import quickfix.mina.message.FIXMessageDecoder;
import quickfix.mina.message.FIXMessageEncoder;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * JMH benchmark measuring encoding and decoding performance of
 * {@link FIXMessageEncoder} and {@link FIXMessageDecoder} for a FIX 4.4
 * NewOrderSingle message, with and without a repeating group.
 */
public class FIXMessageCodecPerfTest extends AbstractPerfTest {

    private FIXMessageEncoder encoder;
    private FIXMessageDecoder decoder;

    private NewOrderSingle newOrderSingle;
    private NewOrderSingle newOrderSingleWithGroup;

    private IoBuffer bufferWithoutGroup;
    private IoBuffer bufferWithGroup;

    private final ProtocolEncoderOutput encoderOutput = new ProtocolEncoderOutput() {
        @Override
        public void write(Object message) {
            // discard – we only measure encoding time
        }
    };

    private final ProtocolDecoderOutput decoderOutput = new ProtocolDecoderOutput() {
        @Override
        public void write(Object message) {
            // discard – we only measure decoding time
        }

        @Override
        public void flush(IoFilter.NextFilter nextFilter, IoSession session) {
        }
    };

    @Setup
    public void prepare() throws Exception {
        encoder = new FIXMessageEncoder();
        decoder = new FIXMessageDecoder();

        newOrderSingle = buildNewOrderSingle();
        newOrderSingleWithGroup = buildNewOrderSingleWithGroup();

        bufferWithoutGroup = toIoBuffer(newOrderSingle.toString());
        bufferWithGroup = toIoBuffer(newOrderSingleWithGroup.toString());
    }

    private static NewOrderSingle buildNewOrderSingle() {
        NewOrderSingle order = new NewOrderSingle(
                new ClOrdID("ORDER-001"),
                new Side(Side.BUY),
                new TransactTime(LocalDateTime.of(2006, 3, 24, 1, 5, 58)),
                new OrdType(OrdType.LIMIT));
        order.set(new Symbol("AAPL"));
        order.set(new OrderQty(100));
        order.set(new Price(150.00));
        order.set(new HandlInst(HandlInst.AUTOMATED_EXECUTION_NO_INTERVENTION));
        return order;
    }

    private static NewOrderSingle buildNewOrderSingleWithGroup() {
        NewOrderSingle order = buildNewOrderSingle();

        NewOrderSingle.NoAllocs alloc1 = new NewOrderSingle.NoAllocs();
        alloc1.set(new AllocAccount("ACC1"));
        alloc1.set(new AllocQty(50));
        order.addGroup(alloc1);

        NewOrderSingle.NoAllocs alloc2 = new NewOrderSingle.NoAllocs();
        alloc2.set(new AllocAccount("ACC2"));
        alloc2.set(new AllocQty(50));
        order.addGroup(alloc2);

        return order;
    }

    private static IoBuffer toIoBuffer(String message) {
        byte[] bytes = message.getBytes(StandardCharsets.ISO_8859_1);
        IoBuffer buffer = IoBuffer.allocate(bytes.length);
        buffer.put(bytes);
        buffer.flip();
        return buffer;
    }

    @Benchmark
    public void encodeWithoutGroup() throws ProtocolCodecException {
        encoder.encode(null, newOrderSingle, encoderOutput);
    }

    @Benchmark
    public void encodeWithGroup() throws ProtocolCodecException {
        encoder.encode(null, newOrderSingleWithGroup, encoderOutput);
    }

    @Benchmark
    public void decodeWithoutGroup() throws ProtocolCodecException {
        bufferWithoutGroup.rewind();
        decoder.decode(null, bufferWithoutGroup, decoderOutput);
    }

    @Benchmark
    public void decodeWithGroup() throws ProtocolCodecException {
        bufferWithGroup.rewind();
        decoder.decode(null, bufferWithGroup, decoderOutput);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + FIXMessageCodecPerfTest.class.getSimpleName() + ".*")
                .build();
        new Runner(opt).run();
    }
}
