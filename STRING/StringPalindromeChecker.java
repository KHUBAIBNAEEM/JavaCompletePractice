public class StringPalindromeChecker {
    public static void main(String[] args) {
        String s1 = "MADAM";
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s1.equals(s2));
        
    }
    
}
 /*In Java, StringBuilder is used when we need to modify strings frequently.
  Unlike String, which is immutable (unchangeable once created),
  StringBuilder is mutable, meaning we can modify its contents without creating a new object each time. */