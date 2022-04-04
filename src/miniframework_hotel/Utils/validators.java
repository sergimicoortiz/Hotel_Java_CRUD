package miniframework_hotel.Utils;

import javax.swing.JOptionPane;

public class validators {

	public static int valida_num(String mensaje, String titulo) {
		boolean inputCheck = false;
		String input = "";
		int num = 0;

		inputCheck = false;
		do {
			try {
				System.out.println("Estamos en dentro del try valida num");
				input = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Closing the aplication", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					num = Integer.parseInt(input);
					inputCheck = true;
				}
			} catch (Exception e) {
				System.out.println("Estamos en dentro del cach valida num");
				JOptionPane.showMessageDialog(null, "The number introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end try catch

		} while (inputCheck == false); // end do while
		System.out.println(num);

		return num;
	}// end valida_num

	public static int valida_num_pos(String mensaje, String titulo) {
		boolean inputCheck = false;
		String input = "";
		int num = 0;

		inputCheck = false;
		do {
			try {
				System.out.println("Estamos en dentro del try valida num pos");
				input = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Closing the aplication", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					num = Integer.parseInt(input);
					inputCheck = true;
				}
			} catch (Exception e) {
				System.out.println("Estamos en dentro del cach valida num pos");
				JOptionPane.showMessageDialog(null, "The number introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end try catch
			if (num < 0) {
				JOptionPane.showMessageDialog(null, "The number introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end if
		} while (inputCheck == false); // end do while
		System.out.println(num);

		return num;
	}// end valida_num_pos

	public static int valida_num_neg(String mensaje, String titulo) {
		boolean inputCheck = false;
		String input = "";
		int num = 0;

		inputCheck = false;
		do {
			try {
				System.out.println("Estamos en dentro del try valida num pos");
				input = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Closing the aplication", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					num = Integer.parseInt(input);
					inputCheck = true;
				}
			} catch (Exception e) {
				System.out.println("Estamos en dentro del cach valida num pos");
				JOptionPane.showMessageDialog(null, "The number introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end try catch
			if (num > 0) {
				JOptionPane.showMessageDialog(null, "The number introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end if
		} while (inputCheck == false); // end do while
		System.out.println(num);

		return num;
	}// end valida_num_neg

	public static char valida_char(String mensaje, String titulo) {
		char lletra = ' ';
		boolean inputCheck = false;
		String input = "";

		inputCheck = false;
		do {
			try {
				System.out.println("Estamos en dentro del try valida char");
				input = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Closing the aplication", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					lletra = input.charAt(0);
					inputCheck = true;
				}
			} catch (Exception e) {
				System.out.println("Estamos en dentro del cach valida char");
				JOptionPane.showMessageDialog(null, "The letter introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end try catch
		} while (inputCheck == false); // end do while
		System.out.println(lletra);

		return lletra;
	}// end valida_char

	public static String valida_string(String mensaje, String titulo) {
		String input = "";
		boolean ok = false;

		do {
			try {
				input = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
				ok = true;
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Closing the aplication", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				if (input.equals("")) {
					JOptionPane.showMessageDialog(null, "Error invalid string", "Error", JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No valod String", "Error", JOptionPane.ERROR_MESSAGE);
				ok = false;
			}
		} while (ok == false);
		return input;
	}// valida_string

	public static boolean valida_boolean(String mensaje, String title, String[] botons) {
		/**
		 * La primera opcio de la array a introduir sera la que possara el valor en true
		 */
		boolean tf = false;
		int bot = 0;
		boolean interuptor = false;
		while (interuptor == false) {
			bot = menus.botons(title, mensaje, botons);
			switch (bot) {
			case 0:
				interuptor = true;
				tf = true;
				break;
			case 1:
				interuptor = true;
				tf = false;
				break;
			default:
				interuptor = false;
				JOptionPane.showMessageDialog(null, "You have to select an option", "ERROR",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}// switch
		} // while

		return tf;
	}// valida_boolean

	public static float valida_float(String mensaje, String titulo) {
		boolean inputCheck = false;
		String input = "";
		float num = 0.0f;

		inputCheck = false;
		do {
			try {
				System.out.println("Estamos en dentro del try valida float");
				input = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Closing the aplication", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					num = Float.parseFloat(input);
					inputCheck = true;
				}
			} catch (Exception e) {
				System.out.println("Estamos en dentro del cach valida num");
				JOptionPane.showMessageDialog(null, "The float introduced is not valid", "Error",
						JOptionPane.ERROR_MESSAGE);
				inputCheck = false;
			} // end try catch

		} while (inputCheck == false); // end do while
		System.out.println(num);
		return num;
	}// valida_float

}// end class
