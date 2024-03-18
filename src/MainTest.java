import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void manualDateMarch() {
        String result = Main.getDateInACertainFormat("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", result);
    }
    @Test
    void manualDateFebruary() {
        String result = Main.getDateInACertainFormat("2022-02-01T13:00:00Z");
        assertEquals("01 febbraio 2022", result);
    }


}