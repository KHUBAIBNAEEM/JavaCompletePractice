class Singleton {
    private static Singleton instance;  // Static variable to hold the single instance

    private Singleton() {}  // Private constructor prevents direct instantiation

    public static Singleton getInstance() {  // Public method to access the instance
        if (instance == null) {  // Creates the instance only when first accessed
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance is working!");
    }
}

public class EncapsulationSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();  // Getting instance 1
        Singleton obj2 = Singleton.getInstance();  // Getting instance 2

        obj1.showMessage();  // Outputs: Singleton instance is working!

        System.out.println(obj1 == obj2);  // True, because both are the same instance
    }
}