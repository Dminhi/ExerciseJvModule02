package Exercise04;

public class Test {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator1);
        thread.setPriority(thread.MAX_PRIORITY);
        thread1.setPriority(thread1.MIN_PRIORITY);
        thread.start();
        thread1.start();
    }
}
