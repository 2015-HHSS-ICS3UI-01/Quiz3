
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city for karel to place seeds
        City kw = new City();

        // Create robot karel with seeds
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        //Make variables
        int seed = 20;
        int turnKarel = 5;
        int moveKarel = 5;

        //make karel place seeds
        while (moveKarel > 0) {
            if (seed > 0) {
                for (int plant = 5; plant > 0; plant = plant - 1) {                  
                    karel.putThing();
                    karel.move();
                    seed--;
                }
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.move();
                karel.move();
                karel.move();
                karel.move();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                moveKarel--;
            }


        }

    }
}
