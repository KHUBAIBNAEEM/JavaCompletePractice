package List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String... args) {
        // Creating an ArrayList of Strings
        List<String> colors = new ArrayList<>();
        System.out.println("Method 1");
        // Adding elements to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Initial list: " + colors); 
        System.out.println("____________________________________________________________________");

        System.out.println("Method 2");
        // Inserting an element at a specific index
        colors.add(1, "Yellow");
        System.out.println("List after insertion: " + colors); 
        System.out.println("____________________________________________________________________");


        System.out.println("Method 3");        
        // Accessing an element by its index
        String secondColor = colors.get(1);
        System.out.println("Element at index 1: " + secondColor); 
        System.out.println("____________________________________________________________________");

        System.out.println("Method 4");
        // Updating an element at a specific index
        colors.set(2, "Orange");
        System.out.println("List after update: " + colors);
        System.out.println("____________________________________________________________________");


        System.out.println("Method 5");
        // Removing an element by its value
        colors.remove("Red");
        System.out.println("List after removing 'Red': " + colors);
        System.out.println("____________________________________________________________________");

        System.out.println("Method 6");
        // Getting the size of the list
        int size = colors.size();
        System.out.println("Size of the list: " + size); 
        System.out.println("____________________________________________________________________");

        System.out.println("Method 7");
        // Checking if an element exists in the list
        boolean containsBlue = colors.contains("Blue");
        System.out.println("Does the list contain 'Blue'? " + containsBlue); // Output: Does the list contain 'Blue'? true
        System.out.println("____________________________________________________________________");

        System.out.println("Method 8");        
        // Iterating through the list
        System.out.println("Iterating through the list:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("____________________________________________________________________");
    }
}