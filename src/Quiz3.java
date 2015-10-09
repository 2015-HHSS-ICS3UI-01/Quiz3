
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,1,1, Direction.EAST,20);
        
         // This loops means every coloumn he does it adds 1
        for(int loops = 0; loops <4; loops++){
        for (int seeds = 0; seeds < 5; seeds++){
            karel.putThing();
            karel.move();
      
             
         // Every time he's facing EAST, and is done a column he moves to 2nd one
            } if(karel.getDirection() == Direction.EAST){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            // Mr. Lamont didn't mention that it was an algorithm :) thus when he planted first 2 rows he turns left 
        }if(loops == 1){
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
             
            
        } 
       
        }
            
        
         }
             
         }
             
                 
             



             
         
    
    
    


