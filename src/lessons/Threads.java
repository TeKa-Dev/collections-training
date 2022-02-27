package lessons;

public class Threads {
    public static void main(String[] args) {
        MyThread mt = new MyThread(" First - ");
        mt.start();

        MyThread mth = new MyThread(" Second - ");
        mth.start();
    }

}
class MyThread extends Thread {
    String threadName;
    MyThread(String threadName) {
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + i);
        }
    }
}
