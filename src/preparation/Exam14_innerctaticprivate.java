/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import preparation.OOConc;

/**
 *
 * @author LENOVO
 */


public class Exam14_innerctaticprivate{

    @SuppressWarnings("static-access")
     public static void main(String args[]){
          //new OOConc().getA().x=8;
            new OOConc().setA(10);
          System.out.println(new OOConc().getX());

     }

}

class OOConc{

     private static class A{
          static int x=7;
     }

     public A getA(){
          return new A();
     }

     public void setA(int i){
         A.x=i;
     }

     public int getX(){
         return A.x;
     }


}
