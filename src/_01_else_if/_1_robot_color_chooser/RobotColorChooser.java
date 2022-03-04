
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot Bob = new Robot();
		String ask = JOptionPane.showInputDialog(null, "What color do you want the shape to be");
		//5. Use an if/else statement to set the pen color that the user requested
		if(ask.equals("red")) {
		Bob.setPenColor(255,0,0);
		}else if(ask.equals("blue")) {
		Bob.setPenColor(0,0,255);
		}else if(ask.equals("green")) {
		Bob.setPenColor(0,255,0);
		}else {
			Random ran = new Random();
			Bob.setPenColor(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));
		}
		//1. Create a new Robot
			
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Bob.setSpeed(100);
		Bob.penDown();
		Bob.move(150);
		Bob.turn(60);
		Bob.move(150);
		Bob.turn(60);
		Bob.move(150);
		Bob.turn(60);
		Bob.move(150);
		Bob.turn(60);
		Bob.move(150);
		Bob.turn(60);
		Bob.move(150);
		Bob.turn(60);
		//3. Set the pen width to 10
		Bob.setPenWidth(100);
		//4. Ask the user what color pen they would like the robot to draw with
		
		
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		


		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}
}
