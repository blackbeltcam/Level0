
	/* Level 0 Exam: Coding  Exercise #2 */
   	import javax.swing.JOptionPane;
   	public class CodingExercise2 {

   	public static void main(String[] args) {
		
	

   	/**
   	 * Write a program that asks the user for their age. 
   	 * Tell them which year they were born. 
   	 * If they are over 30, tell them they are too old to play this game.
   	 **/

   	String age=JOptionPane.showInputDialog("What is your age?");

   	 
   	 int numage=Integer.parseInt(age);
   	 
   	 System.out.println((numage-2017));
   	 if (numage>30){
   		 System.out.println("You are too old to play this game.");
   	 }
   	 
   	 
   	}
   	}