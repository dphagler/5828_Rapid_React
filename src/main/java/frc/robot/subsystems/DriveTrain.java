// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {

  private final Spark leftFront;
  private final Spark leftRear;
  private final Spark rightFront;
  private final Spark rightRear;

  private final MotorControllerGroup leftMotors;
  private final MotorControllerGroup rightMotors;

  private final DifferentialDrive m_drive;

  /** Creates a new DriveTrain. */
  public DriveTrain() {

    leftFront = new Spark(0);
    leftRear = new Spark(1);
    rightFront = new Spark(2);
    rightRear = new Spark(3);

    leftMotors = new MotorControllerGroup(leftFront, leftRear);
    rightMotors = new MotorControllerGroup(rightFront, rightRear);

    m_drive = new DifferentialDrive(leftMotors, rightMotors);    

  }

  public void arcadeDrive(double fwd, double rot){
    m_drive.arcadeDrive(fwd, rot);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
