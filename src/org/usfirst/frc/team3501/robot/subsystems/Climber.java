package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.Constants;

import com.ctre.CANTalon;

public class Climber {
  private static Climber climber;
  private CANTalon winch;

  private Climber() {
    winch = new CANTalon(Constants.Climber.WINCH_PORT);
  }

  public static Climber getClimber() {
    if (climber == null) {
      climber = new Climber();
    }
    return climber;
  }
}
