import java.util.*;

public class MapConversionList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Red", 1);
        map.put("Blue", 2);
        map.put("Green", 3);

        List<String> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
    }
}
