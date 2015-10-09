
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bettk6516
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City jw = new City();
        Robot rob = new Robot(jw, 1, 1, Direction.EAST, 20);



rob.putThing();
  
while (true) {
//loop forever
    for (int thingsPutH = 0; thingsPutH < 4; thingsPutH = thingsPutH + 1) {
        //will move and place things four times      
        rob.move();
                rob.putThing();

            }
            if (rob.getDirection() == Direction.EAST) {
                //when it's facing east it will move to the next row
                rob.turnLeft();
                rob.turnLeft();
                rob.turnLeft();
                rob.move();
                rob.putThing();
                rob.turnLeft();
                rob.turnLeft();
                rob.turnLeft();
            }

            for (int thingsPutH = 0; thingsPutH < 4; thingsPutH = thingsPutH + 1) {
               //it will move 4 times while placing things 
                rob.move();
                rob.putThing();


            }
            if (rob.getDirection() == Direction.WEST) {
               //when it's facing west it will move to the next row 
                if(rob.countThingsInBackpack()==0){
                 //after it has placed all the seeds it will stop and assume the end postiotin
                    rob.turnLeft();
                   rob.move();
                   rob.turnLeft();
                   break;
}

                rob.turnLeft();
                rob.move();
                rob.putThing();
                rob.turnLeft();


            }





        }
//will loop code until its backpack is empty












    }
}
