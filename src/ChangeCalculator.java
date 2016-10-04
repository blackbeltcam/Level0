
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String coins=JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int coinsAsInt=Integer.parseInt(coins);
		// Ask the user how many dimes they have, and convert their answer
		String coin=JOptionPane.showInputDialog("How many dimes do you have?");
		int coinAsInt=Integer.parseInt(coin);
		// Ask the user how many quarters they have, and convert their answer
		String coinses=JOptionPane.showInputDialog("How many quarters do you have?");
		int coinsesAsInt=Integer.parseInt(coinses);
		// Calculate how much money the user has and save it in a double variable 
		double money=(coins*5
		// Tell the user how much money they have

	}
}

