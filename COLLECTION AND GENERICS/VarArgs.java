import java.util.Arrays;

// Variable Arguments (VarArgs) Java 5 onwards ka feature hai
// Ye ek array ki tarah kaam karta hai aur 0 ya zyada arguments le sakta hai
// Jab bhi method mein multiple arguments ho aur ek vararg ho, tou vararg hamesha end mein hona chahiye
// Isay '...' se define kiya jata hai
// Object jo hai wo har type ko leleta hai

class Fruits {
    public void names(String... a) {
        System.out.println(Arrays.toString(a));
    }
}

public class VarArgs {
    public static void main(String... args) {
        Fruits ft = new Fruits();

        ft.names("Apple", "Banana", "Grapes");
        ft.names(args);  // CLI se input lenay ke liye
        ft.names("Mango", "Orange");

        // Corrected line: if you meant to print "Pineapple"
        ft.names(new String[]{"Pineapple"});
    }
}
