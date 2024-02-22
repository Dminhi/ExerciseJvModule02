package Exercise08;

public class Increase extends Thread {


    private Variable variable;

    public Increase(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void run() {

        while (true) {
            variable.increase();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(variable.getNumber());
        }
    }
}