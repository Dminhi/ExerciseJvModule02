package Exercise03;

public class MyThread1 extends Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println("số chẵn từ 1 tới 100 là : "+ i);
            }
        }
    }
}
