/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Exam18_toArray {

    public static void main (String... args){
        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");

        Object[] a = l.toArray();

        System.out.println(l);
        System.out.println(Arrays.toString(a));

        a[0] = "1";

        System.out.println(l);
        System.out.println(Arrays.toString(a));

        System.out.println("------------------------------");

        Integer[] s = {1,2,3,4,5};// int[] s nefungoval, spadlo na bounds pozdej v set
        List<Integer> i = Arrays.asList(s);

        System.out.println(i + ":" + i.size());
        System.out.println(Arrays.toString(s));

        i.set(0, 100);

        System.out.println(i);
        System.out.println(Arrays.toString(s));
       
        i.add(new Integer(100));

        double [] rates= new double[2];//dimensions needed

        



    }
}
