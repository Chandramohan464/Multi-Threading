package JoiningAThread;

class ABC extends Thread{
    Thread threadToInterupt;

    public void run(){
        threadToInterupt.interrupt();
    }
}

public class InteruptedThreadJoin {
    public static void main(String[] args) {
        try {
            ABC abc = new ABC();
            abc.start();
            abc.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
