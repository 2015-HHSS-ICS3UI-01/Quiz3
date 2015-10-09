
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
        while(true){
         
        for(int loops = 0; loops <5; loops++){ 
            if(karel.countThingsInBackpack() == 0){
            break;}
        for (int seeds = 0; seeds < 5; seeds++){
            karel.putThing();
            karel.move();
      
             
         
            } if(karel.getDirection() == Direction.EAST){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            
        }if(loops == 1){
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
             
            
        } 
       
        }
            
        
         }
             
         }
             
                 
             }



             
         
    
    
    


