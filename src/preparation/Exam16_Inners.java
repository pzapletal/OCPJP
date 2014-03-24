/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */


public class Exam16_Inners{

     static{
          st="Net";
     }

     static String st;

     class XInner{

          public final static int x=78;
          volatile String y;

          public XInner(int val){
               if (val>10)
                    return;
               y=st;
               System.out.println(y);
               throw new IllegalArgumentException();
          }

     }

     public static void main(String args[]){
          new Exam16_Inners().new XInner(5);
     }

}