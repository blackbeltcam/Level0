import javax.swing.JOptionPane;

public class CreateAMethod {
	public static void main(String[] args) {
		nameCool();
		ageBorn(50);
		something(5, "kewl");
		mult(5, 20);
		four(3, 25, 5);
	}

	static void nameCool() {
		String names = JOptionPane.showInputDialog("What is your name?");
		System.out.println(names + " is so cool!");

	}

	static void ageBorn(int age) {

		int birthyear = 2017 - age;
		System.out.println("You were born in " + birthyear);

	}

	static void something(int repeats, String bibi) {
		for (int blah = 0; blah < repeats; blah++) {
			System.out.println(bibi);
		}

	}

	static void mult(int first, int second) {
		int answer = first * second;
		System.out.println(answer);

	}

	static void four(int first, int second, int third) {
		int answer = second - third;
		int blah = answer * first;
		System.out.println(blah);

	}

}
