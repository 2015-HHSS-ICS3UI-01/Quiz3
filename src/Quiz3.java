
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City farm = new City();
        Robot matt = new Robot(farm, 1, 1, Direction.EAST, 20);

        //while loop around whole code
        while (true) {
            //for statement for 5 seeds each line
            for (int row = 5; row > 0; row = row - 1) {
                matt.putThing();
                matt.move();
            }
            //when matt gets to end of crop rows, turn & return to start of row
            matt.turnLeft();
            matt.turnLeft();
            while (matt.frontIsClear()) {
                matt.move();
                if (matt.getAvenue() == 1) {
                    break;
                }
            }
            //movements to get to following row (below)
            matt.turnLeft();
            matt.move();
            matt.turnLeft();
            //tells matt to stop when he arrives at the bottom of the last row
            if (matt.getStreet() == 5) {
                break;
            }

        }
    }
}
