package quickfix;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EmailThreadID;
import quickfix.field.EmailType;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.SenderCompID;
import quickfix.field.Subject;
import quickfix.field.TargetCompID;
import quickfix.fix50.Email;
import junit.framework.TestCase;

public class MessageParserTest extends TestCase {
    
    public void testParse() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new quickfix.fix40.MessageFactory());
        String messageString = "8=FIX.4.0\0019=56\00135=A\00134=1\00149=TW\001" +
            "52=20060118-16:34:19\00156=ISLD\00198=0\001108=2\00110=223\001";

        Message message = MessageParser.parse(mockSession, messageString);

        assertThat(message, is(notNullValue()));
    }
    
    public void testParseFixt() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new quickfix.fix40.MessageFactory());

        Email email = new Email(new EmailThreadID("THREAD_ID"), new EmailType(EmailType.NEW), new Subject("SUBJECT"));
        email.getHeader().setField(new ApplVerID(ApplVerID.FIX42));
        email.getHeader().setField(new SenderCompID("SENDER"));
        email.getHeader().setField(new TargetCompID("TARGET"));

        Message message = MessageParser.parse(mockSession, email.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, is(quickfix.fix40.Email.class));
    }
    

    public void testParseFixtLogon() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new DefaultMessageFactory());

        quickfix
        
        .fixt11.Logon logon = new quickfix.fixt11.Logon(new EncryptMethod(EncryptMethod.NONE_OTHER), new HeartBtInt(30),
                new DefaultApplVerID(ApplVerID.FIX42));

        Message message = MessageParser.parse(mockSession, logon.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, is(quickfix.fixt11.Logon.class));
    }

    public void testParseFix50() throws Exception {
        Session mockSession = mock(Session.class);
        DataDictionaryProvider mockDataDictionaryProvider = mock(DataDictionaryProvider.class);
        stub(mockSession.getDataDictionaryProvider()).toReturn(mockDataDictionaryProvider);
        stub(mockSession.getMessageFactory()).toReturn(new DefaultMessageFactory());

        Email email = new Email(new EmailThreadID("THREAD_ID"), new EmailType(EmailType.NEW), new Subject("SUBJECT"));
        email.getHeader().setField(new ApplVerID(ApplVerID.FIX50));
        email.getHeader().setField(new SenderCompID("SENDER"));
        email.getHeader().setField(new TargetCompID("TARGET"));

        Message message = MessageParser.parse(mockSession, email.toString());

        assertThat(message, is(notNullValue()));
        assertThat(message, is(quickfix.fix50.Email.class));
    }
}
