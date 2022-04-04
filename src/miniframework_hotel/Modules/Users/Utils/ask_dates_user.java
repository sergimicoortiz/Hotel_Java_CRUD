package miniframework_hotel.Modules.Users.Utils;

import javax.swing.JOptionPane;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Utils.validators;

public class ask_dates_user {
	public static fecha date(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		fecha fechaaux = null;
		String error = "The string don't have the correct format.";
		String errorfecha = "The date is not valid.";

		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_user.valida_fecha(cadena);
			if (validator == true) {
				fechaaux = new fecha(cadena);
				if (fechaaux.valida_fecha() == true) {
					interuptor = true;
				} else {
					interuptor = false;
					JOptionPane.showMessageDialog(null, errorfecha, "Result", JOptionPane.INFORMATION_MESSAGE);
				} // end else
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return fechaaux;
	}// fecha

}// class
