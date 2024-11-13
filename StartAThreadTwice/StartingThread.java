package StartAThreadTwice;

public class StartingThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        StartingThread t1 = new StartingThread();
        t1.start();
        t1.start();
    }
}
