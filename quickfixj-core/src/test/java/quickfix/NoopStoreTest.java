package quickfix;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

public class NoopStoreTest {

    @Test
    public void shouldInstantiateNewCalendarOnStoreReset() {
        try {
            LocalDateTime before = LocalDateTime.of(2023, 1, 1, 2, 3, 4);

            MockSystemTimeSource beforeTimeSource = new MockSystemTimeSource(before.toInstant(ZoneOffset.UTC).toEpochMilli());
            SystemTime.setTimeSource(beforeTimeSource);

            NoopStore underTest = new NoopStore();

            Date creationTime = underTest.getCreationTime();
            Calendar creationTimeCalendar = underTest.getCreationTimeCalendar();

            MockSystemTimeSource afterTimeSource = new MockSystemTimeSource(before.plusMinutes(1L).toInstant(ZoneOffset.UTC).toEpochMilli());
            SystemTime.setTimeSource(afterTimeSource);

            underTest.reset();

            Date creationTimeAfterReset = underTest.getCreationTime();
            Calendar creationTimeCalendarAfterReset = underTest.getCreationTimeCalendar();

            assertNotSame(creationTime, creationTimeAfterReset);
            assertNotSame(creationTimeCalendar, creationTimeCalendarAfterReset);

            assertNotEquals(creationTime, creationTimeAfterReset);
            assertNotEquals(creationTimeCalendar, creationTimeCalendarAfterReset);
        } finally {
            SystemTime.setTimeSource(null);
        }
    }
}
