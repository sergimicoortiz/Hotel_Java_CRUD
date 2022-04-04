package miniframework_hotel.Modules.Users.Utils;

import javax.swing.JOptionPane;

import miniframework_hotel.Utils.validators;

public class ask_user {

	public static String username() {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string("Give me an username.", "Username");
			validator = regex_user.valida_username(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// username

	public static String email() {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string("Give me an email.", "Email");
			validator = regex_user.valida_email(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// email

	public static String password() {
		String cadena = "";
		cadena = validators.valida_string("Give me the password.", "Password");
		return cadena;
	}// password

	public static String country() {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string("The country where you live.", "Country");
			validator = regex_user.valida_country(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// Country

	public static String section() {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string("The section or flor where you work.", "Section");
			validator = regex_user.valida_username(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// section

}// class
