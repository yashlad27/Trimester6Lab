public class multithreadingDemo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread() + " is running.");
        } catch (Exception e) {
            System.out.println("Exception is caught!");
        }
    }
}
