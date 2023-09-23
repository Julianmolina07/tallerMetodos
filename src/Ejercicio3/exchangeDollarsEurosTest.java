package Ejercicio3;
//@julianmolina
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exchangeDollarsEurosTest {

    @Test
    void exchangeDolaryEuro() {
        double dollar = 1.33250;
        double euro = 1;
        double expected = 1.0;
        double conver = exchangeDollarsEuros.exchangeDolaryEuro(dollar, euro);
        assertEquals(expected, euro);
    }

    @Test
    void exchangeDolaryEuroTwo() {
        double dollar = 1.33250;
        double euro = 10;
        double expected = 10.0;
        double conver = exchangeDollarsEuros.exchangeDolaryEuro(dollar, euro);
        assertEquals(expected, euro);
    }
}