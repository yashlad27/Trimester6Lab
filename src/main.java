import java.lang.*;

class ThreadDemo1 extends Thread{
    public void run(){
        System.out.println("Inside run method.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new multithreadingDemo(), "Thread-1");
        Thread t2 = new Thread(new multithreadingDemo(), "Thread-2");
        Thread t3 = new Thread(new multithreadingDemo(), "Thread-3");

        System.out.println("t1 thread Priority: "+t1.getPriority());
        System.out.println("t2 thread Priority: "+t2.getPriority());
        System.out.println("t3 thread Priority: "+t3.getPriority());

        t1.setPriority(3);
        t2.setPriority(6);
        t3.setPriority(9);

        System.out.println("t1 thread Priority: "+t1.getPriority());
        System.out.println("t2 thread Priority: "+t2.getPriority());
        System.out.println("t3 thread Priority: "+t3.getPriority());

        System.out.println("Currently executing Thread: "+Thread.currentThread().getName());
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());

        System.out.println("Name of executed thread: "+t1.getName());
        System.out.println("Name of executed thread: "+t2.getName());
        System.out.println("Name of executed thread: "+t3.getName());

    }
}
