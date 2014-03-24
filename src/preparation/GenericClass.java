/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */

abstract class A <K extends Number> {
      
  //public abstract <K> K useMe(Object k);//ok

  //public abstract K<K> useMe(Object k);//bad syntax, deklarace musi byt pred ret tye

  //public abstract <K> A<? extends Number> useMe(A<? super K> k);//ok, prvni deklarace <K> neni potreba, je to zname z classy

  //public abstract <K> A<? super Number> useMe(A<? extends K> k);//out of bounds

  //public abstract <K> A<K> useMe(A<K> k);//2x <K>, not bounded if deleted, dochazi k shadowing K !, pak spadne ze nesadi s K extends Number v class ddeclaration

  //public abstract <V extends K> A <V> useMe(A<V> k);//ok

  //public abstract <V super K> A<V> useMe (A<V> k);//divny V; super is not valid at the generic declaration part of method

  //public abstract <V extends Character> A<? super V> useMe (A<K> k);//V je mimo bounds; character is not a Number. Compiler know that any super class of the Character class, will not be accepted by conditional eval K extends Number at the class def

  //public abstract <V super Character> A<? super V> useMe (A<K> k);//jak vyse

}


class test{
    static void array(){
        int[] ti2=new int[][]{{1}}[0];// funguje!
    }


 //class SuperClass <K super Object> {//cannot suer in class declar

 //}

   //class WildCard <K extends ?> { //cannot extends from wildcard

  // }

    abstract strictfp class strictFp {//jde

        abstract private class abstractPrivate{//jde !

        }

    }
}
