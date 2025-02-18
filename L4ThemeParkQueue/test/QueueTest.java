import static org.junit.Assert.*;
import org.junit.*;

import queue.*;

/*
* This is a JUnit Test Class, which uses the JUnit package to create
* and run tests (just like in Lab 2)
* 
* You can use this to evaluate your code. Examine these tests, as writing
* similar test cases will help you immensly on other Assignments/Labs, as
* well as moving forward in your CS career.
*
* You WILL NOT SUBMIT THIS CLASS. This is for your own testing purposes only.
*/
public class QueueTest {

    @Test
    public void testEnqueue() {
        ThemeParkQueue test = new ThemeParkQueue();
        for (int i = 0; i < 20; i++){
            test.enqueue("rider" + i);
        }
        assertEquals("rider0", test.getFront().name);
        assertEquals(20, test.getLineLength());
        test.enqueue("rider21");
        assertEquals(21, test.getLineLength());
    }

    @Test
    public void testDequeue() {
        ThemeParkQueue test = new ThemeParkQueue();
        test.enqueue("rider1");
        test.enqueue("rider2");
        assertEquals("rider1", test.dequeue());
        assertEquals("rider2", test.getFront().name);
        assertTrue(test.getLineLength() == 1);
    }
}