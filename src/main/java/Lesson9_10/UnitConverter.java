package Lesson9_10;

public class UnitConverter {

    public static void celciusToFahrenhrit(double c) {
        //  double c;    //temp in celcius
        double fa;     //temp in fahrenhait


        fa = (c * 1.8) + 32;

        System.out.print
                (c + " temp in celcious is in fahrenhait " + fa);
        System.out.println(" ");
    }

    public static void kilometresToMiles(double km) {
        // double km;    // kilometr =
        double mi;     //mile =


        mi = (km * 0.62137);

        System.out.print
                (km + " kilometres are equalas " + mi + " in miles. ");
        System.out.println(" ");

    }

    public static void milesTokilometres(double mil) {
        double km;    // kilometr =
        //  double mil;     //mile =

        km = (mil / 0.62137);


        System.out.print
                (mil + " miles are equalas " + km + " in kilometres. ");
        System.out.println(" ");

    }

    public static void kilosToPounds(double kg) {
        // double kg;    // kilograms
        double lbs;     //pounds

        lbs = (kg * 2.2046);

        System.out.print
                (kg + " kilos are equalas " + lbs + " in kilometres. ");
        System.out.println(" ");
    }

    public static void PoundsToKilos(double lbs) {
        double kg;    // kilograms
        // double lbs;   pounds

        kg = (lbs / 2.2046);

        System.out.print
                (kg + " kilos are equalas " + lbs + " in kilometres. ");
        System.out.println(" ");
    }
}



