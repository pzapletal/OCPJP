/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class Exam13_exceptst {

    public static void main(String... args) throws Exception{

        try {
            throwNFE();
        }catch(NumberFormatException e){
            throw (Exception) e;
        }
    }


    private static void throwNFE (){
        throw new NumberFormatException();
    }

    class A {
        public void dummy() throws FileNotFoundException {//checked
        }

        public void dummy2() throws IOException {//checked
        }

        public void dummy3() throws IOException {//checked
        }
    }

    class B extends A{
        @Override
        public void dummy(){            
        }

        public void dummy2() throws Exception {//fail
        }

        public void dummy3() throws FileNotFoundException {//checked
        }
    }
}
