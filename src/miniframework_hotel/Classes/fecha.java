package miniframework_hotel.Classes;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.sound.midi.spi.SoundbankReader;

@SuppressWarnings("unused")
public class fecha {
	private int	day;
	private int	month;
	private int	year;

	public fecha(String fecha) {
		String[] fecha_split = new String[3];
		fecha_split = fecha.split("-");
		this.day = Integer.parseInt(fecha_split[0]);
		this.month = Integer.parseInt(fecha_split[1]);
		this.year = Integer.parseInt(fecha_split[2]);
	}

	public Calendar calendario() {
		Calendar calendario = new GregorianCalendar(this.year, (this.month - 1), this.day);
		return calendario;
	}// Calendar

	public boolean valida_month() {

		if ((this.month >= 1) && (this.month <= 12)) {
			return true;
		} else {
			return false;
		} // end if
	}// valida_month

	public boolean valida_year() {

		if ((this.year >= 1800) && (this.year <= 2200)) {
			return true;
		} else {
			return false;
		} // end if

	}// valida_year

	public boolean valida_day() {
		int[] dies = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		GregorianCalendar calendariaux = new GregorianCalendar();
		if (calendariaux.isLeapYear(this.year)) {
			dies[2] = 29;
		} // end if

		if (this.valida_month() == true) {
			if (this.day <= dies[this.month]) {
				return true;
			} else {
				return false;
			} // end if
		} else {
			return false;
		} // end if

	}// valida_day

	public boolean valida_fecha() {
		boolean d = this.valida_day();
		boolean m = this.valida_month();
		boolean y = this.valida_year();

		if ((d == true) && (m == true) && (y == true)) {
			return true;
		} else {
			return false;
		} // end if
	}// valida_fecha

	public int mayorque(fecha fechamen) {
		long fmay = this.calendario().getTimeInMillis();
		long fmen = fechamen.calendario().getTimeInMillis();
//		System.out.println("fmay: " + fmay);
//		System.out.println("femn: " + fmen);
		if (fmay > fmen) {
			return 1;
		} else if (fmay == fmen) {
			return 0;
		} else {
			return -1;
		} // end else if

	}// mayorque

	public int diferenciaFecha(fecha fechamen) { // En dias
		int diasdif = 0;
		if (this.mayorque(fechamen) == -1) {
			long dif = fechamen.calendario().getTimeInMillis() - this.calendario().getTimeInMillis();
			diasdif = (int) (dif / 86400000);
			System.out.println(
					"El orden de las fechas a sido combiado para que el resulatado sea positivo.\nPuede que este resultado sea un error");
		} else if (this.mayorque(fechamen) == 0) {
			diasdif = 0;
		} else if (this.mayorque(fechamen) == 1) {
			long dif = this.calendario().getTimeInMillis() - fechamen.calendario().getTimeInMillis();
			diasdif = (int) (dif / 86400000);

		} // end else if
		return diasdif;
	}// diferenciaFecha

	public boolean fechaEntre(fecha fechamay, fecha fechamen) {
		long fmay = fechamay.calendario().getTimeInMillis();
		long fmen = fechamen.calendario().getTimeInMillis();
		long thisf = this.calendario().getTimeInMillis();
//		System.out.println("fmay: " + fmay);
//		System.out.println("femn: " + fmen);
//		System.out.println("thisf: " + thisf);

		if ((thisf >= fmen) && (thisf <= fmay)) {
			return true;
		} else {
			return false;
		} // end else if
	}// fechaEntre

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = day + "-" + month + "-" + year;
		return cadena;
	}

}// class
