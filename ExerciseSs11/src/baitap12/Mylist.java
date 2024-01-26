package baitap12;

public class Mylist<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] element = new Object[0];

    public Mylist() {
    }

    public Mylist(int DEFAULT_CAPACITY) {
    }

    public void add(int index, E element) {
        Object[] newElement = new Object[this.element.length + 1];
        if (index == 0) {
            newElement[0] = element;
            for (int i = index + 1; i < newElement.length; i++) {
                newElement[i] = this.element[i - 1];
            }
        } else if (index == this.element.length - 1) {
            for (int i = 0; i < this.element.length; i++) {
                newElement[i] = this.element[i];
            }
            newElement[newElement.length - 1] = element;
        } else {
            for (int i = 0; i < index; i++) {
                newElement[i] = this.element[i];
            }
            newElement[index] = element;

            for (int i = index + 1; i < newElement.length; i++) {
                newElement[i] = this.element[i - 1];
            }
        }
        size++;
        this.element = newElement;
    }

    public E remove(int index) {
        Object[] newObject = new Object[this.element.length - 1];
        for (int i = 0; i < element.length; i++) {
            if (i < index) {
                newObject[i] = this.element[i];
            } else if (i > index) {
                newObject[i - 1] = this.element[i];
            }
        }
        this.element = newObject;
        size--;
        return (E) this.element;
    }

    public int size() {
        return size;
    }

    public Mylist<E>  clone() {
        Mylist<E> cloneObject = new Mylist<>();
        for (int i = 0; i < element.length; i++) {
            cloneObject.add((E) element[i]);
        } return cloneObject;
    }

    public boolean contains(E o) {
        if(indexOf(o)==-1){
            return false;
        } else {
        return true;}
    }

    public int indexOf(E o) {
        for (int i = 0; i < element.length; i++) {
            if(element[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        add(size,e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
    }

    ;

    public E get(int i) {
        for (int j = 0; j < element.length; j++) {
            if (j == i) {
                return (E) element[j];
            }
        }
        return null;
    }

    public void clear() {
        Object[] clearObject = new Object[0];
        this.element = clearObject;
        size = 0;
    }
}
