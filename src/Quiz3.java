/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author singk4158
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       City kw = new City();

        // make robot 
        Robot kharak = new Robot(kw, 1, 1, Direction.EAST, 20);

        //make robot place 4 rows of seeds


        for (int loop = 4; loop > 0; loop--) {
            //make robot put things and move 5 spaces 


        for (int seeds = 5; seeds > 0; seeds--) {
            kharak.putThing();
            kharak.move();
            }
            //make robot turn around 
            kharak.turnLeft();
            kharak.turnLeft();

            //robot has turned around ,and is now returning back to avenue 1
       for (int back = 5; back > 0; back--) {
            kharak.move();
        if (kharak.getAvenue() == 1) {
            //robot places himself ,so that he can start the next row of seeds
                    
            kharak.turnLeft();
            kharak.move();
            kharak.turnLeft();
          }


            }
        }
    }
 }