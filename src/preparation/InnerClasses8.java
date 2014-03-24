/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class InnerClasses8 {

    static class staticClazz{
        static int staticInnerVar = 0;//norm inner classy nemuzou (jen final by slo)
    }

    static int canAccess = 1; //static jen kvuli static contentu

    //--> anonymous must imlement or extend somethhing !
    /*
    Popcorn p = new Popcorn(){
        public void pop (){
            System.out.println("anonymous popcorn");
        }
    };
     */

    class A {
        void m(){
            System.out.println("outer");
        }
    }

    void go(){
        new A().m(); //-> prints outher
        
        //method scope overrdie
        class A {
            void m(){
                System.out.println("method");
            }                
        }

        new A().m(); //->prints method
    }


    abstract class InnerAbstractClass {
        public abstract void abstractMethod();
    }




    public static void main (String... args){

        final int cannotAccessUnlessFinal = 1; // otherwise comile error

        class MethodInnerClass{

            void hi(){
                System.out.println("Hi form " + this);
            }

            int compute(){
                return cannotAccessUnlessFinal + canAccess;
            }

        }

        MethodInnerClass mic = new MethodInnerClass();
        mic.hi();
        System.out.println("Compute:" + mic.compute());

        new InnerClasses8() {
            void hi(){
                System.out.println("(Anonymous) Hi from " + this);
            }

            {
                hi();
                int a = 1;// deklarace lokalni variable
            }
            
        };//TENTO SEMICOLON JEN NEZBYTNY !!

        //extend object do anonyous classy
        Object o = new Object (){
            @Override
 //musi byt public, jinak prepisuju public na defualt access a to evil
            public String toString (){
                return "Custom toString";
            }

            //can declare, but can call only from class, not from outside
            public String hi(){
                return "Hi from " + this;
            }
        };

        //zavola override to String, runtime call
        System.out.println(o);

        //cannot call added method hi () -> nesmi byt uz anonymous, compile time check failne
        //reference je porad Object
        //System.out.println(o.hi());


        new InnerClasses8().go();
    }

    {   //anonymous z abstractni inner classy v instance init blocku -> jde instance :D
        InnerAbstractClass iac = new InnerAbstractClass(){
            //implementace abstraktni metody
            public void abstractMethod(){
                System.out.println("Hi from abstract " + this);
            }
        };

        iac.abstractMethod();
    }



    //so bad!
    /*
    InnerClasses8(){
        void hi(){
            System.out.println("Hi from " + this);
        }
    };
     */
}
