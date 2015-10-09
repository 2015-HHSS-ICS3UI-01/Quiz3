
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        //Make a Robot with 20 seeds in his backpack
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        //Make karel move and put a seed down
        for(int loop=0; loop<4; loop++){
        for(int seed=0; seed<5; seed++){
            for(int move=0; move<5; move++){
                karel.putThing();
            karel.move();
        }
        karel.turnLeft();
        karel.turnLeft();
        for(int move=0; move<5; move++){
            karel.move();
        }
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        break;
        }
        }
    }
}
