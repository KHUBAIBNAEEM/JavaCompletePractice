package OOP.ABSTRACTION;


// Interface defining a contract for Drawable objects
interface Drawable {
    void draw(); // Abstract method (implicitly public abstract)
}

// Interface defining another contract for Resizable objects
interface Resizable {
    void resize(int factor); // Abstract method
}

// Class implementing both Drawable and Resizable interfaces
class Image implements Drawable, Resizable {
    private String filename;
    private int width;
    private int height;

    public Image(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing image: " + filename + " (Width: " + width + ", Height: " + height + ")");
    }

    @Override
    public void resize(int factor) {
        this.width *= factor;
        this.height *= factor;
        System.out.println("Resized image: " + filename + " to (Width: " + width + ", Height: " + height + ")");
    }
}

// Another class implementing the Drawable interface
class Line implements Drawable {
    private int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2) { // constructor laga hai implement kerne k liye
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
        Image myImage = new Image("logo.png", 100, 50);
        Line myLine = new Line(10, 20, 30, 40);

        myImage.draw();
        myImage.resize(10);
        System.out.println("------------------");
        myLine.draw();
    }
}