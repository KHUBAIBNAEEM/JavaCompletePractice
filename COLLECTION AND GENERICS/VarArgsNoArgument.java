
public class VarArgsNoArgument {
    public static void printAll(String... items) {
        System.out.println("Number of items: " + items.length);
        if (items.length > 0) {
            System.out.println("Items:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        } else {
            System.out.println("No items provided.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printAll("apple", "banana", "cherry");
        printAll();
    }
}