package test;

import static org.junit.Assert.*;
import org.junit.*;

import island.*;
import island.constants.Color;

/**
 * This is a JUnit test class, used to test code
 * 
 * You should test the SmartCat class by designing Island test cases
 * and filling in the JUnit tests according to the assignment
 * description.
 * 
 * @author Colin Sullivan
 */
public class SmartCatTest {

    public static Island pathIsland = new Island(new String[][] {
            {"L", "L", "W", "W", "W", "L", "L", "L"},
            {"W", "L", "L", "W", "W", "L", "W", "W"},
            {"W", "W", "L", "W", "L", "L", "W", "W"},
            {"L", "L", "L", "W", "L", "W", "W", "W"},
            {"L", "W", "W", "W", "L", "L", "W", "W"},
            {"L", "L", "L", "L", "W", "L", "W", "W"},
            {"W", "W", "W", "L", "W", "L", "W", "W"},
            {"W", "W", "W", "L", "L", "L", "W", "W"}
    });

    public static Island yarnIsland = new Island(new String[][] {
            {"L", "L", "L", "L", "Y", "L", "W", "W", "W"},
            {"W", "W", "Y", "L", "L", "L", "W", "W", "W"},
            {"W", "W", "L", "L", "L", "L", "Y", "W", "W"},
            {"W", "Y", "L", "L", "L", "L", "L", "W", "W"},
            {"W", "W", "L", "L", "L", "L", "L", "Y", "L"},
            {"W", "W", "L", "Y", "L", "L", "L", "L", "L"},
            {"W", "Y", "L", "L", "L", "Y", "L", "L", "W"},
            {"W", "W", "W", "W", "W", "L", "L", "Y", "W"},
            {"W", "W", "W", "W", "W", "W", "L", "L", "W"}
    });

    public static Island mazeIsland = new Island(new String[][] {
            {"L", "L", "W", "L", "L", "L", "W", "W", "L", "L"},
            {"W", "L", "W", "L", "L", "L", "W", "W", "L", "W"},
            {"W", "L", "L", "W", "L", "L", "W", "L", "L", "W"},
            {"L", "W", "L", "W", "L", "L", "W", "L", "W", "W"},
            {"L", "W", "L", "L", "W", "L", "W", "L", "W", "W"},
            {"L", "W", "W", "L", "W", "L", "W", "L", "W", "W"},
            {"W", "L", "L", "L", "W", "L", "W", "L", "W", "W"},
            {"W", "L", "W", "W", "W", "W", "L", "L", "W", "W"},
            {"W", "L", "L", "L", "L", "L", "L", "W", "L", "L"},
            {"W", "W", "W", "W", "W", "W", "W", "W", "L", "L"}
    });

    @Test
    public void testWalkPath() {
        // WRITE YOUR CODE HERE

    }

    @Test
    public void testCollectAllYarn() {
        // WRITE YOUR CODE HERE

    }

    @Test
    public void testSolveMaze() {
        // WRITE YOUR CODE HERE

    }

}
