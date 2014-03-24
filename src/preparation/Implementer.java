/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public abstract class Implementer implements InterfaceA {
    
    public abstract void someMethod();


    private abstract class ImplementerB implements InterfaceA{
    }

}