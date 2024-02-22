package Exercise11;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 2; i < 10000; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i + ": số nguyên tố");
            }
        }
    }
}
