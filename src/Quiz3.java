
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();
        Robot bot = new Robot(kw, 1, 1, Direction.EAST, 20);

        int count = 0;
        while (count < 4) {
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.turnLeft();
            bot.turnLeft();
            bot.move();
            bot.move();
            bot.move();
            bot.move();
            bot.turnLeft();
            bot.move();
            bot.turnLeft();
            count = count + 1;
        }


    }
}
