// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.SpinMotorCmd;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.Subsystems.MotorSubsystem;
/// RobotContainer is where we put all of our subsystems and use all our commands
/// It is where we assign commands to buttons on joysticks
/// And it is where we assign the command to be run in autonomous
/// Like before, RobotContainer is a class, with an object of it created in Robot
/// DO NOT TOUCH THE MAIN AND ROBOT CLASSES
public class RobotContainer {

  //instance variables
  private final MotorSubsystem motorSub;

  /// joysticks are our controller input, we use xbox controllers primarily
  /// but flight sticks and button boards are also used
  private final Joystick joystick;
  public RobotContainer() {

    /// Here we finally create our new MotorSubystem object
    /// passing in an integer argument for the constructor parameter
    /// We use the Constants class to store motor id for easy access and change
    /// You can see how it is a static variable as we didn't have to create a new object to use the variable
    motorSub = new MotorSubsystem(MotorConstants.kMotorID);

    // we create a joystick object assigned to the port in constants
    joystick = new Joystick(OIConstants.kControllerPort);

    /// configure bindings calls the method we call further down
    /// It binds the commands to the different buttons
    configureBindings();
  }

  private void configureBindings() {
    /// We create a new joystick button object
    /// assigned to the Joystick joystick on the button assigned from our constants file
    /// while this button is pressed(true)
    /// we run a new SpinMotorCmd command
    /// this command uses the MotorSubsystem motorSub
    /// and sets the motor in motorSub to the value in our constants class
    new JoystickButton(joystick, OIConstants.KSpinForwardButton).whileTrue(new SpinMotorCmd(motorSub, MotorConstants.kMotorSpeed));
    /// With this, you should have all the code needed to spin a motor in a command robot
    /// Try making a second button to spin it the other way on your own.
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
