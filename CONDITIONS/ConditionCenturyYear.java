import java.util.Scanner;

public class ConditionCenturyYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int year = sc.nextInt();
        if (year % 100 == 0){
            System.out.println("Century Year!!!!!");
        }
        else {
            System.out.println("Regular Year");
        }
        sc.close();
    }
}
