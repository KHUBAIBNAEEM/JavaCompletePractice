import java.util.*;

class Logger {
    private static List<String> logs = Collections.synchronizedList(new ArrayList<>());

    public static void log(String message) {
        logs.add(message);
    }

    public static void printLogs() {
        synchronized (logs) {
            logs.forEach(System.out::println);
        }
    }
}

public class CollectionsSynchronize {
    public static void main(String[] args) {

        // Logging some messages
        Logger.log("Application started");
        Logger.log("User logged in");
        Logger.log("Error: Invalid password");

        // Printing the log
        Logger.printLogs();
    }
}
