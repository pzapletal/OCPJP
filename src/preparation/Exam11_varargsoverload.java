/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.util.Formatter;

/**
 *
 * @author LENOVO
 */
public class Exam11_varargsoverload{
          public static void main(String[] argv){
               callMethod(new Integer(2));


               String b="fAlSe";
               String s1=null,s2=null;
               s1=new Formatter().format("%b",b).toString();
               s2=new Formatter().format("%b",new Boolean(b)).toString();
               System.out.println(s1+" "+s2);
               
        String[] a = new String[]{};
          
     
          }
          public static void callMethod(Integer... i){
               System.out.println("Wrapper");
          }
          public static void callMethod(int... i){
               System.out.println("Primtive");
          }

          public static void callMethod(int i){
               System.out.println("Primtive2");
          }
     }
