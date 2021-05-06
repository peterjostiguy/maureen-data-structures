package MyDataStructures;

public class MyLinkedLists {

    MyNode head;

    public MyNode getFirst() {
        return head;
    }

    public boolean isEmpty(){
        return true;
    }

    protected void add(Object value){
        if (head == null){
            head = new MyNode(value);
        } else {
            MyNode current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new MyNode(value);
        }
    }

    public MyNode getLast() {
        if (head == null) {
            return null;
        } else {
            MyNode current = head;
            while (current.next != null){
                current = current.next;
            }
            return current;
        }
    }

    public MyNode get(int index){
        int curIndex = 0;
        MyNode current = head;
        while (curIndex++ != index) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Index " + curIndex + " is out of bounds");
            }
            current = current.next;
        }
        return current;
    }

    public int contains(Object value) {
        int curIndex = 0;
        if (head == null) {
            return -1;
        } else {
            MyNode current = head;
            while (current.next != null) {
                if (current.value == value) {
                    return curIndex;
                } else {
                    curIndex++;
                    current = current.next;
                }
            }
            return -1;
        }
    }

    public void delete(Object value){
        MyNode previous = null;
        MyNode current = head;
        while (current.next != null) {
            if (current.value != value) {
                previous = current;
                current = current.next;
            } else {
                previous.next = current.next;
                current.next = current.next.next;
            }
        }
    }

    public void deleteByIndex(int index){
        int curIndex = 0;
        MyNode previous = null;
        MyNode current = head;

        while (current.next != null) {
            if (curIndex++ != index) {
                previous = current;
                current = current.next;
            } else {
                previous.next = current.next;
                current.next = current.next.next;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }

}
