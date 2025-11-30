import java.util.Scanner;

/*
 * This is a simple Java program.
 * Class Name: ParsingExample
 * Purpose: To demonstrate sample parsing between data types
 */
public class ParsingExample {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read user input
        System.out.print("Enter your age: ");
        String ageInput = input.nextLine();

        // Parsing String to int
        int age = Integer.parseInt(ageInput);
        System.out.println("Age as int: " + age);

        input.close();

    } // end of main method

} // end of ParsingExample class