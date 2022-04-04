package miniframework_hotel.Modules.Users.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_user {

	private static final String	username	= "^[A-Za-z0-9_-]*$";
	private static final String	email		= "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	private static final String	fecha		= "^([0-9]{1,2})[-]([0-9]{1,2})[-]([0-9]{4})$";
	private static final String	Country		= "^([A-Za-z]{1})([a-z]*)$";
	

	public static boolean valida_username(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(username);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-username

	public static boolean valida_email(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(email);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-email

	public static boolean valida_country(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(Country);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-country

	public static boolean valida_fecha(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(fecha);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-fecha

}// class
