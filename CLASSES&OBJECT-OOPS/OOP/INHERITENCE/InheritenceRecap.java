package OOP.INHERITENCE;
/* Inheritence in java works with extends keyword that means we are extending the super class/parent class to the
subclass/child class. There can be multiple childs but only one parent. We can override the methods of superclass. 

final keyword is used to stop inheritence if it use with class, if with method stops override and if with variable 
a final instance variable must be initialized and its value cannot be 
changed after initialization. This is often used in conjunction with inheritance to define constants within classes.
*/

class Animal { //Super Class
    private String name;
    public Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor called for: " + name);

    }
    public String getName() {
        return name;
    }
    public void voice(){
        System.out.println("Generic Voice of Animal:");
    }
    public void action() {
        System.out.println("Parent class animal fetching the ball");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
        System.out.println("Dog Constructor called for: " + name);
    }

    @Override
    public void voice(){ // over riding parent method
        System.out.println("Woof!!!!!");
    }

    @Override
    public void action(){
        System.out.println(getName() + " is fetching the ball");

    }

    public void price(){
        System.out.println("$12.0");
    }
}

public class InheritenceRecap {
    public static void main(String[] args) {
        Dog Janwar1 = new Dog("Tommy");
        Janwar1.voice();
        Janwar1.action();
        Janwar1.price();
    }
}