package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.Constants;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
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

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }
}
