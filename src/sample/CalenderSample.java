package sample;

import java.util.Calendar;

public class CalenderSample{


    public static void main(String[] args){

        int year = 2018;
        int month = 8;

        /**
         *  Kalenderinstanz erstellen
         */
        Calendar cal = Calendar.getInstance();

        /**
         *  Kalendereinstellungen (Monat -1)
         */
        cal.set(year, month - 1, 1);

        /**
         * Tagesindex am Monatsanfang
         */
        int weekIndex = cal.get(Calendar.DAY_OF_WEEK);

        /**
         * Ende des Monats
         */
        int monthEndDay = cal.getActualMaximum(Calendar.DATE);

        /**
         * Kalendererstellung
         */
        System.out.printf("  <<%4d Jahre%2d Monat>>\n", year, month);
        System.out.println(" S  M  D  M  D  F  S");

        /**
         * Tagesversatz Raum
         */
        for (int i = 1; i < weekIndex; i++){
            System.out.print("   ");
        }

        /**
         * Ausgabe von Januar bis Monatsende
         */
        for (int day = 1; day <= monthEndDay; day++){
            System.out.printf("%3d", day);

            /**
             * Pause am Samstag
             */
            if ((day + weekIndex -1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}

