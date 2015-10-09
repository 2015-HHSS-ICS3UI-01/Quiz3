
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make new city farm
        City farm = new City();

        //make new robotSE karl
        RobotSE karl = new RobotSE(farm, 1, 1, Direction.EAST, 20);

        for (int seeds = 0; seeds < 4; seeds++) {  //make for loop to make 4 rows
            for (int plant = 0; plant < 4; plant++) {  //make for loop to plant 4 seeds
                karl.putThing();
                karl.move();
            }
            karl.putThing();  //put thing on the last space before turning around
            karl.turnAround();
            for (int back = 0; back < 4; back++) {  //make loop for karl to go backwards
                karl.move();
            }
            if (karl.countThingsInBackpack() == 0) {  //if karl has no seeds left stop the program
                break;
            }
            karl.turnLeft();  //move over to the next row of seeds
            karl.move();
            karl.turnLeft();
        }
        karl.turnAround();















    }
}
