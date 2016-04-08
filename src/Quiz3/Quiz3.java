/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author fostp4040
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 1,1, Direction.EAST,20);
        int count = 0;
        while(count<2){
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            count = count + 1;
            
        }
    }
}
