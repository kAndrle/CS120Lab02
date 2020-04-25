import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void size() {
        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();
        assertTrue(ll.size()==0);
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(4);
        assertTrue(ll.size()==4);
    }

    @Test
    void get() {
        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(4);
        assertTrue(ll.get(2)==7);
    }

    @Test
    void add() {
        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(4);
        System.out.println(ll.printAllValues());
    }

    @Test
    void insert() {
        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(4);
        ll.insert(3,1);
        ll.insert(10,0);
        assertTrue(ll.get(0)==10);
        assertTrue(ll.get(2)==3);
    }

    @Test
    void printAllValues() {
        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(4);
        ll.insert(3,1);
        System.out.println(ll.printAllValues());
    }
}