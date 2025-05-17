
public class Fruit implements Cloneable {
    String apple;

    public Fruit(String a) {
        this.apple = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Fruit: " + apple;
    }
}

class EncapsulationClone {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple");
        try {
            Fruit f2 = (Fruit) f1.clone();
            System.out.println(f2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
