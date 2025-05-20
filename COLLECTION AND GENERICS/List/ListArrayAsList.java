package List;
import java.util.*;

// This wll give an error Because Arrays.asList() returns a fixed-size list backed by the array, and adding/removing elements is not supported.
public class ListArrayAsList {
    public static void main(String[] args) {
        try {
            List <String> s1 =  Arrays.asList("hello", "World", "Pakistan");
            s1.add("Karachi");
        } catch (UnsupportedOperationException e) {
            System.out.println("fix the code: " + e.getMessage());
        }
        
    }
    
}
