/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package preparation;

/**
 *
 * @author LENOVO
 */
public class Exam19_crazyEnum {

}

enum GPRSMobiles{

     X640("Samsung ",true){
          public String getBrand(){
               return "SAMSUNG ";
          }
     },

     C200("Motorola ",false){
     },

     C155("Motorola ",true){
          public boolean isGPRSEnabled(){
               return true;
          }
     },

     E300("Lenovo ",true){

          public boolean isGPRSEnabled(){
               return false;
          }

          public String getBrand(){
               return "Aritel ";
          }

     };

     boolean gprs; String brand;

     GPRSMobiles(String brand, boolean gprs){
          this.brand=brand;
          this.gprs=gprs;
     }

     public boolean isGPRSEnabled(){
          return gprs;
     }

     public String getBrand(){
          return "Unknown ";
     }

     public static void main(String args[]){
          GPRSMobiles[] gm=new GPRSMobiles[]{
               GPRSMobiles.X640,
               GPRSMobiles.C200,
               GPRSMobiles.C155,
               GPRSMobiles.E300,
          };

          for(GPRSMobiles g:gm){
               boolean b=g.isGPRSEnabled();
               System.out.print(g.getBrand()+g+" is "+ (b?"OK":"Not OK")+" to use, ");
          }

          for(double d=0 ; d < 100;++d){
              
          }
     }
}