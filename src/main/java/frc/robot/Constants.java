// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
     /*****************Motor ports*****************/

     public static final int LEFT_TOP_MOTOR = 14; 
     public static final int LEFT_BOTTOM_MOTOR = 15;
     public static final int RIGHT_TOP_MOTOR = 0;
     public static final int RIGHT_BOTTOM_MOTOR = 1;

    //  Drivetrain
     public static final double Z_ROT_DAMPENING = 0.75;
     public static final double TURN_TOLERANCE =  2;
     public static final double DRIVE_TOLERANCE = 0.5;
     public static final double DRIVETRAIN_WHEEL_DIAMETER = .1524;
     public static final double DISTANCE_PER_PULSE = (Math.PI * DRIVETRAIN_WHEEL_DIAMETER/1440)/3.68;

      //We need to measure these too
    public static final double MAX_VELOCITY = 1.6333;
    public static final double MAX_ACCELERATION = 1.0611;
}
