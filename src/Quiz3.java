
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City
        City Q3 = new City();

        //Make Robot
        Robot karel = new Robot(Q3, 1, 1, Direction.EAST, 20);

        //Code Solution

        //Make karel plant seeds
//Sets it so that each for loop loops 4 times (for 4 rows of seeds)
        for (int loops = 4; loops > 0; loops--) {
//Sets it so that karel plants a seed and moves 5 times
            for (int plantSeeds = 5; plantSeeds > 0; plantSeeds--) { 
                karel.putThing();
                karel.move();
            }
            karel.turnLeft(); //Karel turns around
            karel.turnLeft();
//Sets it so that karel will move five times to return to the starting avenue
            for (int Return = 5; Return > 0; Return--) { 
                karel.move();
//Checks if karel is at avenue 1 (which will always be true after the return for loop) And makes karel face the next row to plant seeds again
                if (karel.getAvenue() == 1) { 
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                }
            }
        }
    }
}
