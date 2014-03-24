/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import java.io.File;
import java.io.File;

/**
 *
 * @author LENOVO
 */
public class StringsIOFormattingParsing6 {

    public static void main(String [] args) {

    long l343 = 343L;
    Long L343 = 343L;
    int i343 = 343;
    Integer I343 = 343;

    if(L343.equals(l343)) System.out.println("Long equals long");
    if(l343 == L343) System.out.println("long equals Long");
    
    if(i343 == L343) System.out.println("int equals Long");
    if(L343.equals(i343)) System.out.println("Long equals int");

    if(L343.equals(I343)) System.out.println("Long equals Int");
    if(L343.equals(new Long(I343))) System.out.println("Long equals Int - wrapped");

    String separator = File.separator;
    System.out.println(separator);
    

    
        
    }
}
