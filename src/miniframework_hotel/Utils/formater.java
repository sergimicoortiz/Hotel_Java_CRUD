package miniframework_hotel.Utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class formater {

	public static String decimal1(String num) {
		DecimalFormat decimal1 = new DecimalFormat(".#");
		return decimal1.format(Double.parseDouble(num));
	}// decimal1

	public static String decimal2(String num) {
		DecimalFormat decimal2 = new DecimalFormat(".##");
		return decimal2.format(Double.parseDouble(num));
	}// decimal2

	public static String decimal3(String num) {
		DecimalFormat decimal3 = new DecimalFormat(".###");
		return decimal3.format(Double.parseDouble(num));
	}// decimal3

	public static String nodec(String num) {
		DecimalFormat decimal3 = new DecimalFormat("#");
		return decimal3.format(Double.parseDouble(num));
	}// nodec

	public static String dolars(String cantidad) {
		NumberFormat dolar = NumberFormat.getCurrencyInstance(Locale.US);
		return dolar.format(Double.parseDouble(cantidad));
	}// dolars

	public static String euros(String cantidad) {
		NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		return euro.format(Double.parseDouble(cantidad));
	}// euros

	public static String percent(String num) {
		String numaux = formater.decimal2(num);
		numaux = numaux + " %";
		System.out.println("percent: " + numaux);
		return numaux;
	}// percent
	

}// class
