package Ejercicio2;
//@julianmolina
public class calculationAreaandPerimeter {
    public static double areaYPerimeter(double area, double perimeter, double a, double b, String calculationtype){
        switch (calculationtype){
            case "Area":
                return a + b;

            case "Perimeter":
                return a * b;
        }
        return area;
    }
}
