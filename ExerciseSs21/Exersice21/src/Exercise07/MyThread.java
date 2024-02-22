package Exercise07;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
