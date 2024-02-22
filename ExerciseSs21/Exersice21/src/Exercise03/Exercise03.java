package Exercise03;

import javax.swing.plaf.TableHeaderUI;

public class Exercise03 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 thread1 = new MyThread1();
        Thread thread = new Thread(thread1);

        MyThread2 thread2 = new MyThread2();


        thread.start();
        thread2.start();

    }
}
