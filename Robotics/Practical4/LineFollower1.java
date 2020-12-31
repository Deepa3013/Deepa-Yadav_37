/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linefollower1;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;

/**
 *
 * @author Ramesh Kumar Yadav
 */
public class LineFollower1
{
    LineFollower1()
    {
    
    LegoRobot robot=new LegoRobot();
    Gear gear=new Gear();
    LightSensor ls=new LightSensor(SensorPort.S3);
    robot.addPart(gear);
    gear.setSpeed(20);
    robot.addPart(ls);
    while(true)
    {
      int v=ls.getValue();
      if(v < 100)//black
      gear.forward();
      if(v > 300 && v < 750)  //blue
      gear.leftArc(0.05);
      if(v> 800)  //yellow
      gear.rightArc(0.05);
    }
  }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new LineFollower1();
    
  }
static
  {
   
        RobotContext.setStartPosition(50,490);
        RobotContext.setStartDirection(-90);
        RobotContext.useBackground("sprites/road.gif");
        // TODO code application logic here
    }
    
}
