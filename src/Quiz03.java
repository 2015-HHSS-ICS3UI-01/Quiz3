
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class Quiz03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        Robot Tom = new Robot(Ajay, 1, 1, Direction.EAST, 20);
        int timesTurned = 0;
        Tom.putThing();
       //handles the first row
        while (Tom.countThingsInBackpack() >= 16){
            Tom.move();
            Tom.putThing();
        }
        //handles the first row down 
        timesTurned = timesTurned + 1;
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.turnLeft();
            while (Tom.countThingsInBackpack() >=13){
            Tom.move();
            Tom.putThing();
         } 
        //moves to the next row
        timesTurned = timesTurned + 1;   
        while (timesTurned == 2){
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.move();
            Tom.putThing();
            timesTurned = timesTurned + 1;
        }
        while (timesTurned == 3){
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.move();
            Tom.putThing();
            timesTurned = timesTurned + 1;
        }
       //finishing what's left of the field 
        while (timesTurned == 4){
            Tom.move();
            Tom.putThing();
            Tom.turnLeft();
            Tom.move();
            Tom.putThing();
            Tom.turnLeft();
            Tom.move();
            Tom.putThing();
            Tom.move();
            Tom.putThing();
            if(Tom.countThingsInBackpack()==0){
                break;
            }
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.move();
            Tom.putThing();
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.turnLeft();
            Tom.move();
            Tom.putThing();
            if(Tom.countThingsInBackpack()==0){
                break;
            }  
        }
        Tom.move();
        Tom.turnLeft();
}
}
