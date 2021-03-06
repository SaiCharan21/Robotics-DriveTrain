package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class DriveWithJoystick extends CommandBase
{

    public DriveWithJoystick()
    {
        addRequirements(RobotContainer.getDriveTrain());
    }

    @Override
    public void initialize()
    {}

    @Override
    public void execute()
    {
        RobotContainer.getDriveTrain().takeJoystickInputs(RobotContainer.getJoy());
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }

    @Override
    public void end(boolean interrupted)
    {
        RobotContainer.getDriveTrain().stop();
    }
}