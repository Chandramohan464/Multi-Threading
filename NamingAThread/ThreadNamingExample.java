package NamingAThread;

class ThreadName extends Thread{
    ThreadName(String threadName){
        super(threadName);
    }

    public void run(){
        System.out.println("Thread is running...");
    }
}

public class ThreadNamingExample {
    public static void main(String[] args) {
        ThreadName thread1 = new ThreadName("First Thread");
        ThreadName thread2 = new ThreadName("Second Thread");

        System.out.println("Thread-1: "+thread1.getName());
        System.out.println("Thread-2: "+thread2.getName());

        thread1.start();
        thread2.start();
    }
}
