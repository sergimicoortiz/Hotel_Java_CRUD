package miniframework_hotel.Modules.room.Utils;

import javax.swing.JOptionPane;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Classes.room;
import miniframework_hotel.Utils.formater;
import miniframework_hotel.Utils.menus;

public class crud_room {
	public static room create(int type) {
		String id = "";
		String m2 = "";
		String capacity = "";
		boolean avalilable = false;
		boolean wifi = false;
		fecha fini = null;
		fecha fend = null;

		fecha finispa = null;
		fecha fendspa = null;
		boolean vistas = false;

		boolean excursion = false;
		boolean tv = false;

		boolean musica = false;
		boolean candles = false;

		room room1 = null;
		// 0 Single, 1 Doouble, 2 Suite
		// 0 wifi, 1 aval, 2 vistas, 3 excur, 4 tv, 5 mus, 6 velas

		id = Singletone.id;
		m2 = ask_room.m2("Give me the m2", "m2");
		capacity = ask_room.capacity("Give me the capacity", "Capacity");
		avalilable = ask_room.boolRoom(1);
		wifi = ask_room.boolRoom(0);
		fini = ask_dates_room.date("Give me the arribal date", "Date");
		fend = ask_dates_room.fend(fini);

		switch (type) {
		case 0:
			excursion = ask_room.boolRoom(3);
			tv = ask_room.boolRoom(4);

			room1 = new Single(id, m2, capacity, avalilable, wifi, fini, fend, excursion, tv);
			break;
		case 1:
			musica = ask_room.boolRoom(5);
			candles = ask_room.boolRoom(6);
			room1 = new Doouble(id, m2, capacity, avalilable, wifi, fini, fend, musica, candles);

			break;
		case 2:
			finispa = ask_dates_room.finispa(fini, fend);
			fendspa = ask_dates_room.fendspa(fini, fend, finispa);
			vistas = ask_room.boolRoom(2);
			room1 = new Suite(id, m2, capacity, avalilable, wifi, fini, fend, finispa, fendspa, vistas);

			break;
		default:
			break;
		}// swich

		return room1;
	}// create

	public static void see(room roomaux) {
		String cadena = "";
		cadena = roomaux.toString();
		System.out.println(cadena);
		JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
	}// see

	public static room delete(room room1) {
		room1 = null;
		return room1;
	}// delete

