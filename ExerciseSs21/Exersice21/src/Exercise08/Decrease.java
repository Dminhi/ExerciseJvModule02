package Exercise08;

public class Decrease extends Thread {
    private Variable variable;

    public Decrease(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        while (true) {
            variable.decrease();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(variable.getNumber());
        }
    }
}
