
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create the city (Called kw) and Robot (Called karel)
        City kw = new City();
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        //Create a loop that allows the robot to place four rows of things
        for (int loop = 4; loop > 0; loop--) {

            //karel puts things five times and turn around to face the start of the row after task is completed 
            for (int thing = 5; thing > 0; thing--) {
                karel.putThing();
                karel.move();
                }
                karel.turnAround();
            
           //karel reutrns to his original position on avenue one, he then continues to place things on the next three rows
            for (int goback = 5; goback > 0; goback--) {
                karel.move();
                if (karel.getAvenue() == 1) {
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                }
            }

        }

    }

}
