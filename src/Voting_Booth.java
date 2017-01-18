import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String old=JOptionPane.showInputDialog("How old are you?");
	int peop=Integer.parseInt(old);
	if (peop>=18){
		JOptionPane.showMessageDialog(null, "Go vote now!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Can't vote yet sorry! ;(");
	}
}
}
