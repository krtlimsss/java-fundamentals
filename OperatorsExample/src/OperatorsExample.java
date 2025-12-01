import java.util.Scanner;

/*
 * This is a simple Java program.
 * Class Name: OperatorsExample
 * Purpose: To demonstrate the use and types of different operations in Java
 */
public class OperatorsExample {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read user input for first ineteger
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        // Read user input for second integer
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
		
		boolean isGreater = sum > difference;
		System.out.println(isGreater);
		
		int x = 5;
		int y = x--;
		
		System.out.println(x);
		System.out.println(y);

        input.close();

    } // end of main method
	
} // end of OperatorsExample class