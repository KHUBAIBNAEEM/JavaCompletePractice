public class LoopEvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2)
         {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }
}
