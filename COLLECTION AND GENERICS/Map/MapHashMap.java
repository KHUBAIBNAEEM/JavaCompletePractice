import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapHashMap {
    public static void main(String... args) {
        Map<String, Double> mp1 = new TreeMap(); // tree order mein print karega
        mp1.put("Red", 0.0); mp1.put("Green", 1.0); mp1.put("Yellow", 0.5);
        /* for (Double values : mp1.values()) {
            System.out.println(values);
        };
        */

        for (String keySet : mp1.keySet()) { //only keys print
            System.out.println(keySet);
        }

     for (Entry<String,Double> entrySet : mp1.entrySet()) {
        System.out.println(entrySet); // dono kv print
        
     }
        
        
    }

    
}
