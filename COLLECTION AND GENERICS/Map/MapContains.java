import java.util.*;

public class MapContains {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 90);
        scores.put("Alice", 85);

        System.out.println("Contains key 'John'? " + scores.containsKey("John"));
        System.out.println("Contains value 85? " + scores.containsValue(84));
    }
}
