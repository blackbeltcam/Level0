import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	String win="And the winning Lottery numbers are... ";
	
	for (int Lottery=1; Lottery<=5; Lottery++){
	int blah=new Random().nextInt(50)+1;
	if(Lottery==5){
		win+=blah+" ";
	}
	else{
	win+=blah+", ";
	}
	}
	JOptionPane.showMessageDialog(null, win);
}
}

