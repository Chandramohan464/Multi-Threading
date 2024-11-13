public class ThreadWithRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadWithRunnable m=new ThreadWithRunnable();
        Thread t1=new Thread(m);
        
        t1.start();
    }
}
