
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live in
        City kw = new City();
        
        // make robot to live within city that has 20 seeds in has backpack
        Robot karel = new Robot(kw, 1, 1, Direction.EAST,20);
        
        // karel is a farmer and will plant a field of things 
        // and then stop when he is finsished 
        
        // make karel plant 5 seeds on 4 rows and then stop once he has ran out of seeds
        // make a variable to make karel repeat this loop for 4 streets / rows
        // the variable starts at 0 and for every row he has finsihed the variable will increase by one
        // until he has done this 4 times
        for(int rowCleared = 0; rowCleared < 4; rowCleared = rowCleared + 1){
            // make a variable to make karel put five things down per street
            for(int hasPutThings = 0; hasPutThings < 5; hasPutThings = hasPutThings + 1){
                // make karel put a thing down and move if there is not a thing already there
                if(!karel.canPickThing()){
                    karel.putThing();
                    karel.move();
                }
            }
            // if karel has finsihed planting 5 seeds on a row
            // make karel turn right move turn right and move again to get him one street down
            // do this if he is facing east
            if(karel.getDirection() == Direction.EAST){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                // if karel is facing west and has finished planting 5 seeds on a row\
                // make karel turn left move turn left and move again to get him one street down
            }else if(karel.getDirection() == Direction.WEST){
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
        }
    }
}
