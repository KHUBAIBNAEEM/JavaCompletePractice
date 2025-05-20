import java.util.*;

public class CollectionsListCreation {
    public static void main(String... args) {
        // List<Integer> cl = Arrays.asList(1,4, 3, 6, 5); 
        List<Integer> cl = new ArrayList<>(); 
        System.out.println(cl);
        Collections.addAll(cl, 8,6,1,3,10);
        Collections.sort(cl);
        System.out.println(cl);
        int max = Collections.max(cl);
        int min = Collections.min(cl);
        System.out.println("Max: " + max + " "+"Min: " + min);
    }
    
}
