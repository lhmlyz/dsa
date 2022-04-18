package ds;

public class StackP {
    private int[] elements;
    private int top;
    private int capacity;


    StackP(int capacity) {
        this.elements = new int[capacity];
        this.capacity = capacity;
        this.top = -1;

    }

    void push(int elem) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            System.out.println("Elem yazilir: " + elem);
            this.elements[++top] = elem;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return elements[top--];
    }


    boolean isFull() {
        return top == capacity - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void getElements() {
        for (int i = 0; i <= top; i++) {
            System.out.println("elem:" + elements[i]);
        }
    }

    public static void main(String[] args) {

        StackP a = new StackP(3);
        a.push(1);
        a.push(2);
        a.push(3);
        a.getElements();

        a.pop();

        System.out.println("popdan sonra");

        a.getElements();

    }
}
