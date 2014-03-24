/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class Threads9_2 implements Runnable {
    static long flag = 0;
    static Dudes d;

    class Dudes {
        /*synchronized*/ void chat(long id){
            //System.out.println(id + ":" + flag);
            if(flag == 0) flag = id;
            for(int x = 1; x < 5; x++){
                if(flag == id) {
                    System.out.println(id + ": yo ");
                    Thread.yield();
                }
                else {
                    System.out.println(id + ": dude ");
                    //Thread.yield();
                }
            }
        }
    };

    public void run() {
        d.chat(Thread.currentThread().getId());
    }

    public static void main (String... args){
        new Threads9_2().go();
    }

    void go(){
        d = new Dudes();
        new Thread(new Threads9_2()).start();
        new Thread(new Threads9_2()).start();
    }
}
