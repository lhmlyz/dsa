package ds;

public class Stack<T> {
    private T[] elements;
    private int capacity;
    private int top;

    @SuppressWarnings("unchecked type casting")
    public Stack(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.top = -1;
        this.capacity = capacity;

    }

    boolean isStackEmpty() {
        return (top == -1);
    }

    boolean isStackFull() {
        return (top == capacity - 1);
    }

    void push(T entry) throws Exception {
        if (!isStackFull()) {
            this.elements[++top] = entry;
        } else {
            throw new Exception("ds.Stack is full");
        }
    }

    T pop() throws Exception {
        if (!isStackEmpty()) {
            return this.elements[top--];
        } else {
            throw new Exception("ds.Stack is empty");
        }
    }

    void getElements() {
        for (int i = 0; i <= top; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>(5);

        try {
            s.push("ilham");
            s.push("namiq");
            s.push("kamal");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
           var a =  s.pop();
            System.out.println("banana:" + a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        s.getElements();

    }
}
