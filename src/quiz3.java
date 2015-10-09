
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vickj2854
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a city called kw
        City kw = new City();
        // make karel
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        // make karel plant the seeds
int moveAmount = 4;
        while (  moveAmount > 0){

            for (int moveCount = 0; moveCount < 5; moveCount = moveCount + 1) {
                karel.move();
                karel.putThing();
            }
            if(karel.getDirection() == Direction. WEST){
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            } else{
                {
            }
            karel.turnLeft();
            



moveAmount = moveAmount - 1;
        }
    }
    }
}
