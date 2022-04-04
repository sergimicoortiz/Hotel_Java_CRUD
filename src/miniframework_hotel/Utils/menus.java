package miniframework_hotel.Utils;

import javax.swing.JOptionPane;

public class menus {

	public static int botons(String titul, String contingut, String[] botons) {
		int val_boto = 0;

		val_boto = JOptionPane.showOptionDialog(null, contingut, titul, 0, JOptionPane.QUESTION_MESSAGE, null, botons,
				botons[0]);
		System.out.println("El ususario ha elegido " + val_boto);
		return val_boto;
	}// botons

	public static String desplegable(String titul, String contingut, String[] opcions) {
		Object seleccio = null;
		String slide = "";
		seleccio = JOptionPane.showInputDialog(null, contingut, titul, JOptionPane.QUESTION_MESSAGE, null, opcions,
				opcions[0]);
		if (seleccio != null) {
			slide = seleccio.toString();
			System.out.println("El usuario ha triat " + slide);
		} // end if

		return slide;
	}// slide

	public static boolean interuptor() {
		String submenu_valor = "";
		boolean inter = false;
		String[] submenu = { "Another", "Back", "Exit" };
		boolean interuptor = false;
		while (interuptor == false) {
			submenu_valor = menus.desplegable("Select", "Select an option", submenu);
			switch (submenu_valor) {
			case "Another":
				inter = false;
				interuptor = true;
				break;
			case "Back":
				inter = true;
				interuptor = true;
				break;
			case "Exit":
				interuptor = true;
				System.exit(0);
				break;
			default:
				interuptor = false;
				JOptionPane.showMessageDialog(null, "You need to select something.", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			}// swich
		} // end while

		return inter;
	}// interuptor

}// class
