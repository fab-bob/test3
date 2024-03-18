import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void manualDate () {
        String result = Main.getDateInACertainFormat("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", result);
    }


}