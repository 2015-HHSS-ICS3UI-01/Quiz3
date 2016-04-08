
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
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        int count = 0;
        int row = 0;
        //Karel completes the plantation of each row.
        while (count < 4) {
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            //Karel moves to the next row downwards(on right side of the crop)
            if (count == 0 || count == 2) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            } //Karel moves to the next row downwards(on left side of the crop)
            else {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }
            count = count + 1;
        }
        row = row + 1;
    }
}
