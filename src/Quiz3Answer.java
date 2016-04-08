
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Quiz3Answer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot denis = new Robot(kw, 1, 1, Direction.EAST, 20);

        int count = 0;
        int row = 0;
        //Denis completes the plantation of the first row.
        while (count < 4) {
            denis.putThing();
            denis.move();
            denis.putThing();
            denis.move();
            denis.putThing();
            denis.move();
            denis.putThing();
            denis.move();
            denis.putThing();
            //Denis moves to the next row
            if (count == 0 || count == 2) {
                denis.turnLeft();
                denis.turnLeft();
                denis.turnLeft();
                denis.move();
                denis.turnLeft();
                denis.turnLeft();
                denis.turnLeft();
            } 
            //Denis moves to the next row
            else {
                denis.turnLeft();
                denis.move();
                denis.turnLeft();
            }
            count = count + 1;
        }
        row = row + 1;
    }
}
