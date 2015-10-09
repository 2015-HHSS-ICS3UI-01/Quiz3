
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a city for the robot to live in
        City kw = new City();
        Robot kar = new Robot(kw, 1, 1, Direction.EAST, 20);
        while (true) {
             //robot will move and plant 5 seeds in a row
            int moveAmount = 0;
            while (moveAmount < 5) {
                kar.putThing();
                kar.move();
                moveAmount = moveAmount + 1;

            } //robot will turn to face the adjacent row
            if (kar.frontIsClear()) {
                kar.turnLeft();
                kar.turnLeft();
                kar.turnLeft();
                kar.move();
                kar.turnLeft();
                kar.turnLeft();
                kar.turnLeft();
                kar.move();
            }   //robot will perform the action above twice
          while (true){
          //robot will place another 5 seeds
            int move = 0;
            while (move < 5) {
                kar.putThing();
                kar.move();
                move = move += 1;

        }   //robot will turn again
            if(kar.frontIsClear()){
                kar.turnLeft();
                
                kar.move();
                kar.turnLeft();
                
                kar.move();
            break;   }
           
    }
}
    }
}
