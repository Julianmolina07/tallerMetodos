package Ejercicio6;
//@julianmolina
public class passSecondsAndMore {

    public static int PassSecondsAndMore(int seconds, String type) {

        int days = 0, hours, minutes;

        switch (type) {
            case "days":
                days = seconds / (24 * 60 * 60);
                return days;
            case "hours":
                hours = seconds / (60 * 60);
                return hours;
            case "minutes":
                minutes = seconds / 60;
                return minutes;

        }

        return days;
    }
}