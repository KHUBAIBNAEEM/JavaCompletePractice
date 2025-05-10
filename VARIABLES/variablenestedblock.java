// Demonstrate variable shadowing in nested blocks.

public class variablenestedblock {
        public static void main(String[] args) {
            int x = 100; // Outer variable
            System.out.println("OUTER x before block: " + x);
    
            // Nested block
            {
                x = 50; // Shadowing outer 'x' by reassigning, NOT declaring a new variable
                System.out.println("INNER x: " + x); // Prints 50 (modified x)
            }
    
            // The value of x remains changed outside the block
            System.out.println("OUTER x after block: " + x); // Prints 50
        }
    }
    
    
