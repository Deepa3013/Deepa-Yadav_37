/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulargear1;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.NxtContext;
import ch.aplu.robotsim.NxtRobot;

/**
 *
 * @author Ramesh Kumar Yadav
 */
public class CircularGear1
{
       CircularGear1()
 {
    NxtRobot robot=new NxtRobot();
   Gear gear=new Gear();
   robot.addPart(gear);
  gear.forward(200);
  gear.setSpeed(20);
  gear.leftArc(0.2,7000);
 gear.forward(200);
  gear.leftArc(0.2,7000);
gear.forward(200);
 gear.leftArc(0.2,7000);
gear.forward(200);
    gear.leftArc(0.2,7000);
  gear.forward(200);
 robot.exit();
}

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         CircularGear1  m=new  CircularGear1();
    NxtContext.setStartPosition(250,200);
   NxtContext.setStartDirection(90);
        // TODO code application logic here
    }
    
}
