/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preparation;

/**
 *
 * @author LENOVO
 */
public class Exam5 {

    abstract static class Omg {
        
    }

    public abstract class AbstractInner {

        public AbstractInner() {
            System.out.println("Abstr Innner Constructor");
        }

        {
            System.out.println("Inner Init Inst Block!");
        }
    }

    final class NormalInner extends AbstractInner {

        public NormalInner() {
            System.out.println("Normal Constructor");
        }

        {
            System.out.println("Normal Instant init block");
        }
    }

    public static void main(String... args) {
        Exam5 outer = new Exam5();

        outer.new NormalInner();

    }
}
