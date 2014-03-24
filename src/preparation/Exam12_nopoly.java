/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */


public class Exam12_nopoly{

     private int goNow(){
          return 4;
     }

     public static void main(String args[]){
          Exam12_nopoly tb=new Bot();
          float f=tb.goNow();
          System.out.print(f);

          Object o = new Object();
          Runnable r = (Runnable) o;
          Serializable s = (Serializable) o;

          r = (Runnable) tb;
     }

}


class Bot extends Exam12_nopoly{

     protected long goNow(){
          return 5;
     }

}
