/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
    class A{
          public void blast()throws InterruptedException{
               throw new InterruptedException();
          }
     }

     class B extends A{
          public void blast()throws NumberFormatException{
               throw new NumberFormatException();
          }
     }

     public class Exam6_exceptions{
          public static void main(String args[])throws Exception{
               A ab=new B();
               ab.blast();
               System.out.println("Done");
          }
     }
