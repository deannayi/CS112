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
            {"L", "W", "L", "L", "W", "W", "L", "L", "W", "L"},
            {"L", "W", "W", "L", "W", "W", "L", "W", "W", "L"},
            {"W", "L", "L", "L", "W", "W", "L", "W", "L", "L"},
            {"W", "L", "W", "W", "W", "W", "L", "W", "L", "L"},
            {"W", "L", "W", "L", "L", "L", "L", "W", "L", "L"},
            {"W", "L", "L", "L", "W", "W", "W", "W", "L", "L"}
    });

    @Test
    public void testWalkPath() {
        SmartCat yilin = new SmartCat("yilin", SmartCatTest.pathIsland, 0, 0, Color.WHITE);
        yilin.walkPath();
        assertEquals(7, yilin.getCol());
        assertEquals(0, yilin.getRow());
    }

    @Test
    public void testCollectAllYarn() {
        SmartCat yilin = new SmartCat("yilin", SmartCatTest.yarnIsland, 0, 0, Color.ORANGE);
        yilin.collectAllYarn();
        Tile[][] island = yarnIsland.getTiles();
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                assertFalse(island[i][j].hasYarn);
            }
        }
    }

    @Test
    public void testSolveMaze() {
        SmartCat yilin = new SmartCat("yilin", SmartCatTest.mazeIsland, 0, 0, Color.ORANGE);
        yilin.solveMaze();
        assertEquals(9, yilin.getCol());
        assertEquals(0, yilin.getRow());
        assertTrue(yilin.numStepsTaken() >= 30);
    }
}
