package Ejercicio1;
//@julianmolina
public class priceDiscounts {
        public static double cPriceoD(double normalPrice, double percentage) {

            double Discounts = (normalPrice * percentage) / 100;
            double priceDiscount = normalPrice - Discounts;
            return priceDiscount;
        }
}