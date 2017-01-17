/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriskopgave2;

import java.util.Scanner;

/**
 *
 * @author virk04
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player("Sebastian", 0);
        Player house = new Player("House", 0);
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scan.nextLine();
        System.out.println("Well met "+name);
        boolean done = false;
        int choice = 0;
        
        while(!done) {
            System.out.println("What game would you like to play?: ");
            System.out.println("1: ");
            System.out.println("2: ");
            System.out.println("3: ");
            System.out.println("4: Quit ");
            
            try {
                String input = scan.nextLine();
                choice = Integer.parseInt(input);
            } catch(NumberFormatException ex) {
                System.out.println("invalid input, please try again");
                continue;
            }
            
            switch(choice) {
                case 1:
                   Game game1 = new Game(player, house);
                   
                    System.out.println(game1.playGame1());
                    break;
                
                case 2:
                    Game game2 = new Game(player, house);
                    
                    System.out.println(game2.playGame2());
                    break;
                    
                    case 3:
                    Game game3 = new Game(player, house);
                    
                    System.out.println(game3.playGame3());
                    
                    break;

                case 4:
                    System.out.println("Exiting...");
                    done = true;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
            
        }
    }
        
        
        

        
      
        
        
    }
    


