package POLYMORPHISM;

class Employee { // default class hai ye or parent hai ye 
    void work() { // method hai jo kuch return nhi kerha
        System.out.println("Employee working...");
    }
}

class Manager extends Employee { 
    @Override
    void work(){
        System.out.println("Manager working");
    }
    void conductMeeting() {
        System.out.println("Manager conducting meeting");
    }
}

class Engineer extends Employee {

    @Override
    void work(){
        System.out.println("Engineer working");
    }
    void writeCode() {
        System.out.println("Engineer writing code");
    }
}

public class PolymorphismDowncasting {
public static void main(String[] args) {
    Employee e1 = new Manager();
    Employee e2 =  new Engineer(); // normal upcasting kerhe hain hum dono ko
    e1.work();
    e2.work();

    System.out.println("__________________________________________________________");

    if(e1 instanceof Manager){
        Manager m = (Manager) e1;
        m.conductMeeting();
    }

    if (e2 instanceof Engineer){
        Engineer e = (Engineer) e2;
        e.writeCode();
    }
    
/*Why Do We Do This?
Polymorphism lets you use parent class references to refer to objects of subclasses, but sometimes you want to 
call methods that are specific to those subclasses (like conductMeeting() or writeCode()).

Downcasting is the way to access those subclass-specific methods. But you need to be sure that the 
reference is pointing to the right subclass, so we use instanceof to check before we downcast. */

}    
}
