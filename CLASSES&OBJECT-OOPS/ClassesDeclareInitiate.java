class Student {
    String name;    // INITIALIZATION
    int rollNo;
    boolean isStudent;

    // Constructor for Student
    Student() {          // DECLARE
        this.name = "Khubaib";
        this.rollNo = 12;
        this.isStudent = true;
    }
}

public class ClassesDeclareInitiate{
    public static void main(String[] args) {
        Student obj = new Student ();
        System.out.println(obj.name);
        System.out.println(obj.rollNo);
        System.out.println(obj.isStudent);
    }
}