package MyDataStructures;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyStackTests {
    @Test
    public void isInitializedIsEmpty() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty(), "stack initialized is empty");
    }

    @Test
    public void peakReturnsTopObject() {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        assertEquals(7, stack.peak().value, "Peak returns the first top object in stack");
    }

    @Test
    public void peakWillReturnNullIfNoHead() {
        MyStack stack = new MyStack();
        assertEquals(null, stack.peak(), "Peak will return null if has no top");
    }

    @Test
    public void pushWillAddInAdditionalObjects() {
        MyStack stack = new MyStack();
        stack.push(5);
        assertEquals(5, stack.peak().value, "Push one object in stack returns top object");
    }

    @Test
    public void willPopFromTopOfStackAndReturnRemovedObject() {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        assertEquals(7, stack.pop().value, "Remove will pop off top item and return removed object");
    }
}
