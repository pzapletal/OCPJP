/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;
import static java.lang.System.out;


/**
 *
 * @author LENOVO
 */
public class Exam1 {



    boolean testDefaultVal;

    abstract class privateAbstract{
        //private abstract void omg();//nelze !
    }

    private void go() {
        ExamExtension extension = new ExamExtension();
        
        //inner classy se neextenduji
        //ExamExtension.AnotherNestedClass nested = new ExamExtension.AnotherNestedClass();

    }

    private class ExamExtension extends Exam1 {

    }

    private static class AnotherNestedClass{
        private int a;
    }


    protected class AnotherInnerClass{
        private int a;
    }


    public static void main (String... args){
        //Float.valueOf("45T");
        out.println( Float.valueOf("45F"));

        Exam1 outerClass = new Exam1();
        
        Exam1.AnotherNestedClass nested = new Exam1.AnotherNestedClass();

        Exam1.AnotherInnerClass inner = outerClass.new AnotherInnerClass();

        //vypada to ze nejde, ale, mozna jvm bug
        //Exam1.AnotherNestedClass nested2 = outerClass.new AnotherNestedClass();


        out.println(outerClass.testDefaultVal);

        outerClass.go();

        //omg ! -> 1213%1$s
        out.printf("12%1$s","13%1$s","14%1$s");
        out.println();

    }

}

