package miniframework_hotel.Modules.room.Utils;

import javax.swing.JOptionPane;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Utils.validators;

public class ask_dates_room {
	public static fecha date(String mensaje, String title) {
		String cadena = "";
		boolean interuptor = false;
		boolean validator = false;
		fecha fechaaux = null;
		String error = "The string don't have the correct format.";
		String errorfecha = "The date is not valid.";

		while (interuptor == false) {
			cadena = validators.valida_string(mensaje, title);
			validator = regex_room.valida_fecha(cadena);
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

	public static fecha fend(fecha fini) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Give me the date of exit", "Date");
			if ((fechaaux.diferenciaFecha(fini) >= 2) && (fechaaux.mayorque(fini)) == 1) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, "You have to be in the hotel for a minimum of 2 days", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// fend

	public static fecha finispa(fecha fini, fecha fend) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Date for the start of the instance in the spa.", "Date");
			if (fechaaux.fechaEntre(fend, fini) == true) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null,
						"If you wont to go to the spa, you must go during your instance in the hotel.", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// finispa

	public static fecha fendspa(fecha fini, fecha fend, fecha finispa) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Date for the end of the instance in the spa.", "Date");
			if ((fechaaux.fechaEntre(fend, fini) == true) && (fechaaux.mayorque(finispa) != -1)) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null,
						"If you wont to go to the spa, you must go during your instance in the hotel.", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// finispa

	public static fecha finiup(fecha fend) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Give me the arribal date", "Date");
			if ((fechaaux.diferenciaFecha(fend) >= 2) && (fechaaux.mayorque(fend) == -1)) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null, "You have to be in the hotel for a minimum of 2 days", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// finiup

	public static fecha fecha_ini_up_class_spa(fecha fend, fecha finispa) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Give me the arribal date", "Date");
			if ((fechaaux.diferenciaFecha(fend) >= 2) && (fechaaux.mayorque(fend) == -1)
					&& (fechaaux.mayorque(finispa) != 1)) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null,
						"You have to be in the hotel for a minimum of 2 days.\nAnd you can't leve out the spa days. ",
						"Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// fecha_ini_up_spa

	public static fecha fecha_end_up_class_spa(fecha fini, fecha fendspa) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Give me the date of exit", "Date");
			if ((fechaaux.diferenciaFecha(fini) >= 2) && (fechaaux.mayorque(fini) == 1)
					&& (fechaaux.mayorque(fendspa) != 1)) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null,
						"You have to be in the hotel for a minimum of 2 days.\nAnd you can't leve out the spa days. ",
						"Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// fecha_end_up_spa

	public static fecha fecha_ini_spa_up(fecha fini, fecha fend, fecha fendspa) {
		fecha fechaaux = null;
		boolean interuptor = false;

		while (interuptor == false) {
			fechaaux = ask_dates_room.date("Date for the end of the instance in the spa.", "Date");
			if ((fechaaux.fechaEntre(fend, fini) == true) && (fechaaux.mayorque(fendspa) != 1)) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null,
						"If you wont to go to the spa, you must go during your instance in the hotel.\nAnd you need to respect the spa's exit day",
						"Result", JOptionPane.INFORMATION_MESSAGE);
			} // end if
		} // end while
		return fechaaux;
	}// fecha_ini_spa_up


}// class
