public class Job implements Runnable {
    private int jobNumber;

    // Constructor to initialize the job number
    Job(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    // The run method contains the logic to be executed by the thread
    public void run() {
        // Undertake required work, here we will emulate it by sleeping for a period
        System.out.println("Job: " + jobNumber + " is being processed by thread : "
                + Thread.currentThread().getName());

        try {
            // Simulate some work by sleeping for 1000 milliseconds (1 second)
            Thread.sleep((int) (1000));
        } catch (InterruptedException e) {
            // InterruptedException is caught, but no special handling is performed
            // In a real-world application, you might want to handle interruptions appropriately
        }

        System.out.println("Job: " + jobNumber + " is ending in thread : "
                + Thread.currentThread().getName());
    }
}
