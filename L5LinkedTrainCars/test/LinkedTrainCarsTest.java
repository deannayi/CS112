import static org.junit.Assert.*;
import org.junit.*;

import singly.*;

/*
* This is a Java Test Class, which uses the JUnit package to create
* and run tests
* 
* You can use this to evaluate your code. Examine these tests, as writing
* similar test cases will help you immensly on other Assignments/Labs, as
* well as moving forward in your CS career.
*/
public class LinkedTrainCarsTest {

    @Test
    public void testNumCars() {
        LinkedTrainCars test = new LinkedTrainCars();
        test.insertAt("car1", 0);
        test.insertAt("car2", 1);
        assertTrue(test.numCars() == 2);
        test.insertAt("car3", 1);
        assertTrue(test.numCars() == 3);
    }

    @Test
    public void testInsertAt() {
        // WRITE YOUR CODE HERE
        LinkedTrainCars test = new LinkedTrainCars();

    }

}