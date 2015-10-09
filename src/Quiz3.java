
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //City for Robot to live in
        City kw = new City();

        //Robot to live in City
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        //karel plants 4 rows
        for (int plantCrops = 4; plantCrops > 0; plantCrops = plantCrops - 1) {

            //karel places and then moves
            for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
                karel.putThing();
                karel.move();
            }
            //karel turns around
            for (int turnAround = 1; turnAround > 0; turnAround = turnAround - 1) {
                karel.turnLeft();
                karel.turnLeft();
            }
            //karel moves back
            for (int moveBack = 5; moveBack > 0; moveBack = moveBack - 1) {
                karel.move();
            }
            //karel goes to make next row
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
        }
    }
}
