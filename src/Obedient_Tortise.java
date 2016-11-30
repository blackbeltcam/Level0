import org.teachingextensions.logo.Tortoise;

public class Obedient_Tortise {
	public static void main(String[] args) {

		// 1. Make a new class, create a main method, and show the tortoise.
		Tortoise.show();
		Tortoise.penDown();
		// 2. Have the Tortoise draw a square.
		drawSquare();
		Tortoise.move(125);
		Tortoise.turn(90);
		// 3. Extract this code into a drawSquare() method.

		// 4. Have the Tortoise draw a triangle.

		// 5. Extract this code into a drawTriangle() method.
		drawTriangle();
		// 6. Have the Tortoise draw a circle.

		// 7. Extract this code into a drawCircle() method.

		// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

		// 9. Ask the user which color they want. Color the the shape depending on their answer.

	}

	static void drawSquare() {
		for (int four = 1; four <= 4; four++) {
			Tortoise.move(51);
			Tortoise.turn(90);
		}
	}

	static void drawTriangle() {
		for (int tri = 1; tri <= 3; tri++) {
			Tortoise.move(51);
			Tortoise.turn(-120);
		}
	}
}
