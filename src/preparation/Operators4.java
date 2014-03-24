/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class Operators4 {
    
    {
        index = 1;
    }

    int index;

    public static void main (String [] args){
        float f1 = 2.3f;
        float [][] f2 = {{42.0f}, {1.7f,2.3f}};

        int dd [][]  = {{9,8,7},{6,5,4},{3,2,1,0}};

        int []a[] = {{1,2,3}}; //zomg !

        System.out.println(dd[1][1]);
        //if(f1 == f2){

       // int [] d; --> enhanced loop MUST declare first operand
        for (int[] d : dd){

        }

        //cannot declare TWO variables in fist position -> must use comma and 1x int !
     //   for (int y = 0, int z = 0; y < z; z++){
            
     //   }

        //just int
        //for (Double x = 0; x < f1; ++x){

       // }
        //}


    }

    void runtimeDeclared() throws RuntimeException{
        
    }

    //rekurze je OK !
    void go(){
        go();
    }
}
