import java.util.Scanner;

/**
 * Write a description of class ice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ice
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); 

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble(); 
        System.out.println("\n=== Calculator Input Summary ===");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        input.close();
    }
}