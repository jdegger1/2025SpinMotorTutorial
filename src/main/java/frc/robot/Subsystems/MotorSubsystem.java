// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/// To create a subsystem file right click in subsystems
/// in the drop down select Create new class/command
/// Select subsystem
/// then type in the name of the subsystem and hit enter
/// you can do the same for commands when you get there.
/// 
/// Java is an object oriented programming language (O.O.P)
/// That is, you define and use objects to run your code.
/// Objects are defined by classes, where the class tells you what each object can do and what variables it takes and uses.
/// Here we are defining MotorSubsystem class
///
/// We use a command based robot for FRC
/// In RobotContainer we will create the subsystems of the robot and use commands to tell those subsystems what to do
public class MotorSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */

  /// Here, we create the instance variables for the MotorSubsystem
  /// Instance variables are defined within a class and can be used in any method within the class
  /// Each object(instance) of a class has its own instance variables defined within a class
  /// 
  /// Here we declare(essentially name) a SparkMax object
  /// These are premade classes of the RevLib vendorDep you will need to install, Mr. Foor can show you how, but its incredibly streamlined now
  /// Motors aren't directly programmed, instead they are controlled by motor controllers
  /// 
  /// Variables can be private or public
  /// Private variables can only be used inside their object or class
  /// Public variables can be used outside its object or class
  /// Variables can also be final
  /// This means once a variable is initialized, it can't be changed
  private final SparkMax motor;
  /// If your getting an error, that means you need to import the SparkMax class
  /// just hover over the error, click on the lightbulb, and click import

  /// public MotorSubsystem is a constructor
  /// Constructors are a unique method called whenever an object of its class is created
  /// within the parentheses() are the parameters for the constrocter method
  /// Here we have an int parameter
  /// int is a primitive data type using only integers
  /// Look up a list of primitive data types to see what they all do.
  /// Parameters are the variables that must be passed in when using a method or constructor
  public MotorSubsystem( int motorID){

    /// Here we initialize our SparkMax motor
    /// This is saying our SparkMax object named motor is a new SparkMax object
    /// This new SparkMax object has an ID number of int motorID and has a motor type of brushless
    motor = new SparkMax(motorID, MotorType.kBrushless);
    /// We just called the constructor from the SparkMax class
    /// It had two parameters
    /// An integer parameter for the id
    /// And a MotorType parameter (another premade class) for the motortype
    /// Motors can either be brushed or brushless
    /// For each parameter we passed in an argument
    /// We used motorID as the argument for the int parameter
    /// And MotorType.kBrushless for the MotorType parameter
  }
  
  /// Here we create a method
  /// Methods are instructions in a class telling the class and its objects what it can do
  /// Methods, like variables, can be public or private
  /// Public methods can be called(used) outside of the class
  /// Private methods can only be called inside the class
  /// Methods have return types
  /// The return type tells you what will be given back when you call the method
  /// An int return type means when you call that method an integer will be returned (given back)
  /// Here, a void return type means nothing is given back
  /// Our setSpeed method will be used to set the speed of a motor
  /// It has a double parameter, doubles are any real number (0.5, Pi, 1.9, e, etc)
  public void setSpeed(double speed){
    /// we use the SparkMax class's set method to set the speed of the motor
    /// SparkMax works in percentage so 1 is 100% speed, -1 is 100% in the other direction, 0.5 is 50%, etc.
    /// We use the speed parameter for the setSpeed method as the argument for the motor.set method
    motor.set(speed);
  }

  /// periodic is a premade method that we won't be using for this subsystem
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
