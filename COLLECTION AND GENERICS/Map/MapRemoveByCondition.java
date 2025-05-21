
import java.util.*;

public class MapRemoveByCondition {
 
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 2);
        map.put("C", 7);

        map.entrySet().removeIf(entry -> entry.getValue() < 3);

        System.out.println(map);
    }
}
