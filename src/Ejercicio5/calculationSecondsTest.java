package Ejercicio5;
//@julianmolina
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculationSecondsTest {

    @Test
    void calculationSecondsD() {

        int days = 3;
        int hours = 19;
        int minutes = 10;
        int expectedSeconds = (days * 24 * 60 * 60) + (hours * 60 * 60) + (minutes * 60);
        int result = calculationSeconds.CalculationSecondsD(days, hours, minutes);
        assertEquals(expectedSeconds, result);

    }

    @Test
    void calculationSecondsDTwo() {

        int days = 3;
        int hours = 2;
        int minutes = 12;
        int expectedSeconds = 267120;
        int result = calculationSeconds.CalculationSecondsD(days, hours, minutes);
        assertEquals(expectedSeconds, result);

    }
}