/**
 * Description
 * This programs demonstates a while loop.

 * @author Chris Brennan
 * @since 10-31-21
 */

import java.util.Scanner;

public class WhileLoopB {
    
    // Call the main method
    public static void main(String[] args){
        
        // Call While Loop Methos
        whileMethod();
    }

    // Perform While Loop Demonstration
    public static void whileMethod() {

        // Instantiate Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Prompt User for Input and store it in variable.
        System.out.println("Enter a number: ");
        System.out.println();
        int input = sc.nextInt();

        // Intialize the Counter
        int counter = 1;

        // Perform While Loop
        while ( counter <= 10 ) {
            int i = input + counter;
            System.out.println(i);
            counter++;
        }

        // Close the Scanner.
        sc.close();
    }
}