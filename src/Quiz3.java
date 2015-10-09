
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make City
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST,20);
        
      
               
            for (int moveCount = 5; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
            karel.putThing();
            }   
                
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            
            
            
            for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
            karel.putThing();
            }  
            
            karel.turnLeft();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            
            for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
            karel.putThing();
             } 
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            
            for (int moveCount = 4; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
            karel.putThing();
             } 
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            
            }
    
}
