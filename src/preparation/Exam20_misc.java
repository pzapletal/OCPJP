/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preparation;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Exam20_misc {

    public static void main(String... x) {

        String context = "0100 55 3L 62D 127 6F (int)7";
        Scanner s = new Scanner(context);
        while (s.hasNextLong()) {
            System.out.print(s.nextLong() + ",");
        }


        System.out.println();

        Scanner s2 = new Scanner("0100 55 3L 62D 127 6F (int)7");
        while (s2.hasNext()) {
            if (s2.hasNextLong()) {
                System.out.print(s2.nextLong() + ",");
            } else {
                s2.next();
            }
        }

        System.out.println();

        int xnte = (int) 3.9;
        System.out.println(xnte);

        int x2 = 5;
        int y = (x2++)*x2;//->30
        System.out.println(y);


    }

    class B implements Comparable<B>{

        public int compareTo(B o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }



    /*
    private void main(String... x){ -> nesmi mit stejnou signaturu ani jak static metoda
    }
     */
    abstract class A<K extends Number> {
        // public abstract <K> K useMe(Object k);//ok
        // public abstract K<K> useMe(Object k);//bad syntax, deklarace musi byt pred ret tye
        // public abstract <K> A<? extends Number> useMe(A<? super K> k);//ok, prvni
        //public abstract <K> A<? super Number> useMe(A<? extends K> k);//out of bounds
        //public abstract <K> A<K> useMe(A<K> k);//2x <K>, not bounded if deleted,
        //public abstract <V extends K> A <V> useMe(A<V> k);//ok
        //public abstract <V super K> A<V> useMe (A<V> k);//divny V; super is not
        //public abstract <V extends Character> A<? super V> useMe (A<K> k);//V je
        //public abstract <V super Character> A<? super V> useMe (A<K> k);//jak vyse
    }
}
