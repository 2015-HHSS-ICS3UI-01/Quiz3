
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new city called kw
        City kw = new City();
        //made a new robot named karel
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        //made a variable called movement and made it equal to 20
        int movement = 20;
        //commands in this while statement will always be executed
        while (true) {
            //if movement equals anything above zero, 
            //the following commands will be executed
            if (movement > 0) {
                karel.putThing();
                karel.move();
                //subtracts 1 from movement
                movement = movement - 1;
            }
            //if movement equals 16 or 6, 
            //the following commands will be executed
            if (movement == 16 || movement == 6) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.putThing();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                //subtracts 1 from movement
                movement = movement - 1;
            }
            //if movement equals 11, 
            //the following commands will be executed
            if (movement == 11) {

                karel.turnLeft();
                karel.putThing();
                karel.move();
                karel.turnLeft();
                //subtracts 1 from movement
                movement = movement - 1;
            }

            //if movement equals 1, 
            //the following commands will be executed
            if (movement == 1) {
                karel.putThing();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                //breaks the program out of the while loop
                break;
            }



        }



    }
}
