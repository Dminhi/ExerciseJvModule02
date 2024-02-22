package Exercise06;

public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();

        Thread thread = new Thread(lpf);
        Thread thread2 = new Thread(opf);

        thread.start();
        thread2.start();



    }
}
