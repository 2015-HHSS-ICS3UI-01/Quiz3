
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        // creating a new integer
        int count = 0;
        // checks to see if robot has any things
        while (karel.countThingsInBackpack() > 0) {
            // loops 4 times
            if (count < 4) {
                karel.putThing();
                karel.move();
                // add 1 to count
                count = count + 1;
                if (count == 4 && karel.getDirection() == Direction.EAST) {
                    karel.putThing();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    // resets count to 0
                    count = 0;
                }
                if (count == 4 && karel.getDirection() == Direction.WEST) {
                    karel.putThing();
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                    count = 0;
                }
            }
        }
    }
}