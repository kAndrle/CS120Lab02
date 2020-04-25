import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack<Integer> q = new Stack<>();
        q.push(3);
        boolean first = (q.top() == 3);
        q.push(5);
        boolean second = (q.top() == 5);
        q.pop();
        boolean third = (q.top() == 3);
        assertTrue(first && second && third);
    }

    @Test
    void pop() {
        Stack<Integer> q = new Stack<>();
        q.push(4);
        q.push(5);
        q.push(6);
        boolean first = q.pop()==6;
        boolean second = q.pop()==5;
        boolean third = q.pop()==4;
        assertTrue(first && second && third);
    }

    @Test
    void top() {
        Stack<Integer> q = new Stack<>();
        q.push(1);
        boolean first = q.top() == 1;
        q.push(2);
        boolean second = q.top() == 2;
        assertTrue(first && second);
    }
}