package Exercise02;


public class MyThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <=1000 ; i++) {
            sum +=i;
        }
        System.out.println("Tổng các số từ 1 tới 1000 là : "+sum);
    }
}
