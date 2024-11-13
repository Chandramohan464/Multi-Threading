package CallingRunMethod;

public class RunningThreads extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunningThreads t1=new RunningThreads();
        RunningThreads t2=new RunningThreads();

        t1.run();
        t2.run();
    }
}
