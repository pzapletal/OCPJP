/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class StrangeExtends {

    public static void staticMethod(){
        
    }

    public StrangeExtends() {
        System.out.println("MAIN");
    }

    
    private class StrangeExtendsBottom extends StrangeExtends {
        StrangeExtendsBottom(){
            System.out.println("BOTTOM");                    
        }
    }
    
    private class StrangeExtendsBottomer extends StrangeExtendsBottom{
        public StrangeExtendsBottomer() {
            System.out.println("BOTTOMER");                    
        }

        private void botty (){
            
        }
        
    }

    public static void main(String [] args){
        new StrangeExtends();
        new StrangeExtends().new StrangeExtendsBottomer(); // !! !!!

        StrangeExtends.StrangeExtendsBottomer.staticMethod();//static metody se v poho
        //dedi/ ale zadna overridy !
    }

}