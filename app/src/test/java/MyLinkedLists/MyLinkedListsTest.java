package MyLinkedLists;

import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class MyLinkedListsTest {

    @Test
    public void isInitializedIsEmpty() {
        MyLinkedLists linkedList = new MyLinkedLists();
        assertTrue(linkedList.isEmpty(), "linkedList initialized is empty");
    }

    @Test
    public void canCreateNode(){
        MyNode node = new MyNode(3);
        assertNotNull(node, "can create new Node object");
    }

    @Test
    public void addItemToLinkedList() {
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        assertNotNull(linkedList.head, "Node added to empty linked list becomes head");
    }

    @Test
    public void getFirstItemFromLinkedList(){
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        assertEquals(5, linkedList.getFirst().value, "Node added to linkedlist has correct value");
    }

    @Test
    public void getLastItemFromLinkedList(){
         MyLinkedLists linkedList = new MyLinkedLists();
         linkedList.add(5);
         linkedList.add(3);
         linkedList.add(7);
         assertEquals(7, linkedList.getLast().value, "getLast gets last node in linked list");
    }

    @Test
    public void getLastItemFromLinkedListWithNoHead(){
        MyLinkedLists linkedList = new MyLinkedLists();
        assertEquals(null, linkedList.getLast(), "getLast gets last node in linked list");
    }

    @Test
    public void getNumberByIndexFromLinkedList() {
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        assertEquals(3, linkedList.get(1).value, "get value of first index in linked list");
    }

    @Test
    public void indexOutOfBoundsDuringGet(){
    {
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        Throwable e = null;
        try {
          linkedList.get(3);
        } catch (Throwable ex) {
          e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
      }
    }

    @Test
    public void linkedListContainsObject() {
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        assertEquals(1, linkedList.contains(3), "find index of linkedlist value object");

    }

    @Test
    public void linkedListDoesNotContainObjectIfNoHead() {
        MyLinkedLists linkedList = new MyLinkedLists();
        assertEquals(-1, linkedList.contains(3), "find index of linkedlist value object");
    }

    @Test
    public void linkedListDoesNotContainsObject() {
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        assertEquals(-1, linkedList.contains(9), "find index of linkedlist value object");

    }

    @Test
    public void deleteObjectFromLinkedListIfExists() {
        MyLinkedLists linkedList = new MyLinkedLists();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.delete(3);
        assertEquals(-1, linkedList.contains(3), "delete deletes the object from linkedList if exists");

    }

    @Test
    public void deleteIndexFromLinkedListIfExists(){
      MyLinkedLists linkedList = new MyLinkedLists();
      linkedList.add(5);
      linkedList.add(3);
      linkedList.add(7);
      linkedList.deleteByIndex(1);
      assertEquals(-1, linkedList.contains(3), "deleteByIndex deletes the object from linkedList if exists");
    }

    @Test
    public void cannotDeleteIndexFromLinkedListIfOutOfBounds(){
        {
            MyLinkedLists linkedList = new MyLinkedLists();
            linkedList.add(5);
            linkedList.add(3);
            linkedList.add(7);
            Throwable e = null;
            try {
                linkedList.deleteByIndex(5);
            } catch (Throwable ex) {
                e = ex;
            }
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }
}
