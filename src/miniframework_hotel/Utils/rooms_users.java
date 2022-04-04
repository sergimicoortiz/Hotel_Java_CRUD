package miniframework_hotel.Utils;

import miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone.create_singletone;
import miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone.delete_singletone;
import miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone.read_singletone;
import miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone.update_singletone;

public class rooms_users {

	public static void admin() {
		String[] type = { "Singel", "Double", "Suite", "Exit" };
		String[] actions = { "Create", "Delete", "Read", "Update", "Exit" };
		String[] read = { "One", "All", "Attribute", "List IDs", "Exit" };
		String menu = "";
		String select = "";
		String selectread = "";

		do {
			menu = menus.desplegable("Rooms", "Select a room type", type);

			switch (menu) {
			case "Singel": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {
				case "Create":
					create_singletone.single();
					break;
				case "Delete":
					delete_singletone.single();
					break;
				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_single();
						break;
					case "All":
						read_singletone.r_all_single();
						break;
					case "Attribute":
						read_singletone.r_atr_single();
						break;
					case "List IDs":
						read_singletone.r_id_single();
						break;

					default:
						break;
					}// swich read
					break;
				case "Update":
					update_singletone.single();
					break;

				default:
					break;
				}// swich
			} // singel
				break;
			case "Double": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {
				case "Create":
					create_singletone.doouble();
					break;
				case "Delete":
					delete_singletone.doouble();
					break;
				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_doouble();
						break;
					case "All":
						read_singletone.r_all_doouble();
						break;
					case "Attribute":
						read_singletone.r_atr_doouble();
						break;
					case "List IDs":
						read_singletone.r_id_doouble();
						break;

					default:
						break;
					}// swich read
					break;
				case "Update":
					update_singletone.doouble();
					break;

				default:
					break;
				}// swich
			} // doouble

				break;
			case "Suite": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {
				case "Create":
					create_singletone.suite();
					break;
				case "Delete":
					delete_singletone.suite();
					break;
				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_suite();
						break;
					case "All":
						read_singletone.r_all_suite();
						break;
					case "Attribute":
						read_singletone.r_atr_suite();
						break;
					case "List IDs":
						read_singletone.r_id_suite();
						break;

					default:
						break;
					}// swich read
					break;
				case "Update":
					update_singletone.suite();
					break;

				default:
					break;
				}// swich
			} // suite

				break;

			default:
				menu = "Exit";
				break;
			}// swich
		} while (menu != "Exit");
	}// admin

	public static void client() {
		String[] type = { "Singel", "Double", "Suite", "Exit" };
		String[] actions = { "Read", "Exit" };
		String[] read = { "One", "All", "Attribute", "List IDs", "Exit" };
		String menu = "";
		String select = "";
		String selectread = "";

		do {
			menu = menus.desplegable("Rooms", "Select a room type", type);

			switch (menu) {
			case "Singel": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {
				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_single();
						break;
					case "All":
						read_singletone.r_all_single();
						break;
					case "Attribute":
						read_singletone.r_atr_single();
						break;
					case "List IDs":
						read_singletone.r_id_single();
						break;

					default:
						break;
					}// swich read
					break;

				default:
					break;
				}// swich
			} // singel
				break;
			case "Double": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {

				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_doouble();
						break;
					case "All":
						read_singletone.r_all_doouble();
						break;
					case "Attribute":
						read_singletone.r_atr_doouble();
						break;
					case "List IDs":
						read_singletone.r_id_doouble();
						break;

					default:
						break;
					}// swich read
					break;

				default:
					break;
				}// swich
			} // doouble

				break;
			case "Suite": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {

				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_suite();
						break;
					case "All":
						read_singletone.r_all_suite();
						break;
					case "Attribute":
						read_singletone.r_atr_suite();
						break;
					case "List IDs":
						read_singletone.r_id_suite();
						break;

					default:
						break;
					}// swich read
					break;

				default:
					break;
				}// swich
			} // suite

				break;

			default:
				menu = "Exit";
				break;
			}// swich
		} while (menu != "Exit");
	}// client

	public static void vip() {
		String[] type = { "Singel", "Double", "Suite", "Exit" };
		String[] actions = { "Read", "Update", "Exit" };
		String[] read = { "One", "All", "Attribute", "List IDs", "Exit" };
		String menu = "";
		String select = "";
		String selectread = "";

		do {
			menu = menus.desplegable("Rooms", "Select a room type", type);

			switch (menu) {
			case "Singel": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {

				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_single();
						break;
					case "All":
						read_singletone.r_all_single();
						break;
					case "Attribute":
						read_singletone.r_atr_single();
						break;
					case "List IDs":
						read_singletone.r_id_single();
						break;

					default:
						break;
					}// swich read
					break;
				case "Update":
					update_singletone.single();
					break;

				default:
					break;
				}// swich
			} // singel
				break;
			case "Double": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {

				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_doouble();
						break;
					case "All":
						read_singletone.r_all_doouble();
						break;
					case "Attribute":
						read_singletone.r_atr_doouble();
						break;
					case "List IDs":
						read_singletone.r_id_doouble();
						break;

					default:
						break;
					}// swich read
					break;
				case "Update":
					update_singletone.doouble();
					break;

				default:
					break;
				}// swich
			} // doouble

				break;
			case "Suite": {
				select = menus.desplegable("Chose", "Select an option:", actions);

				switch (select) {

				case "Read":
					selectread = menus.desplegable("Chose", "Select an option:", read);
					switch (selectread) {
					case "One":
						read_singletone.r_one_suite();
						break;
					case "All":
						read_singletone.r_all_suite();
						break;
					case "Attribute":
						read_singletone.r_atr_suite();
						break;
					case "List IDs":
						read_singletone.r_id_suite();
						break;

					default:
						break;
					}// swich read
					break;
				case "Update":
					update_singletone.suite();
					break;

				default:
					break;
				}// swich
			} // suite

				break;

			default:
				menu = "Exit";
				break;
			}// swich
		} while (menu != "Exit");
	}// vip

}// class
