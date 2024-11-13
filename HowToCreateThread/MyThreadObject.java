public class MyThreadObject implements Runnable{
    public void run(){
        System.out.println("Now Thread is Running...");
    }

    public static void main(String[] args) {
        Runnable r=new MyThreadObject();
        Thread t=new Thread(r,"My new Thread");
        t.start();

        System.out.println(t.getName());
    }
}
