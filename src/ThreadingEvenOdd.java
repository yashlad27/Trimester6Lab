
class printEvenOdd {

    int cnt=1;
    static int N=10;

    public void printOddnumber()
    {
        while(cnt < N)
        {
            while(cnt % 2 == 1){
                System.out.println(cnt + " "+"odd");

            }
            cnt++;
        }
    }

    public void printEvennumber()
    {
        while(cnt < N)
        {
            while(cnt % 2 == 0){
                System.out.println(cnt + " "+"even");

            }
            cnt++;
        }
    }
}
public class ThreadingEvenOdd {

    public static void main(String[] args) throws InterruptedException {

        final printEvenOdd peo = new printEvenOdd();
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                peo.printEvennumber();
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                peo.printOddnumber();
            }
        });

        t1.start();
        //t1.join();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

}
