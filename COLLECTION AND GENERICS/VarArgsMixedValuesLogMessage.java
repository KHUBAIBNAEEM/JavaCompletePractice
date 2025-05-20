    
class VarArgsLog{
    public static void logMessage(String level, String format, Object... args) {
        System.out.printf("[" + level + "] " + format + "%n", args);
    }
}

public class VarArgsMixedValuesLogMessage {
    public static void main(String... args) {
       VarArgsLog.logMessage("INFO", "User %s logged in at %tD %tT", "Alice", System.currentTimeMillis(), System.currentTimeMillis());
        VarArgsLog.logMessage("ERROR", "File not found: %s", "/path/to/missing/file.txt");
        VarArgsLog.logMessage("DEBUG", "Processing value: %d", 42);
    }
}