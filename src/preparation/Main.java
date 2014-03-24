/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;// !!! 


enum Animals {

    DOG("woof"), CAT("meow");
    String sound;

    Animals(String s) {
        sound = s;
    }
}

class Cat {}

class Dog {
    public static void main(String [] args){
        //Cat c = new Cat();
        Dog d = new Dog();
        Object o = new Object();
        boolean bool = o instanceof Integer;

        String str = "asd";
        str.length();

        String str2 = new String ("ase");
        str2.length();

        String[] x = new String [2];
        int aa = x.length;
        //System.out.print(d instanceof String);
    }
}



class A {
    private int member = 42;

    public void setMember(int member) {
        this.member = member;
    }

    public int getMember() {
        return member;
    }
}

class B extends A {
}

abstract class C extends B {

}
/**
 *
 * @author LENOVO
 */
    class Test {

        public String sz;

        Test (String szName)
        {
            this.sz = szName;
        }

        void change ( String szNew)
        {
            this.sz = szNew;
        }

        void setToKarel( String szNew)
        {
            szNew = "karel";
        }

        String ToString ()
        {
            return this.sz;
        }
    }

public class Main {

     static Animals a;

    public static <T> T genMethod (T t) {
        return t;
    }


    public static void changeA (int [] a)
    {
        a[0] = 0;
    }

    static void giveString (Object y)
    {
        y = "this is string";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(a.CAT.sound);
        System.out.println(Animals.CAT);

        int __a = 1;
        //int #b = 2; impossible
        int [] c [] = new int [2][1];// array of arrays !s
        c[0][0] = 1;


        A clazzA  = new A();

        B clazzB = new B();
        clazzB.setMember(123);
        
        System.out.println(clazzA.getMember());

        System.out.println(clazzB.getMember());


        // TODO code application logic here

        Test t1 = new Test("pepa");
        System.out.println(t1.ToString());
        t1.change("jarda");
        System.out.println(t1.ToString());
        t1.setToKarel(t1.ToString());
        System.out.println(t1.ToString());

        int[] a = {1};
        System.out.println(a[0]);
        changeA(a);
        System.out.println(a[0]);

        Object x = null;
        giveString(x);
        System.out.println(x);

        System.out.println ("-------------------------");

        Map<Object,String> mp = new HashMap<Object, String>();

        mp.put (1, "One");
        mp.put( new Integer(2), "Two" );
        mp.put( 3 , "Three");

        mp.put ("aa", "One");
        mp.put( new Integer(2), "Two" );
        mp.put( 3 , "Three");

        
        Set s = mp.entrySet();

        Iterator iterW = s.iterator();
        Iterator iterW2 = s.iterator();

        while(iterW.hasNext()){
            System.out.println(iterW.next());
            System.out.println(iterW2.next());
        }

        /*
        for(Iterator iter = s.iterator();iter.hasNext();)
        {
            System.out.println(iter.next());
        }
         */


    }

}
