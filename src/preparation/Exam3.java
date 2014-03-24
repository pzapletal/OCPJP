/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class Exam3{
          public static void tMeth(Integer... i){
               System.out.print("A");
          }
          public static void tMeth(int... i){
               System.out.print("B");
          }
          public static void main(String args[]){
               tMeth(Integer.valueOf("7"));//reference to tMeth is ambigous !
          }
     }
