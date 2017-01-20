package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.Constants;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
  private static Intake intake;
  private CANTalon intakeRoller;

  private Intake() {
    intakeRoller = new CANTalon(Constants.Intake.ROLLER_PORT);
  }

  public static Intake getIntake() {
    if (intake == null) {
      intake = new Intake();
    }
    return intake;
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }
}
