package MyDataStructures;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyQueueTests {

    @Test
    public void isInitializedIsEmpty() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.isEmpty(), "queue initialized is empty");
    }

    @Test
    public void peakReturnsFirstObject() {
        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.add(3);
        queue.add(7);
        assertEquals(5, queue.peak().value, "Peak returns the first object in queue");
    }

    @Test
    public void peakWillReturnNullIfNoHead() {
        MyQueue queue = new MyQueue();
        assertEquals(null, queue.peak(), "Peak will return null if no head");
    }


    @Test
    public void addWillAddInAdditionalObjects() {
        MyQueue queue = new MyQueue();
        queue.add(5);
        assertEquals(5, queue.peak().value, "Add one object in queue returns first object");
    }

    @Test
    public void willRemoveFromFrontOfQueueAndReturnRemovedObject() {
        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.add(3);
        queue.add(7);
        assertEquals(5, queue.remove().value, "Remove will remove first item and return removed object");
    }

    @Test
    public void willRemoveFromQueueWhenHeadIsNull() {
        MyQueue queue = new MyQueue();
        queue.add(5);
        assertEquals(5, queue.remove().value, "Remove will remove first item but it is null");
    }

}
