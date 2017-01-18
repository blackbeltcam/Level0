

	// Copyright Wintriss Technical Schools 2014
	import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

	/*** Teacher's note ***/
	/*
	 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
	 * increment). Do not give the students the answer to the challenge.
	 */

	public class Starz {

		public static void main(String[] args) {
			Tortoise.setSpeed(10);
			// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
			Tortoise.setX(10);
			Tortoise.setY(10);
			Tortoise.show();
			// 2. Make the Tortoise draw a star shape. Hint: 144.
		starBox();
			// 3. Set the size of the star to 30.

			/** THE CHALLENGE: **/
			/*
			 * Make the Tortoise draw a line of stars like this:
			 * http://bit.ly/walk-of-fame
			 * 
			 * Hint: The distance between stars is 50.
			 */
		}
			
	static void drawStar(){
		for (int blah=1; blah<=5; blah++){
			Tortoise.turn(144);
			Tortoise.move(30);
			}
	}
	static void moveForward(){
		Tortoise.turn(90);
		Tortoise.penUp();
		Tortoise.move(50);
		Tortoise.turn(-90);
		Tortoise.penDown();
		Tortoise.setPenColor(Colors.getRandomColor());
	}
	static void starBox(){
		for (int i=1; i<=9;i++){
			for (int your=1; your<=14;your++){
				drawStar();
				moveForward();
			}
			Tortoise.setX(10);
			Tortoise.setY(50*i);
			}
		}
		
		
	}

	
