package quickfix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class DefaultSessionScheduleTest {

    private SessionID sessionID;
    @Mock
    private SystemTimeSource mockTimeSource;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);

        sessionID = new SessionID("FIX.4.2:A->B");
        SystemTime.setTimeSource(mockTimeSource);
    }

    @After
    public void after() {
        SystemTime.setTimeSource(null);
    }

    @Test
    public void isNonStopSession_returns_true_when_SETTING_NON_STOP_SESSION_Y() throws FieldConvertError, ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=Y\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertTrue(schedule.isNonStopSession());
    }

    @Test
    public void isNonStopSession_returns_false_when_SETTING_NON_STOP_SESSION_N() throws FieldConvertError, ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertFalse(schedule.isNonStopSession());
    }

    @Test
    public void isNonStopSession_returns_false_when_SETTING_NON_STOP_SESSION_not_present() throws FieldConvertError, ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertFalse(schedule.isNonStopSession());
    }

    @Test
    public void isSessionTime_returns_true_for_time_within_window() throws FieldConvertError, ConfigError {
        when(mockTimeSource.getTime()).thenReturn(1L);
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertTrue(schedule.isSessionTime());
    }

    @Test
    public void isSessionTime_returns_false_for_time_outside_window() throws FieldConvertError, ConfigError {
        when(mockTimeSource.getTime()).thenReturn(2000L);
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertFalse(schedule.isSessionTime());
    }
}
