
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maxia2242
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Andrew = new City();
        Robot AM = new Robot(Andrew, 1, 1, Direction.EAST, 20);

        while (true) {
            if (AM.countThingsInBackpack() <= 20 && AM.countThingsInBackpack() > 15 || AM.countThingsInBackpack() <= 15 && AM.countThingsInBackpack() > 10 || AM.countThingsInBackpack() <= 10 && AM.countThingsInBackpack() > 5 || AM.countThingsInBackpack() <= 5 && AM.countThingsInBackpack() > 0) {
                AM.putThing();
                AM.move();
                //if statment for the robot to place things in the city

            }
            if (AM.getAvenue() == 5) {
                AM.turnLeft();
                AM.turnLeft();
                AM.turnLeft();
                //turns the robot at Avenue 5
            }
            if (AM.getAvenue() == 1) {
                AM.turnLeft();
                //turns the robot at Avenue 1
            }
            if (AM.countThingsInBackpack() == 0) {
                break;
                //stops the Robot when there is nothing in the backpack
            }
        }
    }
}
