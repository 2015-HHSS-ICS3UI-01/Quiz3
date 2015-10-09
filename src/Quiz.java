
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make the City
        City cap = new City();

        //Make jonpey
        Robot jonpey = new Robot(cap, 0, 1, Direction.EAST, 20);

        //Make jonpey plant the seeds
 
            
            for (int loops3 = 4; loops3 > 0; loops3--) {
                for (int loops = 5; loops > 0; loops--) {


                    jonpey.move();
                    jonpey.putThing();

                }

                jonpey.turnLeft();
                jonpey.turnLeft();

                for (int loops2 = 5; loops2 > 0; loops2--) {
                    jonpey.move();



                }

                jonpey.turnLeft();
                jonpey.move();
                jonpey.turnLeft();







            }
        }

    
}
