import javax.swing.JOptionPane;

public class Number_Sorter {
	public static void main(String[] args) {
		something();
	}

	public static void something() {
		String Uhaul = JOptionPane.showInputDialog("What Is The First Number You Would Like In Ascending Order?");
		String Uhaul2 = JOptionPane.showInputDialog("What Is The Second Number You Would Like In Ascending Order?");
		String Uhaul3 = JOptionPane.showInputDialog("What Is The Third Number You Would Like In Ascending Order?");
		int Uhaul1 = Integer.parseInt(Uhaul);
		int Uhaul20 = Integer.parseInt(Uhaul2);
		int Uhaul30 = Integer.parseInt(Uhaul3);

		if ((Uhaul1 < Uhaul30) && (Uhaul1 < Uhaul20)) {

			if (Uhaul20 < Uhaul30) {
				System.out.println(Uhaul1 + " " + Uhaul20 + " " + Uhaul30);
			} else {
				System.out.println(Uhaul1 + " " + Uhaul30 + " " + Uhaul20);
			}

		}
		if ((Uhaul20 < Uhaul1) && (Uhaul20 < Uhaul30)) {
			if (Uhaul1 < Uhaul30) {
				System.out.println(Uhaul20 + " " + Uhaul1 + " " + Uhaul30);
			} else {
				System.out.println(Uhaul20 + " " + Uhaul30 + " " + Uhaul1);
			}
		}
		if ((Uhaul30 < Uhaul1) && (Uhaul30 < Uhaul20)) {
			if (Uhaul1 < Uhaul20) {
				System.out.println(Uhaul30 + " " + Uhaul1 + " " + Uhaul20);
			} else {
				System.out.println(Uhaul30 + " " + Uhaul20 + " " + Uhaul1);
			}

		}

	}

}
