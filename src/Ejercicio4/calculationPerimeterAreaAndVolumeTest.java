package Ejercicio4;
//@julianmolina
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculationPerimeterAreaAndVolumeTest {

    @Test
    void perimeterAreaAndVolume() {

        double radio = 8.0;
        String calculationType = "Perimeter";
        double expectedPerimeter = 2 * 3.1416 * radio;
        double result = calculationPerimeterAreaAndVolume.perimeterAreaAndVolume(radio, calculationType);
        assertEquals(expectedPerimeter, result, 0.001);

    }

    @Test
    void perimeterAreaAndVolumeTwo(){

        double radio = 10.0;
        String calculationType = "Volume";
        double expectedVolume = (4 * 3.1416 * Math.pow(radio, 3)) / 3;
        double result = calculationPerimeterAreaAndVolume.perimeterAreaAndVolume(radio, calculationType);
        assertEquals(expectedVolume, result, 0.001);

    }
}