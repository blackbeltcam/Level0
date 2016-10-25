import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
	String happy=JOptionPane.showInputDialog("Are you happy?");
	if (happy.equals("yes")){
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	String Rey="";
	if (happy.equals("no")){
		 Rey=JOptionPane.showInputDialog("Do you want to be happy?");
	
	 if (Rey.equals("no")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if (Rey.equals("yes")){
		JOptionPane.showMessageDialog(null, "Change something");
	}
	
}
}
}
