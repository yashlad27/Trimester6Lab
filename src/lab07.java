import java.lang.*;

public class lab07 {
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i<n; i++){
            MulThread obj2 = new MulThread("Thread "+ i);
            obj2.start();

            Thread obj3 = new Thread(new MulRun());
            obj3.start();
        }
        System.out.println("---------x----------");
        // thread class object -> "t1"
        MulThread t1 = new MulThread("Thread-1"); // creating object of thread
        System.out.println("before starting thread isAlive: "+t1.isAlive()); // before
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException ie){
            // code
        }
        System.out.println("after starting thread isAlive: "+t1.isAlive()); // after
        System.out.println("---------x---------");
        // runnable interface object->
        Thread t2 = new Thread(new MulRun()); // creating object of runnable
        System.out.println("before starting thread isAlive: "+t2.isAlive());
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException ie){
            // code
        }
        System.out.println("after starting thread isAlive: "+t2.isAlive());

        System.out.println("-----------x----------");
    }
}
// Thread class :-
class MulThread extends Thread{
    MulThread(String S){
        super(S);
    }
        public void run(){

            try{
                System.out.println("Thread "+Thread.currentThread()+" is running.");
            }
            catch(Exception e){
                System.out.println("Exception is caught!");
            }

            try
            {
                Thread.sleep(100);
                System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());
            }
            catch (InterruptedException ie){

            }
        }
}
// Runnable interface:-
class MulRun implements Runnable{
    @Override
    public void run(){
        try {
            System.out.println("Thread " + Thread.currentThread() + " is running.");
        } catch (Exception e) {
            System.out.println("Exception is caught!");
        }
    }
}