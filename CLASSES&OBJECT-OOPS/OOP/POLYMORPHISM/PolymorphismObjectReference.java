package POLYMORPHISM;
class Dog {
    private String name; // variable bana 
    
    Dog(String name) { // constructor se usko initiate kerwadia ]
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class PolymorphismObjectReference {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno");
        Dog d2 = d1; // d2 points to same Dog as d1
        System.out.println(d1.getName());
        System.out.println(d2.getName());
        System.out.println("_____________________________________________");
        d2.setName("Max");
        
        System.out.println(d1.getName()); // ?
        System.out.println(d2.getName()); // ?
    }

    
}
