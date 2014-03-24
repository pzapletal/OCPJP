/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 *
 *
 */

interface I{
    int i = 10;
}


abstract strictfp  class Exam14 implements I{

    transient static int a = 1;

    public static void main (String... args){

    }
    
    static{
        System.out.println(i);//legalni
       // Exam14.i = 0;//cannot access value to final var
    }

}
