
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city for robot 
        City kw = new City();

        // make robot 
        Robot lali = new Robot(kw, 1, 1, Direction.EAST, 20);

        //make robot place 4 rows of seeds


        for (int loop = 4; loop > 0; loop--) {
            //make robot put things and move 5 spaces 


            for (int seeds = 5; seeds > 0; seeds--) {
                lali.putThing();
                lali.move();
            }
            //make robot turn around 
            lali.turnLeft();
            lali.turnLeft();

            //robot has turned around ,and is now returning back to avenue 1
            for (int back = 5; back > 0; back--) {
                lali.move();
                if (lali.getAvenue() == 1) {
            //robot places himself ,so that he can start the next row of seeds
                    
                    lali.turnLeft();
                    lali.move();
                    lali.turnLeft();
                }


            }


        }























    }
}
