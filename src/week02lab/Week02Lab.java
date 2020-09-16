/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02lab;

/**
 *
 * @author 818736
 */
import java.util.*;
public class Week02Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hey there! What is your mood today?");
         System.out.println("Enter the number that corresponds:");
          System.out.println("1. Happy");
           System.out.println("2. Sad");
           System.out.println("3. Angry");
           System.out.println("4. Meh");
           
           Scanner in = new Scanner(System.in);
           System.out.println("Your mood is ");
           int choice = in.nextInt();
           
           switch (choice){
               case 1:
                   System.out.println("Amazing! Make sure you're smiling!");
                break;
               case 2:
                   System.out.println("I would give you a hug if I weren't a computer.");
                break;
               case 3:
                   System.out.println("The best fighter is never angry. You've got to calm down first!");
                break;
               case 4:
                   System.out.println("You've selected Meh, but do you really know what mood that is referring to?");
                break;
               default: System.out.println("Sorry, I do not know what mood that is.");
    }
        
    }
    
}
