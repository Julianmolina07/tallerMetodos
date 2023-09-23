package Ejercicio5;
//@julianmolina
public class calculationSeconds {
    public static int CalculationSecondsD(int days, int hours, int minutes){

        int secondsDays = days * 24 * 60 * 60;
        int secondsHours = hours * 60 * 60;
        int secondsMinutes = minutes * 60;
        int tSeconds = secondsDays + secondsHours + secondsMinutes;

        return tSeconds;

    }

}
