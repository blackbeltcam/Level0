
import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		for (int loops = 0; loops <= 3; loops++) {
			String dogs = JOptionPane.showInputDialog("How many dogs do you have?");

			// 2. Convert their answer into an int
			int dog = Integer.parseInt(dogs);

			// 3. If they have more than 3 cats, tell them they're a crazy cat lady
			if (dog > 3) {
				JOptionPane.showMessageDialog(null, "You're a CRAZY DOG LADY!");
			}

			// 4. If they have 3 or less, call the method below to show them a cat video
			if (dog <= 3) {
				playVideo("http://ijr.com/2016/09/682496-the-2016-list-of-the-cutest-dogs-on-capitol-hill/");
			}

			// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
			if (dog == 0) {
				playVideo("http://cdn1.onegreenplanet.org/wp-content/uploads/2010/10/2012/04/Frog-Sitting-on-a-Bench-One-Green-Planet.jpg");
			}
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
