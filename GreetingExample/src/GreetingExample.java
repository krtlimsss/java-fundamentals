import java.util.Scanner;

/*
 * This is a simple Java program.
 * Class Name: GreetingExample
 * Purpose: To demonstrate sample console input and output
 */
public class GreetingExample {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Read user input
        System.out.println("What's your name? ");
        String name = input.nextLine();

        System.out.println("Hi " + name + " Welcome to the Java Fundamentals Training!");

    } //end of main method

} // end of ConsoleInputExample class