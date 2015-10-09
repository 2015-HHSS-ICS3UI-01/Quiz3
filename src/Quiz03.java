
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Quiz03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City kw = new City ();
        
        //Make robot
        Robot jonny = new Robot(kw, 0,0, Direction.EAST,20);
        
        //Program robot to plant seeds
        int timesturned = 0;
        while(timesturned < 2){
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.move();
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.move();
            jonny.putThing();
            jonny.turnLeft();
            jonny.move();
            jonny.turnLeft();
            timesturned = timesturned + 1;
        }
    }
}
