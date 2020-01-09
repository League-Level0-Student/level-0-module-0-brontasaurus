package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot tony = new Robot();
		tony.setSpeed(100);
		tony.hide();
		tony.turn(180);
		tony.penDown();
		tony.move(100);
		tony.turn(180);
		tony.move(75);
		tony.turn(90);
		tony.move(25);
		tony.turn(180);
		tony.move(50);
		
	}

}
