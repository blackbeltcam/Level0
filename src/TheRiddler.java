import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	// 1. Make a variable to hold the score
	int score= 0;
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	String answer=JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (answer.equals("stop imagining")){
				JOptionPane.showMessageDialog(null, "correct!");
				score+= 10;
			}
			else{
				JOptionPane.showMessageDialog(null, "Wrong! The answer is stop imagining");
				score-= 5;
			}
			// 5. Otherwise, say "wrong" and tell them the answer

			// 6. Add some more riddles

			// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null,"your score is "+ score);
}
}
