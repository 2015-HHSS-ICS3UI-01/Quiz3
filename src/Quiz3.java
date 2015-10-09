
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();

        //make robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        //make karel put the things in 4 rows of 5
        karel.move();

        //repeat everything 4 times
        for (int repeat = 4; repeat > 0; repeat--) { 
            //put 5 things in a row
            for (int plantSeed = 5; plantSeed > 0; plantSeed--) {
                karel.putThing();
                karel.move();
            } //if karel is facing EAST turn right, move, then turn right
            if (karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } //if karel is facing WEST turn left, move, then turn left
            else if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
        }



    }
}
