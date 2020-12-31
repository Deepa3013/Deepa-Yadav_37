/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pathfinder1;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.NxtContext;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.SensorPort;

/**
 *
 * @author Ramesh Kumar Yadav
 */
public class PathFinder1
{
     public PathFinder1()
  {
    NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    LightSensor ls1=new LightSensor(SensorPort.S1);
    LightSensor ls2=new LightSensor(SensorPort.S2);
    robot.addPart(gear);
    robot.addPart(ls1);
    robot.addPart(ls2);
    gear.forward();
   
    while(true)
    {
      int rightValue=ls1.getValue();
      int leftValue=ls2.getValue();
      int d=rightValue - leftValue;
      if(d>100)
        gear.rightArc(0.1);
      if(d < -100)
        gear.leftArc(0.1);
      if(d > -100 && d < 100 && rightValue > 500)
        gear.forward();
    }
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
          new PathFinder1();
  }
  static
  {
    NxtContext.setStartPosition(250,490);
    NxtContext.setStartDirection(-90);
    NxtContext.useBackground("sprites/path.gif");
        // TODO code application logic here
    }
    
}
