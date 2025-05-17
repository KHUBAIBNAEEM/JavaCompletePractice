package OOP.INHERITENCE;
// In this example we are doing Encapsulation, Polymorphism and Inheritence
class Vehicle{
private int price;

    public Vehicle(int price){
        this.price = price;
    }

    public int getPrice() { // Read only access
    return price;
    }

    public void setPrice(int price){ // Write access as well
    this.price = price;
    }

    public void EngineProcess(){ // method
        System.out.println("The Vehicle Engine Starts......");
    }
}

class Car extends Vehicle{
    public Car(int price){
        super(price); // humein reference (super) dena parhega kyunke parent class ka variable private hai
        System.out.println("The Car price is: " + getPrice());
    }
    @Override
    public void EngineProcess(){
    System.out.println("The Car Engine Starts......");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(int price){
        super(price);
        System.out.println("The Motorcycle price is: " + getPrice());
    }
    @Override
    public void EngineProcess(){
        System.out.println("The Motorcycle Engine Starts......");
    }
}

public class InheritencePolymorphism {
    public static void main(String[] args) {
        try {
            Car C1 = new Car(12);
            C1.EngineProcess();
            Motorcycle B1 = new Motorcycle(13);
            B1.EngineProcess();
        } catch (Exception e) {
            System.out.println("ERROR CODE SAHI KERO APNA");
        }
    }   
}
