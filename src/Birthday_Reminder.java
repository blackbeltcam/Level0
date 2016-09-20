import javax.swing.JOptionPane;

public class Birthday_Reminder {
public static void main(String[] args) {
	// 1. correct the birthdays for your family below
			String momsBirthday = "March 24th";
			String dadsBirthday = "June 9th";
			String myBirthday = "November 11th";

			// 2. Find out which birthday the user wants and store their response in a variable
		String person=JOptionPane.showInputDialog("Are you my mom, my dad, or me?");
			// 3. Print out what the user typed
			JOptionPane.showMessageDialog(null, "Hello "+person);
			// 4. if user asked for "mom"
			if (person.equals("mom")){
				//print mom's birthday
				JOptionPane.showMessageDialog(null, "Your Birthday is "+momsBirthday);
			}
			// 5. if user asked for "dad"
			else if (person.equals("dad")){
				// print dad's birthday
				JOptionPane.showMessageDialog(null, "Your Birthday is "+dadsBirthday);
			}
			// 6. if user asked for your name
			else if (person.equals("me")){
				// print myBirthday
				JOptionPane.showMessageDialog(null, "My Birthday is "+myBirthday);
			}
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else{
				JOptionPane.showMessageDialog(null, "WHO ARE YOU!!!????");
			}
	
	
	
	
	
	
}
}
