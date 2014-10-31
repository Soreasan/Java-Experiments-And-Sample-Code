/*
Kenneth Adair
www.cslearner.com

This is a simple program that takes a user input
and makes a variable equal to the user input and
then outputs a string that includes the user input.  
*/

package generic.sports.cheer.chant.generator;
import java.util.Scanner;

public class GenericSportsCheerChantGenerator {

    public static void main(String[] args) {
        
        //This is a "String" variable named "sportsTeam"
        String sportsTeam;
        
        //This is necessary or I can't accept user input
        Scanner in = new Scanner(System.in);
        
        System.out.println("This program takes a sports team name and generates a random chant");
        System.out.println("Enter a string with your favorite Sports Team's Name:");
        //this line takes the user input and makes the "sportsTeam" variable equal
        sportsTeam = in.nextLine();
        System.out.println("Prepare to be beaten by " + sportsTeam + "!");
        System.out.println(sportsTeam + " rocks your face!");
        
    }
    
}
