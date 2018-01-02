package quickfix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import quickfix.field.TimeUnit;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
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
    public void constructor_with_StartTime_and_no_EndTime() throws ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        assertThrows(ConfigError.class, () -> new DefaultSessionSchedule(sessionSettings, sessionID));
    }

    @Test
    public void constructor_with_EndTime_and_no_StartTime() throws ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "EndTime=00:00:00\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        assertThrows(ConfigError.class, () -> new DefaultSessionSchedule(sessionSettings, sessionID));
    }

    @Test
    public void constructor_with_StartDay_and_no_EndDay() throws ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:00\n"
            + "StartDay=Monday\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        assertThrows(ConfigError.class, () -> new DefaultSessionSchedule(sessionSettings, sessionID));
    }

    @Test
    public void constructor_with_EndDay_and_no_StartDay() throws ConfigError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:00\n"
            + "EndDay=Monday\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        assertThrows(ConfigError.class, () -> new DefaultSessionSchedule(sessionSettings, sessionID));
    }

    @Test
    public void constructor_with_TimePeriods() throws ConfigError, FieldConvertError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "TimePeriods=Monday 00:00:00>Tuesday 00:00:00\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        new DefaultSessionSchedule(sessionSettings, sessionID);
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
    public void isSessionTime_returns_true_for_NON_STOP_session() throws FieldConvertError, ConfigError {
        when(mockTimeSource.getTime()).thenReturn(1L);
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

        assertTrue(schedule.isSessionTime());
    }

    @Test
    public void isSessionTime_returns_true_for_DAILY_session_for_time_within_window() throws FieldConvertError, ConfigError {
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
    public void isSessionTime_returns_false_for_DAILY_session_for_time_outside_window() throws FieldConvertError, ConfigError {
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

    @Test
    public void isSessionTime_returnYes_true_for_WEEKDAYS_session_for_time_inside_window() throws FieldConvertError, ConfigError {
        when(mockTimeSource.getTime()).thenReturn(1658241033266L);
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "Weekdays=Tuesday\n"
            + "StartTime=10:00:00\n"
            + "EndTime=20:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertTrue(schedule.isSessionTime());
    }

    @Test
    public void isSessionTime_returns_true_for_TIME_PERIODS_session_for_time_inside_window() throws FieldConvertError, ConfigError {
        when(mockTimeSource.getTime()).thenReturn(1658241033266L);
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "TimePeriods=Tuesday 00:00:02>Wednesday 00:00:03\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertTrue(schedule.isSessionTime());
    }

    @Test
    public void isSessionTime_returns_true_for_TIME_PERIODS_session_for_time_inside_second_window() throws FieldConvertError, ConfigError {
        when(mockTimeSource.getTime()).thenReturn(1658241033266L);
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "TimePeriods=Monday 00:00:00>Tuesday 00:00:01,Tuesday 00:00:02>Wednesday 00:00:03\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertTrue(schedule.isSessionTime());
    }

    @Test
    public void toString_with_NonStopSession() throws ConfigError, FieldConvertError {
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

        assertEquals("non-stop", schedule.toString());
    }

    @Test
    public void toString_with_noStartDayOrWeekdays() throws ConfigError, FieldConvertError {
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

        assertEquals("daily: 00:00:00-UTC - 00:00:01-UTC", schedule.toString());
    }

    @Test
    public void toString_with_StartDay() throws ConfigError, FieldConvertError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "StartDay=Monday\n"
            + "EndDay=Friday\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertEquals("weekly: MON 00:00:00-UTC - FRI 00:00:01-UTC", schedule.toString());
    }

    @Test
    public void toString_with_Weekdays() throws ConfigError, FieldConvertError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "Weekdays=Monday,Tuesday\n"
            + "StartTime=00:00:00\n"
            + "EndTime=00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertEquals("weekdays: MON, TUE, 00:00:00-UTC - 00:00:01-UTC", schedule.toString());
    }

    @Test
    public void toString_with_TimePeriods() throws ConfigError, FieldConvertError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "TimePeriods=Monday 00:00:00>Tuesday 00:00:01\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertEquals("periods: MON 00:00:00-UTC - TUE 00:00:01-UTC", schedule.toString());
    }

    @Test
    public void toString_with_multipleTimePeriods() throws ConfigError, FieldConvertError {
        String sessionSettingsString = ""
            + "[DEFAULT]\n"
            + "NonStopSession=N\n"
            + "\n"
            + "[SESSION]\n"
            + "BeginString=FIX.4.2\n"
            + "SenderCompID=A\n"
            + "TargetCompID=B\n"
            + "TimePeriods=Monday 00:00:00>Tuesday 00:00:01,Tuesday 00:00:02>Wednesday 00:00:03\n";
        SessionSettings sessionSettings = new SessionSettings(new ByteArrayInputStream(sessionSettingsString.getBytes()));
        DefaultSessionSchedule schedule = new DefaultSessionSchedule(sessionSettings, sessionID);

        assertEquals("periods: MON 00:00:00-UTC - TUE 00:00:01-UTC, TUE 00:00:02-UTC - WED 00:00:03-UTC", schedule.toString());
    }
}
