
import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		//System.out.println(random);
		int thing2;
		// 11. do the following 10 times
		for (thing2= 1; thing2<=10; thing2++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String number=JOptionPane.showInputDialog("Guess a number 1-100");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int gubo = Integer.parseInt(number);
			// 5. if the guess is correct
			if (gubo==(random)){
				// 6. win
				JOptionPane.showMessageDialog(null, "Great job! You guessed it correct!");
				System.exit(0);
				break;
			}
			
			// 7. if the guess is high
			else if (gubo>(random)){
				// 8. tell them it's too high
			JOptionPane.showMessageDialog(null, "Too high.");	
			}
			// 9. if the guess is low
			else if (gubo<(random)){
				// 10. tell them it's too low
				JOptionPane.showMessageDialog(null, "Too low.");
			}
		}
		// 12. tell them they lose
		if (thing2!=10){
			JOptionPane.showMessageDialog(null, "You LOSE!");
			
	}
	}

}
