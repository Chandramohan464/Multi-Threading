package JoiningAThread;

public class SimpleThreadJoin extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SimpleThreadJoin t1 = new SimpleThreadJoin();
        SimpleThreadJoin t2 = new SimpleThreadJoin();
        SimpleThreadJoin t3 = new SimpleThreadJoin();

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
