
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class Quiz03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Make a City for the Robot to live in
        City NYC = new City();
        //Make a Robot 
        Robot karel = new Robot(NYC, 1, 1, Direction.EAST,20);
        
        
    
        
     while(true) {
          // karel plants first row of seeds
       for (int seed = 0; seed < 5; seed++) {
          karel.putThing(); 
          karel.move(); 
         } 
      if (karel.getDirection() == Direction.EAST && (karel.frontIsClear())) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
        }  karel.move();
        //karel plants the second row of seeds
        for (int seed = 0; seed < 5; seed++) {
          karel.putThing(); 
          karel.move(); 
         } 
         if (karel.getDirection() == Direction.WEST && (karel.frontIsClear())) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
        } karel.move();
        if(karel.countThingsInBackpack() == 0){
            break; 
        }  
     } 
        
        
        
                
            
               
      
            
       
        
        
        
        
        
    }
}
