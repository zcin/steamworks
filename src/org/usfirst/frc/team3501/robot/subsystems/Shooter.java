package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.Constants;

import com.ctre.CANTalon;

public class Shooter {
  private static Shooter shooter;
  private CANTalon flyWheel, indexWheel;

  private Shooter() {
    flyWheel = new CANTalon(Constants.Shooter.FLY_WHEEL_PORT);
    indexWheel = new CANTalon(Constants.Shooter.INDEX_WHEEL_PORT);
  }

  public static Shooter getShooter() {
    if (shooter == null) {
      shooter = new Shooter();
    }
    return shooter;
  }

}
