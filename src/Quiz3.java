
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        //karel starts with 20 items in his bag
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        //creating a new integer
        int num = 0;

        //loop 4 times
        while (num < 4) {

            //create a new integer
            int count = 0;

            //loop 5 times
            while (count < 5) {
                karel.putThing();
                karel.move();

                //add one to count
                count = count + 1;
            }
            karel.turnLeft();
            karel.turnLeft();
            karel.move();

            //create new integer
            int spot = 0;

            //loop 5 times
            while (spot < 5) {
                karel.move();

                //add one to spot
                spot = spot + 1;
            }
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();

            //add one to num
            num = num + 1;
        }
    }
}
