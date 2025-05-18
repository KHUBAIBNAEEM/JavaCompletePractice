// Exception Handling is a mechanism to handle runtime errors, ensuring normal program flow.
// An Exception is an object that encapsulates information about an error and its type.
// It has a hierarchy:
/*
    1. Object
    2. Throwable
    3. Throwable has two subclasses: Error and Exception
    4. Error -> Unchecked (not meant to be caught, not our fault e.g., OutOfMemoryError)
    5. Exception -> Checked and Unchecked
        5.1 Checked -> Compile-time (e.g., IOException)
        5.2 Unchecked -> Runtime (e.g., ArithmeticException)
*/

import java.util.Scanner;

class EHChecking {
    private double nm1;
    private double nm2;

    // Constructor
    public EHChecking(double nm1, double nm2) {
        this.nm1 = nm1;
        this.nm2 = nm2;
    }

    // Method for division
    public void division() {
        if (nm2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double div = nm1 / nm2;
        System.out.println("The answer is: " + div);
    }
}

public class EHIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            EHChecking eh = new EHChecking(num1, num2);
            eh.division();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other error occurred.");
            System.out.println(e.getMessage());
        } finally { // close the scanner
            sc.close();
            System.out.println("Program finished.");
        }
    }
}

// More specific to less specific

// throws method ka bracket close hone se pehle lagega or iska mtlb hai k humara method ye error throw kerskta hai
// throws checked exception k liye hota hai or usko handle kerna zaroori hai
// throw hota hai actually exception throw kerne k liye. unchecked