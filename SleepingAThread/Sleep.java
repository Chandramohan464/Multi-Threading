package SleepingAThread;

public class Sleep extends Thread{
    public void run(){
        try {
            for(int i=1;i<5;i++){
                Thread.sleep(500);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Sleep t1=new Sleep();
        Sleep t2=new Sleep();

        t1.start();
        t2.start();
    }
}
