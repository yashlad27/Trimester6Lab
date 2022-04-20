public class threadingA1 {
    public static void main(String[] args) throws InterruptedException {
        int N=10;

        PrintOddEvenNumber peo = new PrintOddEvenNumber();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                peo.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                peo.printOdd();
            }
        });

        t1.start();
        t1.join();
        t2.start();
    }
}
