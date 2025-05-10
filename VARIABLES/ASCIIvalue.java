import java.util.Scanner;
public class ASCIIvalue{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character to find the ASCII value: ");
        char ch = sc.next().charAt(0);
        int a = ch;
        System.out.println("The value is: " + a);
    }
}