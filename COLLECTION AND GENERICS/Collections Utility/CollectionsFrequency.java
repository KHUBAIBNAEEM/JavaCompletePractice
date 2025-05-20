import java.util.*;

public class CollectionsFrequency {
    public static void main(String[] args) {
        List<String> responses = Arrays.asList("Yes", "No", "Yes", "Maybe", "Yes", "No");

        System.out.println("Yes: " + Collections.frequency(responses, "Yes"));
        System.out.println("No: " + Collections.frequency(responses, "No"));
        System.out.println("Maybe: " + Collections.frequency(responses, "Maybe"));

    }
}