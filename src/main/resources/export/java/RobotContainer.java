#header()
// ROBOTBUILDER TYPE: RobotContainer.

package ${package};

import ${package}.commands.*;
import ${package}.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command.InterruptionBehavior;

#@autogenerated_code("imports", "")
#parse("${exporter_path}RobotContainer-imports.java")
#end


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

#@autogenerated_code("declarations", "    ")
#parse("${exporter_path}RobotContainer-declarations.java")
#end

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
#@autogenerated_code("SmartDashboard", "        ")
#parse("${exporter_path}RobotContainer-smartDashboard.java")
#end
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
#@autogenerated_code("subsystem_default_Command", "        ")
#parse("${exporter_path}RobotContainer-subsystem_default_Command.java")
#end

    // Configure autonomous sendable chooser
#@autogenerated_code("autonomous", "        ")
#parse("${exporter_path}RobotContainer-autonomous.java")
#end

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
#@autogenerated_code("buttons", "        ")
#parse("${exporter_path}RobotContainer-buttons.java")
#end
  }

#@autogenerated_code("functions", "    ")
#parse("${exporter_path}RobotContainer-functions.java")
#end

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

