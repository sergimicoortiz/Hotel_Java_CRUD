package miniframework_hotel.Modules.Users.Utils.utils_arays.crud_singeltone;

import miniframework_hotel.Modules.Users.Utils.crud;
import miniframework_hotel.Modules.Users.Utils.utils_arays.ask_id;
import miniframework_hotel.Modules.Users.Utils.utils_arays.find_user;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Classes.VIP;

public class profile {

	public static void admin() {
		Admin adminaux = ask_id.adminID();
		int index = find_user.admin(adminaux);
		String error = "The user don't exist.";

		if (index != -1) {
			Singletone_users.Admin.set(index, (Admin) crud.profile(Singletone_users.Admin.get(index)));
		} else {
			JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if

	}// admin

	public static void client() {
		Client clientaux = ask_id.clientID();
		int index = find_user.client(clientaux);
		String error = "The user don't exist.";

		if (index != -1) {
			Singletone_users.Client.set(index, (Client) crud.profile(Singletone_users.Client.get(index)));
		} else {
			JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if

	}// client

	public static void vip() {
		VIP vipaux = ask_id.VIP_ID();
		int index = find_user.vip(vipaux);
		String error = "The user don't exist.";

		if (index != -1) {
			Singletone_users.VIP.set(index, (VIP) crud.profile(Singletone_users.VIP.get(index)));
		} else {
			JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if

	}// vip

}// class
