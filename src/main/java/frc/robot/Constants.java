package frc.robot;

/// The Constants class is an orginizational class
/// It is used to store variables that don't change in the robot
/// It provides ease of access while programming and tuning speeds

public final class Constants {

    /// We organize the constants into smaller constant classes
    /// typically organized by the subsystem the constants are used for
    /// Here we see static
    /// Not only can things be public or private, and final, they can also be static
    /// Static means you don't need to create an object of the class to use the static methods and variables ub the class
    public static class MotorConstants{

        //Change this value to the id of the spark max
        public static final int kMotorID = 0;

        /// start slow while testing speeds
        /// rn its 10% speed, negative spins it the other way
        public static final double kMotorSpeed = 0.1;
    }

    /// OIConstants is used for controller ports and storing button value
    public static class OIConstants{
    
        /// controllerPort is based on plugging into computer
        /// Typically the first controller is port 0
        /// And the second is port 1
        /// I'm not sure tho
        public static final int kControllerPort = 0;
        
        /// Each button is connected to a unique integer, similar to ports or ids
        /// On the xbox controller it is
        /// 1 A
        /// 2 B
        /// 3 X
        /// 4 Y
        /// 5 LB
        /// 6 Rb
        /// 7 2 squares
        /// 8 3 lines
        
        public static final int KSpinForwardButton = 1;
    }
}
