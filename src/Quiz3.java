
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 1, 1, Direction.EAST, 20);
        int count = 1;
        int loop = 0;

        while (a.frontIsClear()) {
            a.putThing();
            a.move();
            count = count + 1;
            if (count == 5) {
                if (loop == 0) {
                    count = count - 4;
                    loop = loop + 1;
                    a.putThing();
                    a.turnLeft();
                    a.turnLeft();
                    a.turnLeft();
                    a.move();
                    a.turnLeft();
                    a.turnLeft();
                    a.turnLeft();

                } else if (loop == 1) {
                    loop = loop - 1;
                    count = count - 4;
                    a.putThing();
                    a.turnLeft();
                    a.move();
                    a.turnLeft();
                    if (a.countThingsInBackpack()==0){
                        break;
                    }

                }
            }

        }
    }
}
