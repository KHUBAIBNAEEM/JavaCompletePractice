import java.util.HashSet;
import java.util.Set;

public class SetCommonElements {
    public static void main(String[] args) {
        System.out.println("Question 4: Finding Common Elements between Two Sets");
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        Set<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(30);

        Set<Integer> commonElements = findCommonElements(set1, set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Common Elements: " + commonElements);
        System.out.println();
    }
     public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);
        return common;
    }

}
