public class mutlithreading {
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i<n; i++){
            multithreadingdemo object = new multithreadingdemo();
            object.start();
        }
    }
}
class multithreadingdemo extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread()+" is running.");
        }
        catch(Exception e){
            System.out.println("Exception is caught!");
        }
    }
}