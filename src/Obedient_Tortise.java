import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Obedient_Tortise {
	public static void main(String[] args) {
		int sides = JOptionPane.showOptionDialog(null, "What shape do you want?", "Pop-up Title", 0, JOptionPane.QUESTION_MESSAGE, null,
				new String[] { "Circle", "Square", "Triangle", "Random" }, null);
		if (sides== 3) {
			drawShape(360);
		}
		
		Tortoise.setSpeed(4);
		// 1. Make a new class, create a main method, and show the tortoise.
		Tortoise.show();
		Tortoise.penDown();
		// 2. Have the Tortoise draw a square.
		//drawSquare();
		//Tortoise.penUp();
		//Tortoise.setX(80);
		//Tortoise.setY(75);
		//Tortoise.penDown();
		// 3. Extract this code into a drawSquare() method.

		// 4. Have the Tortoise draw a triangle.

		// 5. Extract this code into a drawTriangle() method.
		//drawTriangle();
		// 6. Have the Tortoise draw a circle.
		//Tortoise.setSpeed(10);
		//Tortoise.setX(350);
		//Tortoise.setY(90);
		//drawCircle();
		// 7. Extract this code into a drawCircle() method.

		// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

		// 9. Ask the user which color they want. Color the the shape depending on their answer.

	}

	static void drawSquare() {
		for (int four = 1; four <= 4; four++) {
			Tortoise.move(51);
			Tortoise.turn(360/4);
		}
	}

	static void drawTriangle() {
		for (int tri = 1; tri <= 3; tri++) {
			Tortoise.move(51);
			Tortoise.turn(360/3);
		}
	}
	static void drawCircle() {
		for (int cir= 1; cir <= 360; cir++) {
			Tortoise.move(1);
			Tortoise.turn(360/360);
		}
	}
	static void drawShape(int numSides) {
		for (int )
		Tortoise.move(101);
		Tortoise.turn(360/numSides);
	}
}
