package org.usfirst.frc.team3501.robot.subsystems;

public class GearHolder {
  private static GearHolder gearHolder;

  private GearHolder() {

  }

  public static GearHolder getGearHolder() {
    if (gearHolder == null) {
      gearHolder = new GearHolder();
    }
    return gearHolder;
  }
}
