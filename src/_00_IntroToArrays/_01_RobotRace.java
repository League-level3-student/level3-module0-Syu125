package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random random = new Random();
		int speed = random.nextInt(50);
		Boolean run = true;
		int x = 60;
		Robot[] r = new Robot[5];

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setY(500);
			// r[i].setX(x);
			// r[i].setY(500);
			// x += 120;
		}
		r[0].setX(60);
		r[1].setX(180);
		r[2].setX(300);
		r[3].setX(420);
		r[4].setX(540);
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		/*
		 * for (int i = 0; i < r.length; i++) { r[i].moveTo(x, y + speed); speed =
		 * random.nextInt(50); x += 120; }
		 */

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (run) {
			for (int i = 0; i < r.length; i++) {
				r[i].setY(r[i].getY() - speed);
				speed = random.nextInt(50);
				if (r[i].getY() <= 60) {
					run = false;
					int winner = i + 1;
					System.out.println("Robot " + winner + " wins!");
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
