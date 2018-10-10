package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import net.bak3dnet.robotics.display.RevDigitDisplay;
import net.bak3dnet.robotics.display.modules.RapidDiagnosticsModule;

//import net.bak3dnet.robotics.display.RevDigitDisplay;

public class Team3487Bot extends IterativeRobot {

  //RobotController.getBatteryVoltage();

  /*
  * This is an experimental edition
  */

  @Override
  public void robotInit() {

    RevDigitDisplay display = RevDigitDisplay.getInstance();

    display.setActiveModule(new RapidDiagnosticsModule());

  }

  @Override
  public void teleopPeriodic() {


  }
}
