package Exercise10;

import java.util.Scanner;

public class Threadabc extends Thread{
    @Override
    public void run() {
        System.out.println("Nhập thời gian ngủ theo s");
        Scanner scanner = new Scanner(System.in);
        int timeline = scanner.nextInt();
        try {
            Thread.sleep(timeline*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
