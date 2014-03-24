/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */

    class Dozens{
        int dz[] = {1,2,3,4,5,6};
    }

    
class Bird {

    static int omg = 123;
    
    {
        System.out.println("BLOCK");
    }
    
    static {
        System.out.println("STATIC");        
    }

    Bird(){
        System.out.println("CONSTRUCTOR");
    }

    void go (int omg){
        omg++;
        Bird.omg++;
  //      for (int omg = 1; ;){

  //      }
    }
}

public class Assignments3 {
    public enum Suits {
        CLUBS(20)
        {
            @Override
            public int getValue(){return 0;}}
        , SPADES(30)
        {
            @Override
            public int getValue (){return 8;}
        };

        Suits(int p) {
           this.points = p;
        }
        private int points;

        public int getValue() {return 10;}
        
    }

    class DozensInner{
        int dz[] = {1,2,3,4,5,6};
    }

    public static void main(String... args){

        for(String arg : args) {
            System.out.println(arg);
        }

        System.out.println("PRE");
        new Bird();
        System.out.println("AFTER");

        System.out.println(Suits.CLUBS.getValue());
        System.out.println(Suits.CLUBS);
        System.out.println(Suits.values());



        Integer [] ints = new Integer[3];
        ints[0] = new Integer(3);
        
        Dozens [] da = new Dozens[3]; // jde !
        da[0] = new Dozens(); //padalo kdyz to byla jen inner class
        System.out.println(da[0].dz[1]);

        DozensInner [] daInner = new DozensInner[3]; // jde 
        daInner[0] = new Assignments3().new DozensInner(); //a takto fuguje s inner (tj je treba inst tridy mainu)
        //daInner[1] = Assignments3.new DozensInner(); //nelze
        System.out.println(daInner[0].dz[1]);



        
    }

}
