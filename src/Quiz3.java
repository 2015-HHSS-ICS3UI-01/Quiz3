
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PINTM1551
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        becker.robots.City kw = new becker.robots.City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        int x = 4;                                                  //Counts vertical rows
        int y = 5;                                                  //Counts horizontal rows
        while (x > 0 && karel.countThingsInBackpack() > 0) {        //Stops without items
            while (y > 0) {                                         //Repeats for horizontal rows
                karel.putThing();
                karel.move();
                y = y - 1;
            }
            if (karel.getDirection() == Direction.EAST) {           //Turns back while on the east side
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else {                                                //Turns back while on the west side
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
            y = 5;                                                  //Resets the horizontal counter every vertical line
        }
    }
}
