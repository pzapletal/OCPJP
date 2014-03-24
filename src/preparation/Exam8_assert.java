/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class Exam8_assert {

    public static void main(String... args) {
        int i = 0;
        try {
            assert i++ == 1 : "Now " + ++i; //netriggne se :/
        } catch (Exception e) {
            i++;
        } finally {
            System.out.println("New_value=" + ++i);
        }


    }

}
