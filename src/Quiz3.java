
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eadil1765
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city call it L cause u a low class man
        City L = new City();
        // Make a robot and name his dumb a** Liam
        Robot Liam = new Robot(L, 1, 1, Direction.EAST, 20);
        //make Liams butt get planted the seeds
        for (int moveCount1 = 4; moveCount1 > 0; moveCount1 = moveCount1 - 1) {

            for (int moveCount = 5; moveCount > 0; moveCount = moveCount - 1) {
                Liam.move();
                Liam.putThing();
            }
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.move();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.putThing();
        break;
        }
   for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
                Liam.move();
                Liam.putThing();
    }
   
            Liam.turnLeft();
            Liam.move();
            Liam.turnLeft();
            Liam.putThing();
       
            for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
                Liam.move();
                Liam.putThing();
    }
   
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.move();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.putThing();
            
            for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
                Liam.move();
                Liam.putThing();
    
}
            Liam.turnLeft();
            Liam.move();
            Liam.turnLeft();    } 
}
