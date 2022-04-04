package miniframework_hotel.Modules.room.Utils;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Modules.room.Classes.*;

public class room_dummies {

	public static void dummies() {

		Single singleaux = null;
		Doouble dooubleaux = null;
		Suite suiteaux = null;

		/**
		 * Singel data
		 */

		String[] id_singel = { "S-0001", "S-0002", "S-0003", "S-0004", "S-0005", "S-0006", "S-0007", "S-0008", "S-0009",
				"S-0010" };
		String[] m2_singel = { "12", "21", "33", "23", "11", "54", "23", "33", "12", "22" };
		String capacity_singel = "1";

		boolean avalible_singel = true;

		boolean wifi_singel = false;

		fecha[] fini_singel = { new fecha("1-1-2020"), new fecha("1-2-2020"), new fecha("1-3-2020"),
				new fecha("1-4-2020"), new fecha("1-5-2020"), new fecha("1-6-2020"), new fecha("1-7-2020"),
				new fecha("1-8-2020"), new fecha("1-9-2020"), new fecha("1-10-2020") };

		fecha[] fend_singel = { new fecha("10-1-2020"), new fecha("10-2-2020"), new fecha("10-3-2020"),
				new fecha("10-4-2020"), new fecha("10-5-2020"), new fecha("10-6-2020"), new fecha("10-7-2020"),
				new fecha("10-8-2020"), new fecha("10-9-2020"), new fecha("10-10-2020") };

		boolean excursions_singel = true;

		boolean tv_singel = true;

		/**
		 * Doouble data
		 */

		String[] id_doouble = { "D-0001", "D-0002", "D-0003", "D-0004", "D-0005", "D-0006", "D-0007", "D-0008",
				"D-0009", "D-0010" };
		String[] m2_doouble = { "12", "21", "33", "23", "11", "54", "23", "33", "12", "22" };
		String capacity_doouble = "2";

		boolean avalible_doouble = true;

		boolean wifi_doouble = true;

		fecha[] fini_doouble = { new fecha("1-1-2020"), new fecha("1-2-2020"), new fecha("1-3-2020"),
				new fecha("1-4-2020"), new fecha("1-5-2020"), new fecha("1-6-2020"), new fecha("1-7-2020"),
				new fecha("1-8-2020"), new fecha("1-9-2020"), new fecha("1-10-2020") };

		fecha[] fend_doouble = { new fecha("10-1-2020"), new fecha("10-2-2020"), new fecha("10-3-2020"),
				new fecha("10-4-2020"), new fecha("10-5-2020"), new fecha("10-6-2020"), new fecha("10-7-2020"),
				new fecha("10-8-2020"), new fecha("10-9-2020"), new fecha("10-10-2020") };

		boolean musica_doouble = true;

		boolean candles_doouble = true;

		/**
		 * Suite data
		 */

		String[] id_suite = { "V-0001", "V-0002", "V-0003", "V-0004", "V-0005", "V-0006", "V-0007", "V-0008", "V-0009",
				"V-0010" };
		String[] m2_suite = { "121", "211", "100", "123", "11", "88", "86", "99", "120", "220" };
		String capacity_suite = "4";

		boolean avalible_suite = true;

		boolean wifi_suite = true;

		fecha[] fini_suite = { new fecha("1-1-2020"), new fecha("1-2-2020"), new fecha("1-3-2020"),
				new fecha("1-4-2020"), new fecha("1-5-2020"), new fecha("1-6-2020"), new fecha("1-7-2020"),
				new fecha("1-8-2020"), new fecha("1-9-2020"), new fecha("1-10-2020") };

		fecha[] fend_suite = { new fecha("10-1-2020"), new fecha("10-2-2020"), new fecha("10-3-2020"),
				new fecha("10-4-2020"), new fecha("10-5-2020"), new fecha("10-6-2020"), new fecha("10-7-2020"),
				new fecha("10-8-2020"), new fecha("10-9-2020"), new fecha("10-10-2020") };

		boolean vistas_suite = false;

		for (int i = 0; i < 10; i++) {
			singleaux = new Single(id_singel[i], m2_singel[i], capacity_singel, avalible_singel, wifi_singel,
					fini_singel[i], fend_singel[i], excursions_singel, tv_singel);

			Singletone.Single.add(singleaux);
		} // end for singels

		for (int i = 0; i < 10; i++) {
			dooubleaux = new Doouble(id_doouble[i], m2_doouble[i], capacity_doouble, avalible_doouble, wifi_doouble,
					fini_doouble[i], fend_doouble[i], musica_doouble, candles_doouble);

			Singletone.Doouble.add(dooubleaux);
		} // end for doouble

		for (int i = 0; i < 10; i++) {
			suiteaux = new Suite(id_suite[i], m2_suite[i], capacity_suite, avalible_suite, wifi_suite, fini_suite[i],
					fend_suite[i], fini_suite[i], fend_suite[i], vistas_suite);

			Singletone.Suite.add(suiteaux);
		} // end for suite

	}// dummies
	

}// class