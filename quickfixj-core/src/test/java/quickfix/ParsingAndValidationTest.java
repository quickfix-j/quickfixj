package quickfix;

import org.junit.Test;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static quickfix.SessionTestSupport.logonTo;

public class ParsingAndValidationTest {
    @Test
    public void parseAndValidate_with_weakSessionParsing()
            throws InvalidMessage, RejectLogon, UnsupportedMessageType,
                    IncorrectTagValue, FieldNotFound, IncorrectDataFormat, IOException {
        String messageWithBars = "8=FIX.4.4|9=168|35=R|34=2|49=FXAMCOREQA2|56=RBOSRQ|52=20211008-13:24:55.066|131=18237830774659684985163369949506|146=1|55=EUR/USD|38=1500000.00|15=EUR|303=102|64=20211215|1=21339|63=B|10=107|";
        String messageString = messageWithBars.replaceAll("\\|","\001");
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = new SessionFactoryTestSupport.Builder()
            .setSessionId(sessionID).setApplication(application)
            .setIsInitiator(false)
            .setDataDictionaryProvider(null)
            .setResetOnLogon(false)
            .setValidateSequenceNumbers(true)
            .setPersistMessages(true)
            .setWeakParsingMode(Message.WeakParsingMode.ENABLED)
            .build();

        logonTo(session);

        Message message = MessageUtils.parse(session, messageString);
        session.next(message);
        assertNotNull(application.lastFromAppMessage());
    }

    @Test
    public void parseAndValidate_with_weakSessionParsing_and_dictionary_passes_message_to_app()
        throws InvalidMessage, RejectLogon, UnsupportedMessageType,
        IncorrectTagValue, FieldNotFound, IncorrectDataFormat, IOException {
        String messageWithBars = "8=FIX.4.4|9=168|35=R|34=2|49=FXAMCOREQA2|56=RBOSRQ|52=20211008-13:24:55.066|131=18237830774659684985163369949506|146=1|55=EUR/USD|38=1500000.00|15=EUR|303=102|64=20211215|1=21339|63=B|10=105|";
        String messageString = messageWithBars.replaceAll("\\|","\001");
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = new SessionFactoryTestSupport.Builder()
            .setSessionId(sessionID).setApplication(application)
            .setIsInitiator(false)
            .setDataDictionaryProvider(new DefaultDataDictionaryProvider())
            .setResetOnLogon(false)
            .setValidateSequenceNumbers(true)
            .setPersistMessages(true)
            .setWeakParsingMode(Message.WeakParsingMode.ENABLED)
            .build();

        logonTo(session);

        Message message = MessageUtils.parse(session, messageString);
        session.next(message);
        assertNotNull(application.lastFromAppMessage());
    }

    @Test
    public void parseAndValidate_with_weakSessionParsingDisabled_and_dictionary_does_not_pass_message_to_app()
        throws InvalidMessage, RejectLogon, UnsupportedMessageType,
        IncorrectTagValue, FieldNotFound, IncorrectDataFormat, IOException {
        String messageWithBars = "8=FIX.4.4|9=168|35=R|34=2|49=FXAMCOREQA2|56=RBOSRQ|52=20211008-13:24:55.066|131=18237830774659684985163369949506|146=1|55=EUR/USD|38=1500000.00|15=EUR|303=102|64=20211215|1=21339|63=B|10=105|";
        String messageString = messageWithBars.replaceAll("\\|","\001");
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = new SessionFactoryTestSupport.Builder()
            .setSessionId(sessionID).setApplication(application)
            .setIsInitiator(false)
            .setDataDictionaryProvider(new DefaultDataDictionaryProvider())
            .setResetOnLogon(false)
            .setValidateSequenceNumbers(true)
            .setPersistMessages(true)
            .setWeakParsingMode(Message.WeakParsingMode.DISABLED)
            .build();

        logonTo(session);

        Message message = MessageUtils.parse(session, messageString);
        session.next(message);
        assertNull(application.lastFromAppMessage());
    }

    @Test
    public void parseAndValidate_with_weakSessionParsingFallback_and_dictionary_passes_message_to_app()
        throws InvalidMessage, RejectLogon, UnsupportedMessageType,
        IncorrectTagValue, FieldNotFound, IncorrectDataFormat, IOException {
        String messageWithBars = "8=FIX.4.4|9=168|35=R|34=2|49=FXAMCOREQA2|56=RBOSRQ|52=20211008-13:24:55.066|131=18237830774659684985163369949506|146=1|55=EUR/USD|38=1500000.00|15=EUR|303=102|64=20211215|1=21339|63=B|10=105|";
        String messageString = messageWithBars.replaceAll("\\|","\001");
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = new SessionFactoryTestSupport.Builder()
            .setSessionId(sessionID).setApplication(application)
            .setIsInitiator(false)
            .setDataDictionaryProvider(new DefaultDataDictionaryProvider())
            .setResetOnLogon(false)
            .setValidateSequenceNumbers(true)
            .setPersistMessages(true)
            .setWeakParsingMode(Message.WeakParsingMode.FALLBACK)
            .build();

        logonTo(session);

        Message message = MessageUtils.parse(session, messageString);
        session.next(message);
        assertNotNull(application.lastFromAppMessage());
        assertNull(application.lastFromAppMessage().getException());
    }
}
