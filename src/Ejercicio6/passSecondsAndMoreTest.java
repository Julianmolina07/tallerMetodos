package Ejercicio6;
//@julianmolina
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passSecondsAndMoreTest {

    @Test
    void passSecondsAndMore() {

        int seconds = 86400;
        String type = "days";
        int expectedDays = 1;
        int result = passSecondsAndMore.PassSecondsAndMore(seconds, type);
        assertEquals(expectedDays, result);

    }

    @Test
    void passSecondsAndMoreTwo() {

        int seconds = 7200;
        String type = "hours";
        int expectedHours = 2;
        int result = passSecondsAndMore.PassSecondsAndMore(seconds, type);
        assertEquals(expectedHours, result);

    }

}