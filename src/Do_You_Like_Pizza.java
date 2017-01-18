import javax.swing.JOptionPane;

public class Do_You_Like_Pizza {
public static void main(String[] args) {
	String Pizza=JOptionPane.showInputDialog("Do you like Pizza?");
	if (Pizza.equals("yes")){
		String peeps=JOptionPane.showInputDialog(null, "Do you like Pepperoni?");
	if (peeps.equals("yes")){
		JOptionPane.showMessageDialog(null, "Enjoy your Pepperoni Pizza!");
	}
	else if (peeps.equals("no")){
		JOptionPane.showMessageDialog(null, "Enjoy your Cheese Pizza!");
	}
	else{
		JOptionPane.showMessageDialog(null, "You didn't aswer the question correctly!");
	}
		
		
		
		
		
		
}
	if (Pizza.equals("no")){
		String Salad=JOptionPane.showInputDialog("Then do you like Salad?");
		if (Salad.equals("yes")){
			JOptionPane.showMessageDialog(null, "Enjoy your Pepperoni Salad!");
		}
		else if (Salad.equals("no")){
			JOptionPane.showMessageDialog(null, "Then you will be Hungry!!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You didn't enter the question correctly!");
		}
		
		
		
		
	}
}
}
