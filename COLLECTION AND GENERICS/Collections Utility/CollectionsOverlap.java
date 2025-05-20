import java.util.*;

public class CollectionsOverlap {
    public static void main(String[] args) {
        List<String> user1 = List.of("Java", "Python", "Go");
        List<String> user2 = List.of("Rust", "Python", "C");

        boolean overlap = !Collections.disjoint(user1, user2);
        System.out.println("Has common preferences: " + overlap);
    }
}
