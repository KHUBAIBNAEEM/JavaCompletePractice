class Circle {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class ClassesCircle {
    public static void main(String[] args) {
        Circle obj5 = new Circle(4.4);

        // Displaying results with better formatting
        System.out.println("Radius: " + obj5.getRadius());
        System.out.println("Area: " + String.format("%.2f", obj5.calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", obj5.calculateCircumference()));
    }
}
