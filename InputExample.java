/* Use the Scanner class and 
3.1 Read int, float, double, boolean, String values
3.2 Store values in different variables
3.3 Print these variables
3.4 Do some arithmetic operations
3.5 Look for the errors

*/

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read different types of values
        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();

        System.out.print("Enter a float: ");
        float floatVal = sc.nextFloat();

        System.out.print("Enter a double: ");
        double doubleVal = sc.nextDouble();

        System.out.print("Enter a boolean (true/false): ");
        boolean boolVal = sc.nextBoolean();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter a string: ");
        String strVal = sc.nextLine();

        // Print values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Boolean: " + boolVal);
        System.out.println("String: " + strVal);

        // Do arithmetic operations
        int sumInt = intVal + 10;
        float sumFloat = floatVal + 5.5f;
        double sumDouble = doubleVal * 2;

        System.out.println("\nArithmetic operations:");
        System.out.println("Integer + 10 = " + sumInt);
        System.out.println("Float + 5.5 = " + sumFloat);
        System.out.println("Double * 2 = " + sumDouble);
    }
}
