package NamingAThread;

public class SimpleThreadNaming extends Thread{
    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SimpleThreadNaming t1=new SimpleThreadNaming();
        SimpleThreadNaming t2=new SimpleThreadNaming();

        t1.start();
        t2.start();
    }
}
