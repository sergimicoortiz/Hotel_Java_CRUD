package miniframework_hotel.Utils;

import miniframework_hotel.Classes.fecha;

public class random {

	public static int integrer(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}// integrer

	public static fecha fecha() {
		int min_dya_mes = 1;
		int max_dia = 28;
		int max_mes = 12;
		int min_any = 1990;
		int max_any = 2030;

		int random_dia = random.integrer(min_dya_mes, max_dia);
		int random_mes = random.integrer(min_dya_mes, max_mes);
		int random_any = random.integrer(min_any, max_any);

		fecha fechaaux = new fecha("1-1-2020");
		fechaaux.setDay(random_dia);
		fechaaux.setMonth(random_mes);
		fechaaux.setYear(random_any);
		
		return fechaaux;
	}// fecha

}// class