package org.usfirst.frc.team3501.robot.subsystems;

public class Shooter {
  private static Shooter shooter;

  private Shooter() {

  }

  public static Shooter getShooter() {
    if (shooter == null) {
      shooter = new Shooter();
    }
    return shooter;
  }
}
