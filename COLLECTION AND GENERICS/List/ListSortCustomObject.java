package List;

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ListSortCustomObject {
    public static void main(String... args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        System.out.println("Unsorted List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the list in descending order of marks
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println("\nSorted List (Descending by Marks):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}