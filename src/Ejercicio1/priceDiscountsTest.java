package Ejercicio1;
//@julianmolina
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class priceDiscountsTest {

    @Test
    public void testpriceDiscount(){
        double normalPrice = 300;
        double percentage = 20;
        double expected = 240;
        double discount = priceDiscounts.cPriceoD(normalPrice, percentage);
        assertEquals(expected, discount);
    }

    @Test
    public void testTwoDiscount(){
        double normalPrice = 1100000;
        double percentage = 10;
        double expected = 990000;
        double discount = priceDiscounts.cPriceoD(normalPrice, percentage);
        assertEquals(expected, discount);
    }
}