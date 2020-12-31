/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circlem1;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.Tools;



/**
 *
 * @author Ramesh Kumar Yadav
 */
public class Circlem1
{
    Circlem1()
    {
         NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    robot.addPart(gear);
    gear.setSpeed(60);
    gear.leftArc(0.2,7000);
    gear.rightArc(0.2);
    Tools.delay(5000);
    robot.exit();
  }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new Circlem1();
        // TODO code application logic here
    }
    
}
