public class mutlithreading {
    public static <mutlithreadingDemo> void main(String[] args) {
        int n=8;
        for(int i=0; i<n; i++){
            multithreaddemo object = new multithreaddemo("Thread "+ i);
            object.start();

            Thread obj = new Thread(new multithreadingDemo());
//            mutlithreadingDemo obj1 = new multithreadingDemo();
            obj.start();

        }
    }
}
class multithreaddemo extends Thread{

   multithreaddemo(String a) {
       super(a);
   }
    public void run(){

        try{
            System.out.println("Thread "+Thread.currentThread()+" is running.");
        }
        catch(Exception e){
            System.out.println("Exception is caught!");
        }
    }
}

class multithreadingDemo implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Thread "+Thread.currentThread()+" is running.");
        }
        catch(Exception e){
            System.out.println("Exception is caught!");
        }
    }
}