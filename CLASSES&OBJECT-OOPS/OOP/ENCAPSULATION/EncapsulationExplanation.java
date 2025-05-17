package OOP.ENCAPSULATION;

class Car {
    private String model;

    // Constructor
    Car(String mo) {
        this.model = mo;
    }

    // Getter method
    public String getModel() {
        return model; // read only kerne k liye
    }

    // Setter method
    public void setModel(String model) {
        this.model = model; // write kerne k liye
    }
}

public class EncapsulationExplanation {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota"); // Object created

        // Using getter
        System.out.println("Car model: " + myCar.getModel());

        // Using setter to change the value // write hogya ye pe
        myCar.setModel("Honda");
        System.out.println("Updated Car model: " + myCar.getModel());
    }
}
