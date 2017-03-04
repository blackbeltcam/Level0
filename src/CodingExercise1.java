

import java.awt.Color;
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Tortoise.setSpeed(8);
    	 //Tortoise
   	 // 3. ask the user what color they would like the Robot to draw
    	String color=JOptionPane.showInputDialog("What color would you like drawn?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if (color.equals("pink")){
    		Tortoise.setPenColor(Color.PINK);
    	}
    	else if (color.equals("red")){
    		Tortoise.setPenColor(Color.RED);
    	}
    	else{
    		Tortoise.setPenColor(Color.BLACK);
    	}
   	 // 2. set the pen width to 10
    	Tortoise.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 for (int shape=1; shape<=4; shape++){
   		 Tortoise.move(200);
   		 Tortoise.turn(90);
   		 
   	 }
   	/* Level 0 Exam: Coding  Exercise #2 */
   	import javax.swing.JOptionPane;

   	/**
   	 * Write a program that asks the user for their age. 
   	 * Tell them which year they were born. 
   	 * If they are over 30, tell them they are too old to play this game.
   	 **/

   	String age=JOptionPane.showInputDialog("What is your age?");

   	 
   	 int numage=Integer.parseInt(age);
   	 
   	 
   	 
   	 
   	 
   	 
    }

}
