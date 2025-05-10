import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;

public class LocalDateTimeNow {
  public static void main(String[] args) {
    LocalDateTime time = LocalDateTime.now(); // Create a date object ** Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    System.out.println(time); // Display the current date
  }
}