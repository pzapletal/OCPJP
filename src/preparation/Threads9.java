/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Threads9 {

    class MyRunnable implements Runnable {
        public void run() {
            System.out.println(this);
        }
    }
    
    public static void main (String... args){

        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println(this);
            }
        };

        Thread t2 = new Thread(new Threads9().new MyRunnable());

        t.start();
        t2.start();

        System.out.print("1 ");

        synchronized(args){ // kdyby nebyl, wait by hodil IllegalStateException !
            try {
                System.out.print("2 ");
                args.wait(100);//stuck, pusti az na timeout
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("3 ");

        try {
            Thread.sleep(1000);// je to static -> tj current thread
        } catch (InterruptedException ex) {
            Logger.getLogger(Threads9.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("4 ");


    }
}
