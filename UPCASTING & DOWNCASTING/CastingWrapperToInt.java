public class CastingWrapperToInt {
    public static void main(String[] args) {
        Integer integerObject = 11;
        int intValue = integerObject; // Auto-unboxing

        System.out.println("Integer object: " + integerObject);
        System.out.println("Int value: " + intValue);
    }
}

/*A wrapper class in Java is an object representation of primitive data types.
 It allows primitive values (int, double, char, etc.) to be treated
 as objects, which is useful when working with collections, generics, and APIs that require objects */