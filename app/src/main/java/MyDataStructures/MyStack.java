package MyDataStructures;

public class MyStack {
    MyNode top;

    public boolean isEmpty(){
        return top == null;
    }

    protected MyNode peak() {
        if (top == null) {
            return null;
        } else {
            return top;
        }
    }

    protected void push(Object value) {
        MyNode newNode = new MyNode(value);
        newNode.next = top;
        top = newNode;
    }

    protected MyNode pop() {
        MyNode removeNode = top;
        top = top.next;
        return removeNode;
    }
}
