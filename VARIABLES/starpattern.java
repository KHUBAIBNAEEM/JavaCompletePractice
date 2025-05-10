//Print a pyramid pattern using string literals (REVERSE)

public class starpattern {
public static void main(String[] args) {
    String star = "*";
    for(int i=1; i<=10; i++){
        System.out.println(star.repeat(i));
    }
    System.out.println("____________________________________________");
    for (int j=10; j>=1; j--){
        System.out.println(star.repeat(j));
    }
}
    
}
