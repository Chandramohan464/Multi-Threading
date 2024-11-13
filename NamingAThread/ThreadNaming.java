package NamingAThread;

public class ThreadNaming extends Thread{
    public void run(){
        System.out.println("Running..");
    }    

    public static void main(String[] args) {
        ThreadNaming t1=new ThreadNaming();
        ThreadNaming t2=new ThreadNaming();
        System.out.println("Current name of t1: "+t1.getName());
        System.out.println("Current name of t2: "+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Virat Kohli");
        System.out.println("After changing the name of t1: "+t1.getName());
    }
}
