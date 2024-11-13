public class SettingDaemonThread extends Thread{
    public void run(){
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        SettingDaemonThread t1 = new SettingDaemonThread();
        SettingDaemonThread t2 = new SettingDaemonThread();

        t1.start();
        t1.setDaemon(true);
        t2.start();
    }
}
