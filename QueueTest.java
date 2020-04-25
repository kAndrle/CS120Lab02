import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void push() {
        Queue<Integer> q = new Queue<>();
        q.push(3);
        boolean first = (q.top() == 3);
        q.push(5);
        boolean second = (q.top() == 3);
        q.pop();
        boolean third = (q.top() == 5);
        assertTrue(first && second && third);
    }

    @Test
    void pop() {
        Queue<Integer> q = new Queue<>();
        q.push(4);
        q.push(5);
        q.push(6);
        boolean first = q.pop()==4;
        boolean second = q.pop()==5;
        boolean third = q.pop()==6;
        assertTrue(first && second && third);
    }

    @Test
    void top() {
        Queue<Integer> q = new Queue<>();
        q.push(1);
        q.push(2);
        boolean first = q.top()==1;
        q.push(3);
        boolean second = q.top()==1;
        assertTrue(first && second);

    }
}