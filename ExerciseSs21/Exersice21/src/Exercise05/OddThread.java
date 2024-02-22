package Exercise05;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("số chẵn : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
