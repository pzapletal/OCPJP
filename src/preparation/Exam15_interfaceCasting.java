/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */

class A{};
public class Exam15_interfaceCasting {

    public static void main (String... srgs){

        A i = new A();
        Comparable cm =  (Comparable) (Cloneable) (Iterable) (Runnable) i;//samo ze pozdej exceptions
        Thread t = (Thread) (Runnable) i;

    }


}
