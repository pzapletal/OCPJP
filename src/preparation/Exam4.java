/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preparation;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.lang.System.out;
/**
 *
 * @author LENOVO
 */
public class Exam4 {

    static void go() {
        System.out.printf("Zdravim >%1$+-30.2f<>%2$s<\n", -10.1234, " frajer");
        //System.out.printf(Locale.UK, null, args);
    }

    public static void main(String... args) {
        go();


        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        //cal.setTime(d);
        cal.set(2013, 12, 1);
        NumberFormat nb = NumberFormat.getInstance();
        Locale loc = new Locale("DE");
        DateFormat df = DateFormat.getDateInstance();

       out.println(d+ "\n" + cal + "\n" + nb + "\n" + loc + "\n" + df);

       out.println(cal.get(Calendar.YEAR));


        Locale locSpain = new Locale("es", "ES");
        DateFormat spain = DateFormat.getDateInstance(DateFormat.FULL, locSpain);
        DateFormat cz = DateFormat.getDateInstance(DateFormat.FULL, loc);



        out.println( spain.format(d));
        out.println( cz.format(d));

        cal.add(Calendar.WEEK_OF_YEAR, 1000);
        out.println( spain.format(cal.getTime()));


    }
}
