
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make robot
        Robot jimbo = new Robot(eep, 1, 1, Direction.EAST, 20);
        
        //planting seeds cycle
        for (int rows = 0; rows <4; rows = rows +1){
            for (int seeds = 0; seeds<5; seeds = seeds +1){
                jimbo.putThing();
                jimbo.move();
                
                
                
                    //make jimbo trun around (right side)
                    }if (jimbo.getDirection()==Direction.EAST){
                       for (int next = 0; next <2; next = next +1){
                        for (int turns = 0; turns < 3; turns = turns +1){
                            jimbo.turnLeft();
                            }jimbo.move();
                            
                    }
            
                    //make jimbo turn around (left side)
                    }else if (jimbo.getDirection()==Direction.WEST){
                        for (int spin = 0; spin <2; spin = spin +1){
                            jimbo.turnLeft();
                            jimbo.move();
                }           
            }
        }
    }
}
