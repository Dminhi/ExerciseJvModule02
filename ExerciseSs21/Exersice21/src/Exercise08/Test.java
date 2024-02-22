package Exercise08;

public class Test {
    public static void main(String[] args) {
        Variable variable = new Variable();
        Decrease decrease = new Decrease(variable);
        Increase increase = new Increase(variable);
        decrease.start();
        increase.start();
    }
}
