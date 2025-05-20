import java.util.*;
public class SetHash {
    public static void main(String... args) {
        Set<String> s1 = new HashSet<String>();
        s1.add("Pakistan");
        s1.add("China");
        s1.add("Turkey");
        s1.add("India");
        System.out.println(s1);

        System.out.println(s1.add("Pakistan"));
        System.out.println(s1.contains("China"));
        s1.remove("India");
        System.out.println("The World so green now " + s1);
        System.out.println(s1.size());
    }
}
