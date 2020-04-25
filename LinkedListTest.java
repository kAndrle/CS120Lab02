import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void size() {
        LinkedList<Integer> ll = new LinkedList<>();
        boolean first = ll.size()==0;
        ll.add(1);
        ll.add(2);
        ll.add(3);
        boolean second = ll.size()==3;
        assertTrue(first && second);
    }

    @org.junit.jupiter.api.Test
    void add() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(5);
        System.out.println(ll.printAllValues());
    }

    @org.junit.jupiter.api.Test
    void insert() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(6);
        ll.add(8);
        ll.insert(4,1);
        System.out.println(ll.printAllValues());
        assertTrue(ll.get(1)==4);
    }

    @org.junit.jupiter.api.Test
    void get() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(5);
        ll.add(7);
        boolean first = ll.get(1)==5;
        boolean second = ll.get(2)==7;
        assertTrue(first && second);
    }

    @org.junit.jupiter.api.Test
    void printAllValues() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(4);
        assertTrue(ll.printAllValues().equalsIgnoreCase("2, 4"));

    }

    @org.junit.jupiter.api.Test
    void sort() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(2);
        ll.add(8);
        ll.add(0);
        System.out.println(ll.printAllValues());
        ll.sort();
        System.out.println(ll.printAllValues());
    }

    @org.junit.jupiter.api.Test
    void sortedAdd() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(2);
        ll.add(8);
        ll.add(0);
        ll.sortedAdd(6);
        System.out.println(ll.printAllValues());
    }

    @org.junit.jupiter.api.Test
    void sortedSearch() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(2);
        ll.add(8);
        ll.add(0);
        assertTrue(ll.sortedSearch(4));
    }
}