
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nelss9013
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City kw = new City();

        //Make Robot 
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        for (int Loop = 4; Loop > 0; Loop--) {

            for (int plantSeed = 5; plantSeed > 0; plantSeed--) {
                karel.putThing();
                karel.move();
            }
            karel.turnLeft();
            karel.turnLeft();
            for (int Return = 5; Return > 0; Return--) {
                karel.move();
                if (karel.getAvenue() == 1) {
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                }
            }
        }
    }
}
