package ThreadPriority;

public class IllegalArgumentException extends Thread{
    public static void main(String[] args) {
        Thread.currentThread().setPriority(17);
        System.out.println("Priority of current thread is: "+Thread.currentThread().getPriority());
    }
}
