/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriskopgave2;



/**
 *
 * @author virk04
 */
public class Die {
    
   private int numberOfSides;
   
   
   
   public Die(int dieSides){
       numberOfSides = dieSides;
   }
   
   
     int throwDie(){
       return (int)(numberOfSides * Math.random()) + 1;
         
   }
     
     
    
 
  
   
   
    
}
