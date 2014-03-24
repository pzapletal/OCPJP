/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class Exam17_wrappers {

    @Override
    public boolean equals(Object o){
        return true;
    }

    public static void main(String[] args) {

      Number n = new Long(3);//ok

      //  Long v1 = new Byte(2);// -> illegal, navic Byte ma jen string a char construtor
        //Byte v2 =  new Long(2);// -> illegal
       // Byte v3 = new Long(3);// = -> illegal
        Short  v5 = 4;// -> legal
        Long v6 = 23245332L;// -> legal
       // Long v7 = 4;// ->illegal
        Float v8 = new Float("2.14");// ->legal
        Double v9= new Double(2.14F);// ->legal

        System.out.println(v6.shortValue());//pretece a nic nerekne :)
        System.out.println(v6.floatValue());
        Integer i = v6.intValue();

        short s = 1;
        Long nl = (long)1;//nutno pretypovat, omoci suffixu L
        Short s213 = 5;//jde i intem?

    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

}
