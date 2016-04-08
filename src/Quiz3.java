
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //new city
        City city = new City();
        //new robot with 20 things in the backpack
        Robot bot = new Robot(city, 1, 1, Direction.EAST, 30);
        
        //get robot to place 5 seeds in a row on street one
        for(int count = 0;count < 4; count = count + 1){
            bot.putThing();
            bot.move();
            bot.putThing();
        }
        
        //get the robot to turn so it is facing downwards, moves one space, and then turns so it faces in the west direction
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        
        //get robot to place 5 seeds in a row on street two
        for(int count = 0;count < 4; count = count + 1){
            bot.putThing();
            bot.move();
            bot.putThing();
        }
        
        //get the robot to face downwards and get onto street three
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        
        //the robot is placing 5 seeds on street three
        for(int count = 0;count < 4; count = count + 1){
            bot.putThing();
            bot.move();
            bot.putThing();
        }
        
        //get the robot to turn until it faces south
        while(bot.getDirection()!=Direction.SOUTH){
            bot.turnLeft();
        }
        
        bot.move();
        
        //get the robot to face the west direction
        while(bot.getDirection()!=Direction.WEST){
            bot.turnLeft();
        }
        
        //the robot will place one seed on this spot
        bot.putThing();
        
        //the robot will place a seed on every square until it reaches avenue 1
        while(bot.getAvenue()!=1){
            bot.move();
            bot.putThing();
        }
        
    }
}