	public static room update(room roomaux) {
		// 0 Single, 1 Doouble, 2 Suite
		// 0 wifi, 1 aval, 2 vistas, 3 excur, 4 tv, 5 mus, 6 velas

		String[] opcions0 = { "id", "m2", "capacity", "avalible", "wifi", "fini", "fend", "excursion", "tv" };

		String[] opcions1 = { "id", "m2", "capacity", "avalible", "wifi", "fini", "fend", "musica", "candles" };

		String[] opcions2 = { "id", "m2", "capacity", "avalible", "wifi", "fini", "fend", "finispa", "fendspa",
				"vistas" };
//		String[] opcions0 = { "m2", "capacity", "avalible", "wifi", "fini", "fend", "excursion", "tv" };
//
//		String[] opcions1 = {  "m2", "capacity", "avalible", "wifi", "fini", "fend", "musica", "candles" };
//
//		String[] opcions2 = {  "m2", "capacity", "avalible", "wifi", "fini", "fend", "finispa", "fendspa",
//				"vistas" };

		int continuar = 0;
		int type = 0;
		String select = "";

		if (roomaux instanceof Single) {
			type = 0;
		} else if (roomaux instanceof Doouble) {
			type = 1;
		} else if (roomaux instanceof Suite) {
			type = 2;

		} else {
			type = -1;
		} // end if

		switch (type) {
		case 0: {
			do {
				System.out.println("Dentro del do while case 0");
				select = menus.desplegable("Single update", "Which attributu do you want to change", opcions0);

				switch (select) {
				case "id":
					((Single) roomaux).setId(ask_room.id_up("Give me an id", "Id", 0));
					break;

				case "m2":
					((Single) roomaux).setM2(ask_room.m2("Give me the m2", "m2"));
					break;

				case "capacity":
					((Single) roomaux).setCapacity(ask_room.capacity("Give me the capacity", "Capacity"));
					break;

				case "avalible":
					((Single) roomaux).setAvalible(ask_room.boolRoom(1));
					break;

				case "wifi":
					((Single) roomaux).setWifi(ask_room.boolRoom(0));
					break;

				case "fini":
					((Single) roomaux).setFini(ask_dates_room.finiup(roomaux.getFend()));
					break;

				case "fend":
					((Single) roomaux).setFend(ask_dates_room.fend(roomaux.getFini()));
					break;

				case "excursion":
					((Single) roomaux).setExcursion(ask_room.boolRoom(3));
					break;

				case "tv":
					((Single) roomaux).setTv(ask_room.boolRoom(4));
					break;
				default:
					break;
				}// swich
				continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to change somthing else?");
			} while (JOptionPane.OK_OPTION == continuar);
		} // case0

			break;

		case 1: {
			do {
				System.out.println("Dentro del do while case 1");
				select = menus.desplegable("Double update", "Which attributu do you want to change", opcions1);

				switch (select) {
				case "id":
					((Doouble) roomaux).setId(ask_room.id_up("Give me an id", "Id", 1));
					break;

				case "m2":
					((Doouble) roomaux).setM2(ask_room.m2("Give me the m2", "m2"));
					break;

				case "capacity":
					((Doouble) roomaux).setCapacity(ask_room.capacity("Give me the capacity", "Capacity"));
					break;

				case "avalible":
					((Doouble) roomaux).setAvalible(ask_room.boolRoom(1));
					break;

				case "wifi":
					((Doouble) roomaux).setWifi(ask_room.boolRoom(0));
					break;

				case "fini":
					((Doouble) roomaux).setFini(ask_dates_room.finiup(roomaux.getFend()));
					break;

				case "fend":
					((Doouble) roomaux).setFend(ask_dates_room.fend(roomaux.getFini()));
					break;

				case "musica":
					((Doouble) roomaux).setMusica(ask_room.boolRoom(5));
					break;

				case "candles":
					((Doouble) roomaux).setCandles(ask_room.boolRoom(6));
					break;
				default:
					break;
				}// swich
				continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to change somthing else?");
			} while (JOptionPane.OK_OPTION == continuar);
		} // case1
			break;

		case 2: {
			do {
				System.out.println("Dentro del do while case 2");
				select = menus.desplegable("Suite update", "Which attributu do you want to change", opcions2);

				switch (select) {
				case "id":
					((Suite) roomaux).setId(ask_room.id_up("Give me an id", "Id", 2));
					break;

				case "m2":
					((Suite) roomaux).setM2(ask_room.m2("Give me the m2", "m2"));
					break;

				case "capacity":
					((Suite) roomaux).setCapacity(ask_room.capacity("Give me the capacity", "Capacity"));
					break;

				case "avalible":
					((Suite) roomaux).setAvalible(ask_room.boolRoom(1));
					break;

				case "wifi":
					((Suite) roomaux).setWifi(ask_room.boolRoom(0));
					break;

				case "fini":
					((Suite) roomaux).setFini(
							ask_dates_room.fecha_ini_up_class_spa(roomaux.getFend(), ((Suite) roomaux).getFinispa()));
					break;

				case "fend":
					((Suite) roomaux).setFend(
							ask_dates_room.fecha_end_up_class_spa(roomaux.getFini(), ((Suite) roomaux).getFendspa()));
					break;

				case "finispa":
					((Suite) roomaux).setFinispa(ask_dates_room.fecha_ini_spa_up(roomaux.getFini(), roomaux.getFend(),
							((Suite) roomaux).getFendspa()));
					break;
				case "fendspa":
					((Suite) roomaux).setFendspa(ask_dates_room.fendspa(roomaux.getFini(), roomaux.getFend(),
							((Suite) roomaux).getFinispa()));
					break;
				case "vistas":
					((Suite) roomaux).setVistas(ask_room.boolRoom(2));
					break;
				default:
					break;
				}// swich
				continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to change somthing else?");
			} while (JOptionPane.OK_OPTION == continuar);
		} // case2
			break;

		default:
			System.out.println("Default type swich");
			break;
		}// swich

		return roomaux;
	}// update

