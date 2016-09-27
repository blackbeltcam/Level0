
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		Tortoise.hide();
		Tortoise.setPenWidth(10);
		Tortoise.penDown();
		Tortoise.setSpeed(7);
		for (int loop=0; loop<1000000; loop++){
		//3. ask the user what color they would like the tortoise to draw
		String color=JOptionPane.showInputDialog("What color would you like the square to be?");
		//4. use an if/else statement to set the pen color that the user requested
		
		if (color.equals("red")){
	    Tortoise.setPenColor(Color.RED);
}
		else if (color.equals("blue")){
		Tortoise.setPenColor(Color.BLUE);
}
		else if (color.equals("green")){
		Tortoise.setPenColor(Color.GREEN);
}
		else{
		Tortoise.setPenColor(Color.MAGENTA);
		}
		for (int square=0; square<4; square++){
			Tortoise.move(100);
			Tortoise.turn(90);
		}
}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	//1. make the tortoise draw a shape (this will take more than one line of code)



	}
}

