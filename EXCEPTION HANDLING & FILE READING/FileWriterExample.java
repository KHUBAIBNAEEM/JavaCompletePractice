import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // FileWriter eik checked exception hai jisko throws ya pht try catch se kerna zaroori hai
        String file = "C:\\Users\\The Elysium Team A\\OneDrive\\JavaCourse\\JAVA COMPLETED - PRACTICE 2024\\EXCEPTION HANDLING & FILE READING\\Writer.txt";
        try (FileWriter w1 = new FileWriter(file)) { // try with recource jo hota hai wo usko close() kerne ki zimedai khud leta hai
            w1.write("Hello this is Khubaib"); // write method laga hai 
            
            for(int i = 0; i<=50; i++){
                for(int j = 1; j<=i; j++){
                w1.write("*");
                }
                w1.write("\n");
            }
            w1.flush();
            System.out.println("The file has been written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file." + e.getMessage());
            e.printStackTrace();
        }
    }
}
