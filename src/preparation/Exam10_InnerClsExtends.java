/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

import preparation.VHS;

/**
 *
 * @author LENOVO
 */
//Exam10_InnerClsExtends -> videoTape
  class A{}
  class B extends A{}
  class Monitor< E extends A >{
    public E getSame(E e){
    return (E) new B();
    }
  }

  
public class Exam10_InnerClsExtends{

    static transient int var;

    static volatile int var2;

        static class TestStatic{
            
        }

          class Recorder{
               public Exam10_InnerClsExtends getDisk(){
                    return new Exam10_InnerClsExtends();
               }
               public String toString(){
                    return "Recorder";
               }
          }

          class Player extends Recorder{
               public VHS getDisk(){
                   System.out.println(this.getClass());
                    return new VHS();
               }
               public String toString(){
                    return "Player";
               }
          }

          public String toString(){
               return "AnyVideo";
          }

          public static void main(String args[]){
               Exam10_InnerClsExtends vt=new VHS();
               vt.new Recorder().getDisk();
               System.out.print(vt+" "+new Exam10_InnerClsExtends().new Player().getDisk());
          }

     }

     class VHS extends Exam10_InnerClsExtends{
         static class TestStatic2{

         }
         
          public String toString(){
           VHS.TestStatic2  stCl2 = new VHS.TestStatic2();//jdou dedit nested clasy !
           VHS.TestStatic stCl1 = new VHS.TestStatic();
           Exam10_InnerClsExtends.TestStatic  outerCl3 = new Exam10_InnerClsExtends.TestStatic();
           VHS.Player pl = new VHS().new Player();//a jeste podedana klascka inner
              //System.out.println("This:" + this.new Player().getDisk());//funguje
              //System.out.println("This:" + new Exam10_InnerClsExtends().new Player().getDisk());//funguje
              return "VHS_Mode";
          }
     }
     
