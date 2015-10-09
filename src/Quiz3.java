
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        int totalThings = 20;
        //Total things in hand
        while (totalThings <= 20)
            //When Karel has less than or has 20 things in hand 
        {
            karel.putThing();
            karel.move();
            totalThings = totalThings - 1;
            if (totalThings == 15 || totalThings == 5)
                //When Karel has 15 or 5 things in hand
            {
                //Turn Right and move down, repeat twice
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            }
            if (totalThings == 10 || totalThings == 0)
                //When Karel has 10 or 0 things in hand
            {
                //Turn Left and move down, repeat twice
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
            // Stop at (5, 1)
            if( karel.getStreet() == 5 ){
                    if( karel.getAvenue() == 1 ){
                            break;
                    }
            }
   
        }
    }
}
