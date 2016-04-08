
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        
         for(int timesCircled = 0;timesCircled <4; timesCircled=timesCircled +1){ //loop to count how many times bot goes across
            for (int timesMoved =0;timesMoved <4; timesMoved = timesMoved +1){ //loop to get bot to go across row once
            karel.putThing();
            karel.move();
            if(timesMoved ==3 && karel.getDirection()==Direction.EAST){ //tells robot to turn if it finishes putting things down eastward
            karel.putThing();    
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            }
            else if( timesMoved ==3 && karel.getDirection()==Direction.WEST){//tells robot to turn if it finishes putting things down westward
            karel.putThing();    
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            }
            }
        
    }
}
}
