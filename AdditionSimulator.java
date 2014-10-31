/*
Kenneth Adair
www.CSLearner.com

This is a basic file that let's the user enter two variables and then adds them.
 */
package additionsimulator;

//Allows us to get user input with stdIn.variablename
import java.util.Scanner;

public class AdditionSimulator {

    public static void main(String[] args) {
        //This allows us to get user input
        Scanner stdIn = new Scanner(System.in);
        
        int firstNumber;
        int secondNumber;
        
        System.out.println("This is a basic Java Program that let's you add two numbers together.");
        System.out.println("Enter the first number you'd like to add.");
        firstNumber = stdIn.nextInt();
        System.out.println("Enter the second number you'd like to add.");
        secondNumber = stdIn.nextInt();
        
        System.out.println("The answer is: "+ (firstNumber + secondNumber));
    }
    
}
