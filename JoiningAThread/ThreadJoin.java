package JoiningAThread;

public class ThreadJoin extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadJoin obj = new ThreadJoin();
        ThreadJoin obj1 = new ThreadJoin();
        ThreadJoin obj2 = new ThreadJoin();

        obj.start();
        try {
            obj.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        obj1.start();
        obj2.start();
    }
}
