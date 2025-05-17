package OOP.ENCAPSULATION;
// Q1: Create a class `Person` with a constructor and getter/setter methods.

class Person { // Default Access Modifier; outer class can be public & default only
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() { // write only and to get the return of the value/parameter of constructor
    return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) { 
        this.age = age;
    }
    public void setName(String name) { // setter can be used to modify the parameters we give in constructor or to read only property 
        this.name = name;
    }
    }

/*  The constructor initializes the object 
when it is created, but setter methods provide flexibility
 by allowing values to be updated later. */

public class EncapsulationUseConstructorGetterSetter {
    public static void main(String[] args) {
        Person P1 = new Person("Khubaib", 23);
        System.out.println("Name: " + P1.getName() + " " + "Age: " + P1.getAge());
        System.out.println("****************************************************");
        P1.setAge(21);
        P1.setName("Shaham");
        System.out.println("Name: " + P1.getName() + "Age: " + P1.getAge());

    }
}
