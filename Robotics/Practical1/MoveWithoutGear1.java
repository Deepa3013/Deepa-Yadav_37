/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movewithoutgear1;

import ch.aplu.robotsim.TurtleRobot;

/**
 *
 * @author Ramesh Kumar Yadav
 */
public class MoveWithoutGear1
{
    MoveWithoutGear1()
    {
        TurtleRobot robot=new TurtleRobot();
        robot.forward(100);
        robot.left(45);
        robot.forward(200);
        robot.right(90);
        robot.backward(100);
        robot.exit();
        
    }
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         MoveWithoutGear1 m=new MoveWithoutGear1();
        // TODO code application logic here
    }
    
}
