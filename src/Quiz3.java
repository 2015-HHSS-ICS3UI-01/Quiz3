
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dhalt0019
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        RobotSE Tina = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        int godown = 0;
        int count = 0;

        while (godown < 4) {

            while (count < 5) {

                Tina.putThing();
                Tina.move();

                count = count + 1;
            }

            Tina.turnAround();

            count = 0;

            while (count < 5) {

                Tina.move();

                count = count + 1;
            }
            count = 0;
            
            while (count < 1){
                
                Tina.turnLeft();
                Tina.move();
                Tina.turnLeft();
                
                count = count + 1;
            }
            count = 0;
            godown = godown + 1;
        }
    }
}