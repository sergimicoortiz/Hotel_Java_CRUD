package miniframework_hotel.Modules.room.Utils;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Utils.validators;

public class ask_room {

	public static String id(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_id(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// id

	public static String id_up(String mensaje, String title, int type) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		boolean id_ok = true;
		String error = "The string don't have the correct format.";
		String[] ids = null;

		switch (type) {
		case 0:
			System.out.println("case 0");
			ids = new String[Singletone.Single.size()];
			for (int i = 0; i < Singletone.Single.size(); i++) {
				ids[i] = Singletone.Single.get(i).getId();
			} // end for
			break;
		case 1:
			System.out.println("case 1");
			ids = new String[Singletone.Doouble.size()];
			for (int i = 0; i < Singletone.Doouble.size(); i++) {
				ids[i] = Singletone.Doouble.get(i).getId();
			} // end for
			break;
		case 2:
			System.out.println("case 2");
			ids = new String[Singletone.Suite.size()];
			for (int i = 0; i < Singletone.Suite.size(); i++) {
				ids[i] = Singletone.Suite.get(i).getId();
			} // end for
			break;

		default:
			break;
		}

		while (interuptor == false) {
			id_ok = true;
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_id(cadena);
			if (validator == true) {
				for (int i = 0; i < ids.length; i++) {
					System.out.println("for: " + i);
					if (cadena.equals(ids[i])) {
						System.out.println("equals id");
						id_ok = false;
					} // end if
				} // end for
				if (id_ok == true) {
					interuptor = true;
				} else {
					interuptor = false;
					JOptionPane.showMessageDialog(null, "The id alredy exist", "Result",
							JOptionPane.INFORMATION_MESSAGE);
				} // end else if
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// id_up

	public static String m2(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_m2(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// m2

	public static String capacity(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_capacity(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// capacity

	public static String decimal(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_decimal(cadena);
			if (validator == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// decimal

	public static String discount(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		String error = "The string don't have the correct format.";
		String bigger100 = "The discount can't be bigger than 100.";
		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_decimal(cadena);

			if (validator == true) {
				if (Double.parseDouble(cadena) <= 100) {
					interuptor = true;
				} else {
					interuptor = false;
					JOptionPane.showMessageDialog(null, bigger100, "Result", JOptionPane.INFORMATION_MESSAGE);
				} // end elseif
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		System.out.println(cadena);
		return cadena;
	}// discount

	public static boolean boolRoom(int tipo) {
		// 0 wifi, 1 aval, 2 vistas, 3 excur, 4 tv, 5 mus, 6 velas
		boolean tf = false;
		String[] wifisn = { "The room have WiFi", "The room DON'T have WiFi" };
		String[] avalsn = { "The room is avalible", "The room is NOT avalible" };
		String[] vistassn = { "The room have good views", "The room don't have good views" };
		String[] excursionsn = { "The room includs an excursion", "The room don't includs an excursion" };
		String[] tvsn = { "The room have tv", "The room don't have tv" };
		String[] musicasn = { "The room have music", "The room don't have music" };
		String[] candlessn = { "The room have candles", "The room don't have candles" };

		switch (tipo) {
		case 0:
			tf = validators.valida_boolean("Choose", "Wifi", wifisn);
			break;
		case 1:
			tf = validators.valida_boolean("Choose", "Avalilable", avalsn);
			break;
		case 2:
			tf = validators.valida_boolean("Choose", "Views", vistassn);
			break;
		case 3:
			tf = validators.valida_boolean("Choose", "Excursion", excursionsn);
			break;
		case 4:
			tf = validators.valida_boolean("Choose", "TV", tvsn);
			break;
		case 5:
			tf = validators.valida_boolean("Choose", "Music", musicasn);
			break;
		case 6:
			tf = validators.valida_boolean("Choose", "Candles", candlessn);
			break;

		default:
			tf = false;
			break;
		}// swich
		return tf;
	}// boolRoom

}// class
