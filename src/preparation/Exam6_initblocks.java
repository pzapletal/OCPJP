/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preparation;

/**
 *
 * @author LENOVO
 */
public class Exam6_initblocks {

    private int a = 12;

    static {
        System.out.println("Exam6_initblocks - static");
    }

    {
        System.out.println("Exam6_initblocks - BEGIN - instance");
        System.out.println("a = " + ++a);
        System.out.println("Exam6_initblocks - END - instance");
    }

    Exam6_initblocks() {
        System.out.println("Exam6_initblocks - constructor");
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        System.out.println("START");
        new Exam6_initblocks();
        System.out.println("END");
    }
}
