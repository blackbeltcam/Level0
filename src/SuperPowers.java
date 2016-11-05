

	import javax.swing.JOptionPane;


	/*
	 * Everyone has a superpower. Mine is writing recipes. This program will store
	 * the superpowers of all the people in the classroom. E.g. When I type "June",
	 * your program should say "June's superpower is writing recipes".
	 */
	public class SuperPowers {
	public static void main(String[] args) {


			// 1. Save the superpower for each person in a variable.
		String salex= "Super Hearing";
		String scameron= "Mind Control";
		String skeith= "Super Speed";
			// 2. Ask the user to enter a name. Store their answer in a variable.
		String sname=JOptionPane.showInputDialog("Who's Super power is who's? Enter a name");

			// 3. Show the superpower in a pop-up, depending on the name entered. 
		if (sname.equals("Keith")){
			JOptionPane.showMessageDialog(null, "Keith's super power is "+ skeith);
		}
		else if (sname.equals("Cameron")){
		JOptionPane.showMessageDialog(null, "Cameron's super power is "+ scameron);	
		}
		else if (sname.equals("Alex")){
			JOptionPane.showMessageDialog(null, "Alex's super power is "+ salex);
		}
	}
	}
	



