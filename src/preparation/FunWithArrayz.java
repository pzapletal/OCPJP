/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class FunWithArrayz {

    public class Inner {

    }

    public static void main(String... args){
        //nikdy size of array v deklarci reference !

        //int[]a = new int [];fail
        int[]a = new int [2];
        int[]b[] = new int [2][];//prvky v druhe dim budou null
        int c[][] = new int [2][2];//prvku v druhe dim budou defaulted

        Inner [] h = new Inner[2];
        Inner [][]h2 = new Inner[2][];//2x null
        Inner [][]h3 = new Inner[2][2];//4x null


        arrayTest();


        int d1 [][][] = new int [][][] {};//ok
        int d2 [][][] = new int [][][] {{{1},{1},{1,2}},{{1},{2},{3}},{{1},{2},{3}}};//ok!
        //int d3 [][][] = new int [2][3][5] {{{1},{1},{1,2}},{{1},{2},{3}},{{1},{2},{3}}};//nok!
        int [][]d4[] = new int [][][] {{{5}}};//ok
        //int [][]d5[] = new [][][]int {{{5}}};//nok
        int [] d5 = {1,2,3,4};//ok

        FunWithArrayz outer = new FunWithArrayz();
        Object[] arrobj = {outer.new Inner(), outer.new Inner(), null, outer.new Inner()};//ok


        int []ac, bc[], dc[][];//ok ! je to stejne jen reference, ne skutecne vytvareni objektu
        //int bb[],[]ff[];//faiL!

        int zero [] = new int [0];//ok -> empty array, nekdy se to hodi vic jak vracet null

        int [] jedna = {1,2,3};//stejne niz
        int [] dva = new int[] {1,2,3}; //stejne jak vys

        //ale
        int [] tri;
        //tri = {1,2,3};//error
        tri = new int [] {1,2,3};//ok


       // List<Number> asfds = new ArrayList<Integer>();
    }


    
    
    private static void arrayTest()
    {
        Number[] na = {1,2,3};
        Integer[] ia = {1};
        String numberName = na.getClass().getName();
        String intName = ia.getClass().getName();
        Integer i=1;
        Number n = i;
        String iName = i.getClass().getName();
        String nName = n.getClass().getName();
        System.out.println(numberName + " " + intName);
        System.out.println(iName + " " + nName);
        System.out.println(ia instanceof Number[]);
        System.out.println(i instanceof Number);
    }

}

