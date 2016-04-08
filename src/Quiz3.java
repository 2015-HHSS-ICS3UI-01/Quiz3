
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City town = new City();
        Robot sam = new Robot(town, 1, 1, Direction.EAST, 20);

        for (int num = 0; num < 20; num = num + 1) {

            sam.putThing();
            sam.move();

            if (sam.getAvenue() == 6) {
                sam.turnLeft();
                sam.turnLeft();
                sam.turnLeft();
                sam.move();
                sam.turnLeft();
                sam.turnLeft();
                sam.turnLeft();
                sam.move();
            } else if (sam.getAvenue() == 0) {
                sam.turnLeft();
                sam.move();
                sam.turnLeft();
                sam.move();
            }
        }
    }
}
