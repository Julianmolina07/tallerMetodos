package Ejercicio4;
//@julianmolina
public class calculationPerimeterAreaAndVolume {
    public static double perimeterAreaAndVolume(double radio, String calculationType){

        double pi = 3.1416;

        switch (calculationType) {
            case "Perimeter":
                return 2 * pi * radio;
            case "Area":
                return pi * Math.pow(radio, 2);
            case "Volume":
                return (4 * pi * Math.pow(radio, 3)) / 3;
        }
        return pi;
    }
}