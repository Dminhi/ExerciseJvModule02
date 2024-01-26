public class MyQueue extends Node implements Solution {
    @Override
    public void enQueue() {
        Node node = new Node();
        if(front==null){
            front = rear = node;
        } else {
            rear = node;
        }
    }

    @Override
    public void deQueue() {

    }

    @Override
    public void displayQueue() {
    }

    Node front;
    Node rear;

    public MyQueue() {
    }

    public MyQueue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public MyQueue(int data, Node link, Node front, Node rear) {
        super(data, link);
        this.front = front;
        this.rear = rear;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
