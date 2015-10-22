
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city and robot (put 20 things in robot backpack)
        City thomas = new City();

        Robot tom = new Robot(thomas, 1, 1, Direction.EAST, 20);
        //loop program until 4 rows are planted
        for (int rowsPlanted = 0; rowsPlanted < 4; rowsPlanted = rowsPlanted + 1) {
            //plant rows of 5 seeds
            for (int seedsPlanted = 0; seedsPlanted < 5; seedsPlanted = seedsPlanted + 1) {
                tom.putThing();
                tom.move();
            }
            //robot turns back to start a new row
            tom.turnLeft();
            tom.turnLeft();
            tom.move();
            tom.move();
            tom.move();
            tom.move();
            tom.move();
            tom.turnLeft();
            tom.move();
            tom.turnLeft();
        }
    }
}
