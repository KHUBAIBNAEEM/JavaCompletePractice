package POLYMORPHISM;
// method overloading mein ya tou parameter differ houn ya tou type for e.g int , String , etc
// constructor overloading mein signature mtlb sirf parameter pe farq parhta hai
// ye compile time poly hai
class Overloading {

    public int add(int a, int b) { //method
        return a + b;
    }

    public String add(String a, String b) {
        return a.concat(b);
    }

    Overloading(){
        System.out.println("This is the default constructor");
    }

    Overloading(String pop){
        System.out.println(pop);

    }
}
public class PolymorphismMethodOverloading {
    public static void main(String[] args) {
        Overloading over = new Overloading();
        System.out.println(over.add(4, 5));
        System.out.println(over.add("Khubaib", " Naeem"));
        System.out.println("_________________________________________________________");
        Overloading over1 = new Overloading("This is the parameterized constructor");
        
    }
}
