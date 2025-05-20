import java.util.Set;
import java.util.TreeSet;

public class SetTreeSort {
    public static void main(String[] args) {
        System.out.println("Question: TreeSet - Sorted Elements");
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        System.out.println("TreeSet (Sorted): " + numbers); // Output will be [1, 3, 5]
        System.out.println();

    }
}
