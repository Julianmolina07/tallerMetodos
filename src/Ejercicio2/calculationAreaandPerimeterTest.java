/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Ejercicio2;
//@julianmolina
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculationAreaandPerimeterTest {

    @Test
    void areaYPerimeter() {
        double expectedArea = 10.0;
        double result = calculationAreaandPerimeter.areaYPerimeter(0.0, 0.0, 2.0, 5.0, "Area");
        assertEquals(expectedArea, result, 0.001);
    }

    @Test
    public void testPerimeterCalculation() {
        double expectedPerimeter = 14.0;
        double result = calculationAreaandPerimeter.areaYPerimeter(0.0, 0.0, 2.0, 5.0, "Perimeter");
        assertEquals(expectedPerimeter, result, 0.001);
    }
}