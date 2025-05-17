package OOP.ABSTRACTION.OOP.ABSTRACTION.OOP.ABSTRACTION;

import OOP.*;

/* Abstaction works on the principle of hiding info and only showing what is necessary
It works on Abstract keyword which works on (method and classes). Interfaces. Abstract class ka maqsad ye hota hai k
us ka object na banaejae sirf usko inherit kia jae. Extend kare. mtlb main class ka koi maqsad nhi hai but usko 
extend kia jae or usmein or methods dalke maksad dia jae.

The abstract method in java: agar class abstarct hai tou method abstact ya non-abstract hoskta hai. BUT. agar method
abstract hai tou class ka abstract hona lazmi hai

Interfaces wo hai jinke andar humein sirf abstract methods defince kerne houn

Abstract class mein se abstract methods and interface mein se uske methods implement (over ride) kerna lazmi hai */


 /*Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to 
create an "Animal" object in the MyMainClass)

Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final

An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?

1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces. 

Note: To implement multiple interfaces, separate them with a comma (see example below). */

// Lets take and example of Abstration it also implements Encapsulation, Abstraction, Inheritence

// Abstract class representing a Shape

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate the area
    public abstract double calculateArea();

    // Concrete method to get the color
    public String getColor() {
        return color;
    }

    // Concrete method that uses the abstract method
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
    }
}

// Concrete subclass representing a Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Concrete subclass representing a Circle
class Circlee extends Shape {
    private double radius;
    private static final double PI = Math.PI;

    public Circlee(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}

public class Abstractionintro {
    public static void main(String[] args) {
        // Cannot create an instance of an abstract class directly
        // Shape s = new Shape("Red"); // This would cause a compile-time error

        Rectangle rect = new Rectangle("Blue", 5, 10);
        Circlee circle = new Circlee("Green", 7);

        rect.display();
        System.out.println("------------------");
        circle.display();
    }
}
