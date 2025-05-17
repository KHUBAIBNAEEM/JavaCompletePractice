package OOP.ABSTRACTION.OOP.ABSTRACTION;

// Abstract class defining a process with some steps
abstract class DataProcessor {

    // Template method defining the overall process
    public final void processData() {
        readData();
        validateData();
        processActualData();
        writeData();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void readData();
    protected abstract void validateData();
    protected abstract void processActualData();
    protected abstract void writeData();

    // Concrete helper method
    protected void log(String message) {
        System.out.println("[LOG] " + this.getClass().getSimpleName() + ": " + message);
    }
}

// Concrete subclass for processing text data
class TextDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        log("Reading text data from a file.");
        // Implementation to read text data
    }

    @Override
    protected void validateData() {
        log("Validating text data format.");
        // Implementation to validate text data
    }

    @Override
    protected void processActualData() {
        log("Processing the text content.");
        // Implementation to process text data
    }

    @Override
    protected void writeData() {
        log("Writing processed text data to a new file.");
        // Implementation to write text data
    }
}

// Concrete subclass for processing numerical data
class NumericalDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        log("Reading numerical data from a database.");
        // Implementation to read numerical data
    }

    @Override
    protected void validateData() {
        log("Checking for valid numerical ranges.");
        // Implementation to validate numerical data
    }

    @Override
    protected void processActualData() {
        log("Performing calculations on numerical data.");
        // Implementation to process numerical data
    }

    @Override
    protected void writeData() {
        log("Saving processed numerical data to a spreadsheet.");
        // Implementation to write numerical data
    }
}

public class AbstractionLogCase {
    public static void main(String[] args) {
        DataProcessor textProcessor = new TextDataProcessor();
        DataProcessor numericalProcessor = new NumericalDataProcessor();

        System.out.println("Processing Text Data:");
        textProcessor.processData();
        System.out.println("\nProcessing Numerical Data:");
        numericalProcessor.processData();
    }
}