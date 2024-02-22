package Exercise06;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i < 1001; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag=false;
                }
            }
            if (flag){
                System.out.println(i + ": lom");
            }
        }
    }
}