	public static void see_atr(room roomaux) {
		String select = "";
		String cadena = "";
		int continuar = 0;

		String[] opcions0 = { "id", "m2", "capacity", "avalible", "wifi", "fini", "fend", "price", "discount",
				"excursion", "tv" };

		String[] opcions1 = { "id", "m2", "capacity", "avalible", "wifi", "fini", "fend", "price", "discount", "musica",
				"candles" };

		String[] opcions2 = { "id", "m2", "capacity", "avalible", "wifi", "fini", "fend", "price", "discount",
				"suplementspa", "finispa", "fendspa", "vistas" };

		do {
			System.out.println("Dentro del do while");

			if (roomaux instanceof Single) {
				select = menus.desplegable("Room Atributtes", "Which attribute do you want to see", opcions0);
			} else if (roomaux instanceof Doouble) {
				select = menus.desplegable("Room Atributtes", "Which attribute do you want to see", opcions1);
			} else if (roomaux instanceof Suite) {
				select = menus.desplegable("Room Atributtes", "Which attribute do you want to see", opcions2);

			} // end if

			switch (select) {
			case "id":
				cadena = cadena + ("The id is: " + roomaux.getId() + "\n");
				break;

			case "m2":
				cadena = cadena + ("The m2 is: " + roomaux.getM2() + "\n");
				break;

			case "capacity":
				cadena = cadena + ("The capacity is: " + roomaux.getCapacity() + "\n");
				break;

			case "avalible":
				cadena = cadena + ("The avalible is: " + roomaux.isAvalible() + "\n");
				break;

			case "wifi":
				cadena = cadena + ("The wifi is: " + roomaux.isWifi() + "\n");
				break;

			case "fini":
				cadena = cadena + ("The fini is: " + roomaux.getFini().toString() + "\n");
				break;

			case "fend":
				cadena = cadena + ("The fend is: " + roomaux.getFend().toString() + "\n");
				break;

			case "price":
				cadena = cadena + ("The price is: " + formater.euros(roomaux.getPrice()) + "\n");
				break;

			case "discount":
				cadena = cadena + ("The discount is: " + formater.percent(roomaux.getDiscount()) + "\n");
				break;
			case "excursion":
				cadena = cadena + ("The excursion is: " + ((Single) roomaux).isExcursion() + "\n");
				break;
			case "tv":
				cadena = cadena + ("The tv is: " + ((Single) roomaux).isTv() + "\n");
				break;
			case "musica":
				cadena = cadena + ("The musica is: " + ((Doouble) roomaux).isMusica() + "\n");
				break;
			case "candles":
				cadena = cadena + ("The candles is: " + ((Doouble) roomaux).isCandles() + "\n");
				break;
			case "suplementspa":
				cadena = cadena + ("The extraspa is: " + formater.euros(((Suite) roomaux).getSuplementspa()) + "\n");
				break;
			case "finispa":
				cadena = cadena + ("The finispa is: " + ((Suite) roomaux).getFinispa().toString() + "\n");
				break;
			case "fendspa":
				cadena = cadena + ("The fendspa is: " + ((Suite) roomaux).getFendspa().toString() + "\n");
				break;
			case "vistas":
				cadena = cadena + ("The views is: " + ((Suite) roomaux).isVistas() + "\n");
				break;
			default:
				break;
			}// swich
			continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to see another attribute?");
		} while (JOptionPane.OK_OPTION == continuar);

		if (cadena.equals("")) {
			cadena = "You need to select something.";
		} // end if
		System.out.println(cadena);
		JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
	}// see_atr
}// class
