package quickfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMessageTest {
    
    @Test
    public void canHandleSimpleMessage() {
        String order = "8=FIX.4.2\u00019=141\u000135=6\u000149=Target\u000156=Sender\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=059\u0001";
        SimpleMessage message = new SimpleMessage(order);
        assertEquals(order, message.toString());
    }

    @Test
    public void correctsLengthAndChecksum() {
        String provided = "8=FIX.4.2\u00019=14\u000135=6\u000149=Target\u000156=Sender\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=2\u0001";
        String corrected = "8=FIX.4.2\u00019=141\u000135=6\u000149=Target\u000156=Sender\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=059\u0001";
        SimpleMessage message = new SimpleMessage(provided);
        assertEquals(corrected, message.toString());
    }

    @Test
    public void canUpdateHeaderFields() {
        String order = "8=FIX.4.2\u00019=75\u000135=6\u000149=Target\u000156=Sender\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=200\u0001";
        SimpleMessage message = new SimpleMessage(order);
        message.setHeaderString(56, "Sender2");
        String reTargetedOrder = "8=FIX.4.2\u00019=142\u000135=6\u000149=Target\u000156=Sender2\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=110\u0001";
        assertEquals(reTargetedOrder, message.toString());
    }

    @Test
    public void outputSameAsMessage() throws InvalidMessage {
        String longChecksum = "8=FIX.4.2\u00019=141\u000135=6\u000149=Target\u000156=Sender\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=059\u0001";
        String shortChecksum = "8=FIX.4.2\u00019=141\u000135=6\u000149=Target\u000156=Sender\u0001128=BUYSIDE\u0001115=BIG-BANK-PLC\u000134=1\u000152=20160531-09:22:01.625" +
            "\u000111=clientOrder1\u00011=account2\u000159=0\u000160=20160531-09:22:01.625\u000110=59\u0001";
        SimpleMessage simpleMessage = new SimpleMessage(longChecksum);
        Message message = new Message(longChecksum);
        String longChecksumString = simpleMessage.toString();

        assertEquals(message.toString(), longChecksumString);
        simpleMessage = new SimpleMessage(shortChecksum);
        message = new Message(shortChecksum);
        String shortChecksumString = simpleMessage.toString();
        assertEquals(message.toString(),shortChecksumString);

        assertEquals(longChecksumString,shortChecksumString);
    }
}
