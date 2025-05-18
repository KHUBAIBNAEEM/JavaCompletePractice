import java.io.FileReader;

public class FileReadExample {
    public static void main(String[] args) {
        String s1 = "C:\\Users\\The Elysium Team A\\OneDrive\\JavaCourse\\JAVA COMPLETED - PRACTICE 2024\\EXCEPTION HANDLING & FILE READING\\Writer.txt";
        try (FileReader Fr = new FileReader(s1)){
            int n1 = 0;

            do {
                n1 = Fr.read(); // read method laga hai yehan
                System.out.print((char)n1);
            }

            while (n1 != -1);
        } catch (Exception e) {
            System.out.println("The error occurs");
        }
    }
    
}
