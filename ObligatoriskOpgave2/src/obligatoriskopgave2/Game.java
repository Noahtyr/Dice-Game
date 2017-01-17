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
public class Game {

    private Player player;
    private Die die;
    private Player house;

    public Game(Player player, Player house) {
        this.player = player;
        this.house = house;
    }
    

    public GameResult playGame1() {
        String tempString;
         tempString = "";
        GameResult g = null;
        die = new Die(6);
        

        for (int i = 0; i < 10; i++) {

            player.setPoints(player.getPoints() + die.throwDie());
        }

        for (int i = 0; i < 10; i++) {
            house.setPoints(house.getPoints() + die.throwDie());

        }
        if (player.getPoints() > house.getPoints()) {
            tempString = "You threw the dice and received the follwing points: " +player.getPoints()+
                    "\nThe house threw the dice and received the following points: "+
                     house.getPoints();
        } else {
            tempString = "You threw the dice and received the following points: "+house.getPoints()+
                    "\nThe house threw the dice and received the following points: "+
                    house.getPoints();

        }
        System.out.println(tempString);
        g = new GameResult(player.getPoints(), house.getPoints());
        g.showHighestPoints();

        return g;

    }

    public GameResult playGame2() {
        String tempString;
        tempString = "";
        die = new Die(12);
        GameResult g = null;
        
        for (int i = 0; i < 5; i++) {
            player.setPoints(player.getPoints() + die.throwDie());
            
        }
        for (int i = 0; i < 5; i++) {
            house.setPoints(house.getPoints() + die.throwDie());

        }
        die = new Die(24);
        for (int i = 0; i < 5; i++) {
            player.setPoints(player.getPoints() + die.throwDie());
        }
        for (int i = 0; i < 5; i++) {
            house.setPoints(house.getPoints() + die.throwDie());

        }

        if (player.getPoints() % 2 == 0) {
            player.setPoints(player.getPoints() * 2);
            System.out.println("You rolled an even number! your points have been doubled!");
        } else if ((house.getPoints() % 2 == 0)) {
            house.setPoints(house.getPoints() * 2);
            System.out.println("The house rolled an even number! it´s points have been doubled!");
        }

        if (player.getPoints() > house.getPoints()) {
            tempString ="You threw the dice and received the follwing points: "+player.getPoints()
                    +"\nThe house threw the dice and received the following points: "
                    + house.getPoints();
        } else {
            tempString = "You threw the dice and received the follwing points: "+player.getPoints()
                    +"\nThe house threw the dice and received the following points: "
                    + house.getPoints();
        }
        System.out.println(tempString);
        g = new GameResult(player.getPoints(), house.getPoints());
        g.showHighestPoints();
        

        return g;
    }

    public GameResult playGame3() {
        String tempString;
        tempString = "";
        die = new Die(6);
        GameResult g = null;
        
        
        
        for (int i = 0; i < 1; i++) {
            player.setPoints(player.getPoints() + die.throwDie());
            System.out.println("You rolled the dice and received the following points: "+ player.getPoints());
        }
        for (int i = 0; i < 1; i++) {
            house.setPoints(house.getPoints() + die.throwDie());
            System.out.println("The house rolled the dice and received the following points: "+ house.getPoints());

        }
        if (player.getPoints() < 4) {
            System.out.println("You rolled between 1 and 3 and rolled with a 12 sided dice");
            die = new Die(12);
            player.setPoints(player.getPoints() + die.throwDie());
            System.out.println("You rolled with a 12 sided dice and received the following points: "+ player.getPoints());   
        } else {
            die = new Die(10);
            System.out.println("You roll a 10 sided dice and received the following points: "+player.getPoints());
            }
        
        
            if (house.getPoints() < 4) {
                System.out.println("The house rolled between 1 and 3 and rolled with a 12 sided dice");
                die = new Die(12);
                System.out.println("The house rolled with a 12 sided dice and received the following points: "+ house.getPoints());
            } else {
                die = new Die(10);
             System.out.println("The house rolled a 10 sided dice and received the following points: "+house.getPoints());
          
                
                
                if (player.getPoints() < house.getPoints()) {
                    tempString = "Congratulations, you have won!";
                } else {
                    tempString = "Too bad, the house won";

                }
                

            }
            System.out.println(tempString);
            g = new GameResult(player.getPoints(), house.getPoints());
            g.showLowestPoints();
            
            return g;
            
        }

            
        
    
    }





