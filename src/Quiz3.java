
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //City
        City town = new City();
        //Robot
        Robot jarvis = new Robot(town,1,1,Direction.EAST,20);
        //move jarvis
        for(int inc=0;inc!=2;inc++){
            //two rows at a time
            for(int inc2=0;inc2!=2;inc2++){
                //one row done twice
                for(int inc3=0;inc3!=5;inc3++){
                    jarvis.putThing();
                    //stop him from moving the last time
                    if(inc3!=4){
                        jarvis.move();
                    }
                }
                //turn around
                if(inc2==0){
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    jarvis.move();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                }else{
                    jarvis.turnLeft();
                    jarvis.move();
                    jarvis.turnLeft();
                }
            }
        }
    }
}
