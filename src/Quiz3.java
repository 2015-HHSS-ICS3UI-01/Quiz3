
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();           //making city

        Robot bot = new Robot(kw, 1, 1, Direction.EAST, 20);    //putting bot into the city 

        for (int a = 0; a < 4; a = a + 1) {   //the counted loop that will set how many times the bot will do this
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.move();
            bot.putThing();
            bot.move();                     //the moves the bot will do to complete the task
            bot.turnLeft();
            bot.turnLeft();
            bot.putThing();
            bot.move();
            bot.move();
            bot.move();
            bot.move();
            bot.turnLeft();
            bot.move();
            bot.turnLeft();

        }
    }
}
