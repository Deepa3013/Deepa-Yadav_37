/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movewithgear1;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.NxtRobot;

/**
 *
 * @author Ramesh Kumar Yadav
 */
public class MoveWithGear1
{
     MoveWithGear1()
    {
        NxtRobot robot=new NxtRobot();
        Gear gear=new Gear();
        robot.addPart(gear);
        
        gear.forward(600);
        gear.setSpeed(20);
        
        gear.left(800);
        gear.forward(200);
        gear.right(480);
        robot.exit();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MoveWithGear1 m=new MoveWithGear1();
        // TODO code application logic here
    }
    
}
