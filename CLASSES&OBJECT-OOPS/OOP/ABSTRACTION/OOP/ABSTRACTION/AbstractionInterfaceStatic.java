package OOP.ABSTRACTION.OOP.ABSTRACTION;

interface Logger {
    void logMessage(String message);

    // Default method (introduced in Java 8)
    default void logInfo(String message) {
        logMessage("[INFO] " + message);
    }

    // Default method
    default void logWarning(String message) {
        logMessage("[WARNING] " + message);
    }

    // Static method (introduced in Java 8)
    static void printTimestamp() {
        System.out.println("Current Timestamp: " + System.currentTimeMillis());
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Console: " + message);
    }
}

class FileLogger implements Logger {
    private String filename;

    public FileLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void logMessage(String message) {
        // In a real scenario, this would write to the file
        System.out.println("File (" + filename + "): " + message);
    }
}

public class AbstractionInterfaceStatic {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger("app.log");

        consoleLogger.logMessage("Application started.");
        consoleLogger.logInfo("User logged in successfully.");
        consoleLogger.logWarning("Low disk space.");

        System.out.println("------------------");

        fileLogger.logMessage("Database connection established.");
        fileLogger.logInfo("Configuration loaded.");
        fileLogger.logWarning("Potential security vulnerability.");

        System.out.println("------------------");

        Logger.printTimestamp(); // Calling the static method of the interface
    }
}
