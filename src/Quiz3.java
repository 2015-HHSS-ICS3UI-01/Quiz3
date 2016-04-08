
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE dag = new RobotSE(kw, 1, 1, Direction.EAST, 20);
        int row = 0;
        int count = 0;
        // set row and count to 0
        while (row < 4) {
            //complete the set of actions within the row loop 4 times
            while (count < 5) {
                dag.putThing();
                dag.move();
                count = count + 1;
            }
            count = 0;
            // place five items in a row and set count back to 0
            dag.turnAround();
            while (count < 5) {
                dag.move();
                count = count + 1;
            }
            count = 0;
            
            dag.turnLeft();
            dag.move();
            dag.turnLeft();
            // turn around go back to start
            row = row + 1;
        }
    }
}
