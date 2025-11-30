import java.util.Scanner;

/*
 * This is a simple Java program.
 * Class Name: TypeCasting
 * Purpose: To demonstrate sample typecasting between data types
 */
public class TypeCastingExample {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Implicit Casting (Widening)
        System.out.print("Enter an integer: ");
        int intValue = input.nextInt();

        // int to double
        double doubleValue = intValue;
        System.out.println("Implicit Casting (int to double): " + doubleValue + "\n");

        // Explicit Casting (Narrowing)
        System.out.print("Enter a double value: ");
        double doubleVal = input.nextDouble();

        // double to int (narrowing, manual)
        int intVal = (int) doubleVal;
        System.out.println("Explicit Casting (double to int): " + intVal);

        input.close();

    } //end of main method

} // end of TypeCasting class