// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.MotorSubsystem;

/// Commands are used to tell our subsystems what to do
/// To create a command file follow the steps for creating a subsystem, but click command instead
/// For now this looks like a complicated version of the setSpeed method
/// But as the robot gets more complex, a command based robot make programming much easier than a timed robot
public class SpinMotorCmd extends Command {
  /** Creates a new SpinMotorCmd. */
  /// Here we declare the instance variables for the SpinMotorCmd class
  /// We declare a MotorSubsystem object (from the class we just created) 
  /// And a double speed variable
  private final MotorSubsystem motorSub;
  private double speed;

  // constructor for the SpinMotor class
  public SpinMotorCmd(MotorSubsystem motorSub, double speed) {
    /// We don't want to make a new MotorSubsystem object because we are trying to use the same motor across the robot
    /// We will create our MotorSubsystem object for the robot within RobotContainer
    /// So within the constructor we have the MotorSubsystem as a parameter 

    /// In java there are instance variables, which can be used throughout the class
    /// And local variables are local to (only in) a method
    /// We have instance variables and local variables of the same name
    /// Java will prioritize local variables over instance variables
    /// To clarify that we are talking about the instance variable we use this
    /// this refers to the class we are in
    /// so this.motorSub refers to the instance variable
    /// while motorSub refers to the local variable passed in as a prameter of the constructor
    this.motorSub = motorSub;
    this.speed = speed;

    /// addRequirements() is used at the end of the constructor of a command 
    /// to ensure that a subsystem only runs one command at a time
    addRequirements(motorSub);
  }

  /// Commands have four methods
  /// initialize tells the command what to do when it first runs
  /// execute tells the command what to do continuously
  /// end tells the command what to do when it ends
  /// isFinished creates conditions for when the command should end
  @Override
  public void initialize() {}

  // Within the execute method we will tell set the speed of the motor within motorSub to speed
  @Override
  public void execute() {
    motorSub.setSpeed(speed);
  }

  // Within the end method we will stop the motor by setting its speed to zero.
  @Override
  public void end(boolean interrupted) {
    motorSub.setSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
