
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(80);
		rob.setSpeed(80000);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for (int x = 0; x < 10; x++) {
		for (int i=0; i < 5; i++) {
		rob.penDown();
		rob.move(30);
		rob.turn(144);
		}
		// 3. Set the length of each line in the star to 30.
		rob.penUp();
		rob.turn(90);
		rob.move(50);
		rob.turn(270);
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */
		}
	}

}
