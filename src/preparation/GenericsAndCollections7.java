/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LENOVO
 */
public class GenericsAndCollections7 {

    public static void main (String... args) {

        Set set = new LinkedHashSet();//non-generic, HashSet by stacil
        set.add("2"); // pad -> ale stupidni HashSet by prosel protoze neporovnava jak TreeSet
        set.add(1);
        set.add(3L);

        Object o = new Object();
        o.hashCode();

        Iterator it = set.iterator();
        while(it.hasNext()){
            // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
            System.out.println(it.next() + "");
        }

        ArrayList<Integer> divnyAleOk = null;

        // -----
        Set<Object> objArr = new TreeSet<Object>(new Mycomp());

        List<? super String> listStr = new ArrayList<String>();
        listStr.add("abc");
        
        List<String> orderMatters = new ArrayList<String>();
        orderMatters.add("asd");
        orderMatters.add("123");
        orderMatters.add("asSS!");
        orderMatters.add("Acd");
        orderMatters.add("_asdfdsf!@");

        Collections.sort(orderMatters);
        System.out.println(orderMatters);

        Comparator<Object> revComp = Collections.reverseOrder();
        Collections.sort(orderMatters,revComp);
        System.out.println(orderMatters);




    }



}

class Mycomp implements Comparator<Object>{

    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
