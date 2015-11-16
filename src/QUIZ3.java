
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class QUIZ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot commando = new Robot(kw, 1, 1, Direction.EAST,20);
   
            
        {
            int timesTurned = 0;
while(timesTurned < 3) {
    commando.putThing();
    commando.move();
    commando.putThing();
    commando.move();
    commando.putThing();
    commando.move();
    commando.putThing();
    commando.move();
    commando.putThing();
    commando.turnLeft();
    commando.turnLeft();
    commando.turnLeft();
    commando.move();
    commando.turnLeft();
    commando.turnLeft();
    commando.turnLeft();
   timesTurned = timesTurned + 1;
   //This will loop commando down one row, while laying down the seeds
   {
       
   }
  

}
        }
    }
}
