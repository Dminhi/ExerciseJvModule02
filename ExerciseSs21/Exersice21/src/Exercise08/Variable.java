package Exercise08;

public class Variable {
    int number = 0;

    public Variable() {
    }

    public Variable(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void increase() {
        number++;
    }
    public void decrease() {
        number--;
    }
}
