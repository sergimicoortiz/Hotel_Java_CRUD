package miniframework_hotel.Modules.room.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_room {

	private static final String	id			= "^([A-Z]{1})[-]([0-9]{4})$";
	private static final String	m2			= "^([1-9])([0-9]{0,2})$";
	private static final String	capacity	= "^([1-9]{1})([0-9]{0,1})$";
	private static final String	fecha		= "^([0-9]{1,2})[-]([0-9]{1,2})[-]([0-9]{4})$";
	private static final String	decimal		= "^([0-9]*)[.]([0-9]*)$";

	public static boolean valida_id(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(id);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-id

	public static boolean valida_m2(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(m2);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-m2

	public static boolean valida_capacity(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(capacity);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-capacity

	public static boolean valida_fecha(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(fecha);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-fecha

	public static boolean valida_decimal(String input) {
		boolean validator = false;
		Pattern expresioreg = Pattern.compile(decimal);
		Matcher varificacio = expresioreg.matcher(input);

		if (varificacio.matches()) {
			validator = true;
		} // end if

		return validator;
	}// valida-decimal

}// class
