package OOP.ENCAPSULATION;
class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) { //const
        this.rollNumber = rollNumber;
        this.name = name;
    }


    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

}
public class EncpsulationReadWriteOnly {
public static void main(String[] args) {
    Student s1 = new Student(121, "Ali");
    System.out.println(s1.getRollNumber());
    System.out.println(s1.getName()); //read only

    System.out.println("****************************");
    // writing values 
    s1.setName("KHUBAIB");
    System.out.println(s1.getName());
    System.out.println(s1.getRollNumber());
    
}
    
}
// in this program we did write the name but we can only read the roll number because of access control through access modifier this is encapsulation
