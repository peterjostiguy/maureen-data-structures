package MyDataStructures;

public class MyQueue {

    MyNode head;
    MyNode tail;

    public boolean isEmpty(){
        return head == null;
    }
    
    public MyNode peak() {
        if (head == null) {
            return null;
        } else {
            return head;
        }
    }

    protected void add(Object value) {
        MyNode newNode = new MyNode(value);

        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (head == null) {
            head = newNode;
        }
    }

    protected MyNode remove() {
        MyNode removeNode = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return removeNode;
    }

}
