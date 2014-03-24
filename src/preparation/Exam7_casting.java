package preparation;



    import java.io.*;

class A{}
class B extends A{}
class C extends A implements Serializable{}
final class D extends B{}

public class Exam7_casting{
     public static void main(String args[]){
          A a=new A();
          B b=new B();
          C c=new C();
          D d=new D();
          Object ob=c; //Line-1
          d=(D)ob; //Line-2
          d=(D)new B(); //Line-3
          c=(C)new Serializable(){}; //Line-4


          int abc =10;
          char chr = 'a';
          short sh = 10;
          long l = 10L;
          double dou = 10f;
          abc = chr;
          l = abc;
          l = chr;
          dou = chr;
          
          sh = chr;//nelze implicitne - loss of precision !
     }


}
