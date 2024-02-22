package Exercise03;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println("số lẻ từ 1 tới 100 là : "+ i);
            }
        }
    }
}
