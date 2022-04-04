package miniframework_hotel.Modules.Users.Utils.utils_arays.crud_singeltone;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Utils.utils_arays.ask_id;
import miniframework_hotel.Modules.Users.Utils.utils_arays.find_user;

public class read {

	public static void admin() {
		Admin adminaux = ask_id.adminID();
		int index = find_user.admin(adminaux);
		String error = "The user don't exist";

		if (index != -1) {
			System.out.println(Singletone_users.Admin.get(index).toString());
			JOptionPane.showMessageDialog(null, Singletone_users.Admin.get(index).toString(), "Result",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end e3lse if

	}// admin

	public static void client() {
		Client clientaux = ask_id.clientID();
		int index = find_user.client(clientaux);
		String error = "The user don't exist";

		if (index != -1) {
			System.out.println(Singletone_users.Client.get(index).toString());
			JOptionPane.showMessageDialog(null, Singletone_users.Client.get(index).toString(), "Result",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end e3lse if

	}// client

	public static void VIP() {
		VIP VIPaux = ask_id.VIP_ID();
		int index = find_user.vip(VIPaux);
		String error = "The user don't exist";

		if (index != -1) {
			System.out.println(Singletone_users.VIP.get(index).toString());
			JOptionPane.showMessageDialog(null, Singletone_users.VIP.get(index).toString(), "Result",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, error, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end e3lse if

	}// employee

}// class
