
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
        
        City city = new City();
        Robot bot = new Robot(city, 1, 1, Direction.EAST, 30);
        
        for(int count = 0;count < 4; count = count + 1){
            bot.putThing();
            bot.move();
            bot.putThing();
        }
        
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        
        for(int count = 0;count < 4; count = count + 1){
            bot.putThing();
            bot.move();
            bot.putThing();
        }
        
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        
        for(int count = 0;count < 4; count = count + 1){
            bot.putThing();
            bot.move();
            bot.putThing();
        }
        
        while(bot.getDirection()!=Direction.SOUTH){
            bot.turnLeft();
        }
        
        bot.move();
        
        while(bot.getDirection()!=Direction.WEST){
            bot.turnLeft();
        }
        bot.putThing();
        
        while(bot.getAvenue()!=1){
            bot.move();
            bot.putThing();
        }
        
    }
}
