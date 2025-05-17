package POLYMORPHISM;

class Vehicle{
    public void StartEngine(){ // from private to public
        System.out.println("the Vehicle is starting");
    };
}
  /* protected void Start(){
         StartEngine();
    }
} */

class Carr extends Vehicle{
    @Override
    public void StartEngine(){
      //  super.Start();
        System.out.println("The car is starting...");
    }
}

class Bike extends Vehicle{
    @Override
    public void StartEngine(){
        // super.Start();
        System.out.println("The bike is starting...");
    }
}
public class PolymorphismUpcasting {
    public static void main(String[] args) {
        Vehicle v1 = new Carr();
        Vehicle v2 = new Bike();

        v1.StartEngine();
        v2.StartEngine();

    }
    
}
