import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashOrdered {
    public static void main(String... args) {
        System.out.println("Question: LinkedHashSet - Maintaining Insertion Order");
        Set<String> fruits = new LinkedHashSet<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate
        System.out.println("LinkedHashSet: " + fruits); // Order will be Apple, Banana, Orange
        System.out.println();
    }
}
