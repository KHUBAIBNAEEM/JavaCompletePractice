
import java.util.*;

public class MapFrequencyCount {
    public static void main(String[] args) {
        String input = "banana";
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);
    }
}
