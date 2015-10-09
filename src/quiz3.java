
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
 * @author snowc4636
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        //Make a robot to live in the city
        Robot zac = new Robot(kw,1, 1, Direction.EAST,20);
        
        //Make zach put down the seeds
        
        for (int loops7 = 4; loops7 >0; loops7--){
            for (int loops2 = 5; loops2 >0; loops2--){
                
                zac.move();
                zac.putThing();
                
        }

        zac.turnLeft();
        zac.turnLeft();

        for (int loops = 5; loops >0; loops--){
            zac.move();
            
            
        }
        zac.turnLeft();
        zac.move();
        zac.turnLeft();
        
       
    }    
    } 
        }
    

