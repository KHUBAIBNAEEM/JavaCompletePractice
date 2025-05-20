
public class VarArgsOverloading {
    public static void processData(int... values) {
        System.out.println("Processing varargs: " + java.util.Arrays.toString(values));
    }

    public static void processData(int[] values) {
        System.out.println("Processing array: " + java.util.Arrays.toString(values));
    }

    public static void main(String... args) {
        VarArgsOverloading.processData(1, 2, 3); // Calls the varargs version
        VarArgsOverloading.processData(new int[]{4, 5}); // Calls the array version
        // processData(); This would call the varargs version with an empty array
        // processData(null); This would call the array version (null is a valid array reference)
    }
}