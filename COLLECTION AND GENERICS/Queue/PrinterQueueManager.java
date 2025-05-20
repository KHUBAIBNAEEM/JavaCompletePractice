package Queue;

import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    private String documentName;

    public PrintJob(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    @Override
    public String toString() {
        return "PrintJob{" +
               "documentName='" + documentName + '\'' +
               '}';
    }
}

class PrinterQueueManager { // Renamed the class to match the instantiation in main
    private Queue<PrintJob> printQueue = new LinkedList<>();

    public void submitJob(PrintJob job) {
        System.out.println("Submitting print job: " + job.getDocumentName());
        printQueue.offer(job); // Use offer to add to the queue
        System.out.println("Current queue: " + printQueue);
    }

    public void processNextJob() {
        PrintJob nextJob = printQueue.poll(); // Use poll to retrieve and remove
        if (nextJob != null) {
            System.out.println("Processing print job: " + nextJob.getDocumentName());
            // Simulate printing time
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Finished printing: " + nextJob.getDocumentName());
        } else {
            System.out.println("Print queue is empty.");
        }
        System.out.println("Current queue: " + printQueue);
    }

    public PrintJob peekNextJob() {
        return printQueue.peek(); // Use peek to view the next job without removing
    }

    public boolean isQueueEmpty() {
        return printQueue.isEmpty();
    }

    public int getQueueSize() {
        return printQueue.size();
    }

    public static void main(String... args) {
        PrinterQueueManager printerManager = new PrinterQueueManager();

        printerManager.submitJob(new PrintJob("Document_A.pdf"));
        printerManager.submitJob(new PrintJob("Spreadsheet_B.xlsx"));
        printerManager.submitJob(new PrintJob("Presentation_C.pptx"));

        System.out.println("\nNext job to process: " + printerManager.peekNextJob());
        System.out.println("Is queue empty? " + printerManager.isQueueEmpty());
        System.out.println("Queue size: " + printerManager.getQueueSize());

        System.out.println("\nProcessing jobs:");
        printerManager.processNextJob();
        printerManager.processNextJob();
        printerManager.processNextJob();
        printerManager.processNextJob(); // Try to process when empty
    }
}