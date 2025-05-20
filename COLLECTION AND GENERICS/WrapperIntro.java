/*Wrapper classes in Java are used when primitive data types (like int, double, or char) need to be treated as objects. Here are key scenarios where wrapper classes are useful:

Collections Framework: Java’s collection classes (ArrayList, HashSet, etc.) only store objects, so primitives must be wrapped (e.g., Integer instead of int).

Autoboxing & Unboxing: Java automatically converts primitives to wrapper objects (autoboxing) and vice versa (unboxing). This is useful for seamless operations with objects.

Synchronization (Multithreading): When working with synchronization mechanisms, objects (like Integer) are preferred over primitives.

Utility Methods: Wrapper classes provide useful methods like Integer.parseInt(), Double.valueOf(), and Boolean.valueOf() for conversions and manipulation.

HashCode and Equals: Unlike primitives, wrapper classes support overriding methods like .hashCode() and .equals(), making them suitable for hashing in collections.

Reflection & Generics: Reflection APIs and generics require objects, making wrapper classes essential when dealing with runtime type inspection. */


public class WrapperIntro {

    public static void main(String[] args) {
        // Question 1: Boxing and Unboxing

        // Manual Boxing
        int primitiveInt = 10;
        Integer wrapperInt = new Integer(primitiveInt); // Boxing
        System.out.println("Manually boxed Integer: " + wrapperInt);

        // Manual Unboxing
        int unboxedInt = wrapperInt.intValue(); // Unboxing
        System.out.println("Manually unboxed int: " + unboxedInt);

        // Autoboxing
        double primitiveDouble = 3.14;
        Double wrapperDouble = primitiveDouble; // Autoboxing
        System.out.println("Autoboxed Double: " + wrapperDouble);

        // Autounboxing
        double unboxedDouble = wrapperDouble; // Autounboxing
        System.out.println("Autounboxed double: " + unboxedDouble);

        System.out.println("\n// Question 2: Wrapper Class Methods");

        // Converting String to Integer
        String intString = "123";
        Integer parsedInt = Integer.parseInt(intString);
        System.out.println("Parsed Integer from String: " + parsedInt);

        // Getting primitive double from Double object
        Double doubleObject = new Double(2.71);
        double primitiveFromDouble = doubleObject.doubleValue();
        System.out.println("Primitive double from Double: " + primitiveFromDouble);

        // Comparing Long objects
        Long long1 = new Long(100);
        Long long2 = new Long(200);
        int comparisonResult = long1.compareTo(long2);
        if (comparisonResult < 0) {
            System.out.println(long1 + " is less than " + long2);
        } else if (comparisonResult > 0) {
            System.out.println(long1 + " is greater than " + long2);
        } else {
            System.out.println(long1 + " is equal to " + long2);
        }

        // Getting String representation of Boolean
        Boolean boolObject = true;
        String boolString = boolObject.toString();
        System.out.println("String representation of Boolean: " + boolString);

        System.out.println("\n// Question 3: Immutability");
        // (No specific code needed for this question, it's conceptual)

        System.out.println("\n// Question 4: Use Cases");
        // (No specific code needed for this question, it's conceptual)
    }
}