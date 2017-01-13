package org.usfirst.frc.team3501.robot.subsystems;

public class Intake {
  private static Intake intake;

  private Intake() {

  }

  public static Intake getIntake() {
    if (intake == null) {
      intake = new Intake();
    }
    return intake;
  }
}
