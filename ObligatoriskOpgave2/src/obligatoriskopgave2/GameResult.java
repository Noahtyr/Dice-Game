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
public class GameResult {
    private String result;
    private int playerPoints;
    private int housePoints;
    
    // Dette er vores attributes i vores GameResult, disse bruges i vores if statements til at vurdére hvem som vinder.

    public GameResult( int playerPoints, int housePoints) {
        
        this.playerPoints = playerPoints;
        this.housePoints = housePoints;
    }
// vores contructor. bruges til at initialisere vores attributes. Denne constructor har ikke en derp parameter, 
// da derp ikke behøves at initialiseres. den skal bruges som vores return statement i vores toString.    
    

   public void showHighestPoints(){
       
       result = "";
       if(playerPoints > housePoints){
           result = "\n Congratulations, you won!";
       } else {
           result = "\n Too bad, The House won";
       }
       
               
   }
   // Denne metode bliver brugt til at finde det højeste terninge kast ved at hente spilleren points og husets points.
   // Metoden er efterladt i void, da den ikke behøves at retuneres i showHighestPoints, dette gøres i vores toString metode.
   
   public void showLowestPoints(){
       result = "";
       if(playerPoints < housePoints){
           result = "\n Congratulation, you won!";
       } else {
           result = "\n Too bad, The House won!";
       }
       
   }
   

    @Override
    public String toString() {
        return  result;
    }
    // Dette er vores toString metode i vores GameResult, her ville resultatet af vores spil blive vist.
   
   
   

    
   
}
