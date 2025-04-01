This project is code to make a command robot to spin a motor at a flat speed.  
It is heavily commented and I tried my best to go over some of the basics of both java and first programming.  
I highly recommend using the zero to autonomous video series; however, I wanted to throw my hat in the ring and create some more up to date guides.  

### MotorSubsystem
First create a subsystem with name [MotorSubsystem](https://github.com/jdegger1/2025SpinMotorTutorial/blob/main/src/main/java/frc/robot/Subsystems/MotorSubsystem.java), it will cover:
- classes and objects  
- Instance variables  
- variable types  (public, private, final)
- primitive data types
- constructors and methods  
- and parameters and arguments

### SpinMotorCmd
Then create a command with name [SpinMotorCmd](https://github.com/jdegger1/2025SpinMotorTutorial/blob/main/src/main/java/frc/robot/Commands/SpinMotorCmd.java), it will cover:
- instance variables vs. local variables
- this
- addRequirements
- and initialize, execute, end, and is finished

### RobotContainer
Then go to [RobotContainer](https://github.com/jdegger1/2025SpinMotorTutorial/blob/main/src/main/java/frc/robot/RobotContainer.java), it will cover:
- Use of subsystems and commands
- joysticks
- configureBindings
- and creating a Joystick button

When a constant is used, refer to Constants, it covers:
- Why we use constants
- and Static variables

Let me know if I should make any changes or if you have any questions!
