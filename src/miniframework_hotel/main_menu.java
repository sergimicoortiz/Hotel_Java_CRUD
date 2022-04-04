package miniframework_hotel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Utils.crud;
import miniframework_hotel.Modules.Users.Utils.user_dummies;
import miniframework_hotel.Modules.Users.Utils.utils_arays.crud_singeltone.register;
import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Utils.menus;
import miniframework_hotel.Utils.rooms_users;
import miniframework_hotel.Modules.room.Utils.room_dummies;

//@SuppressWarnings("unused")
public class main_menu {

	public static void main(String[] args) {

		// 0 Single, 1 Doouble, 2 Suite
		// 0 Admin, 1 Client, 2 VIP

		String menu = "";
		String[] user_types = { "Client", "VIP" };
		int user_type_select = 0;
		String[] opcions_nouser = { "Register", "Login", "Exit" };
		String[] opcions_user = { "Rooms", "Profile", "Personal info", "Logout", "Exit" };
		Singletone.Single = new ArrayList<Single>();
		Singletone.Doouble = new ArrayList<Doouble>();
		Singletone.Suite = new ArrayList<Suite>();
		Singletone_users.Admin = new ArrayList<Admin>();
		Singletone_users.Client = new ArrayList<Client>();
		Singletone_users.VIP = new ArrayList<VIP>();
		user_dummies.dummiesV2(10);
		room_dummies.dummies();

		do {
			// System.out.println("Dentro del do while");

			if (Singletone_users.actual_user_index == -1) {
				menu = menus.desplegable("User", "What do you wont to do.", opcions_nouser);
			} else {
				menu = menus.desplegable("User", "What do you wont to do.", opcions_user);
			} // end else if

			switch (menu) {
			case "Register":
				user_type_select = menus.botons("Register", "Select a type of user.", user_types);
				if (user_type_select == 1) {
					register.vip();
				} else {
					register.client();
				} // end else if
				break;
			case "Login":
				crud.login();
				break;
			case "Profile":
				switch (Singletone_users.actual_user_type) {
				case 0:
					Singletone_users.Admin.set(Singletone_users.actual_user_index,
							(Admin) crud.profile(Singletone_users.Admin.get(Singletone_users.actual_user_index)));
					break;
				case 1:
					Singletone_users.Client.set(Singletone_users.actual_user_index,
							(Client) crud.profile(Singletone_users.Client.get(Singletone_users.actual_user_index)));
					break;
				case 2:
					Singletone_users.VIP.set(Singletone_users.actual_user_index,
							(VIP) crud.profile(Singletone_users.VIP.get(Singletone_users.actual_user_index)));
					break;

				}// end swich
				break;
			case "Logout":
				crud.logout();
				break;
			case "Personal info":
				switch (Singletone_users.actual_user_type) {
				case 0:
					JOptionPane.showMessageDialog(null,
							Singletone_users.Admin.get(Singletone_users.actual_user_index).toString(), "Result",
							JOptionPane.INFORMATION_MESSAGE);

					break;
				case 1:
					JOptionPane.showMessageDialog(null,
							Singletone_users.Client.get(Singletone_users.actual_user_index).toString(), "Result",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null,
							Singletone_users.VIP.get(Singletone_users.actual_user_index).toString(), "Result",
							JOptionPane.INFORMATION_MESSAGE);
					break;

				}// end swich
				break;
			case "Rooms":
				switch (Singletone_users.actual_user_type) {
				case 0:
					rooms_users.admin();
					break;
				case 1:
					rooms_users.client();
					break;
				case 2:
					rooms_users.vip();
					break;

				}// end swich
				break;

			default:
				System.out.println("Swich main default");
				System.exit(0);
				break;
			}// end swich

		} while (menu != "Exit");

	}// main

}// class
