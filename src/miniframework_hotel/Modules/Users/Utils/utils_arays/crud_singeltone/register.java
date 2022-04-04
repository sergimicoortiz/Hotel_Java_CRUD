package miniframework_hotel.Modules.Users.Utils.utils_arays.crud_singeltone;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Utils.crud;
import miniframework_hotel.Modules.Users.Utils.utils_arays.ask_id;
import miniframework_hotel.Modules.Users.Utils.utils_arays.find_user;

@SuppressWarnings("unused")
public class register {

//	public static void admin() {
//		String msg = "The user alredy exist";
//		Admin adminaux = ask_id.adminID();
//		int index = find_user.admin(adminaux);
//		if (index == -1) {
//			Singletone.Admin.add((Admin) crud.register(0));
//			System.out.println("Admin added to the array");
//		} else {
//			System.out.println(msg);
//			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
//		} // end if
//	}// admin

	public static void client() {
		String msg = "The user alredy exist";
		Client clientaux = ask_id.clientID();
		int index = find_user.client(clientaux);
		if (index == -1) {
			Singletone_users.Client.add((Client) crud.register(1));
			System.out.println("Client added to the array");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// client

	public static void vip() {
		String msg = "The user alredy exist";
		VIP employeeaux = ask_id.VIP_ID();
		int index = find_user.vip(employeeaux);
		if (index == -1) {
			Singletone_users.VIP.add((VIP) crud.register(2));
			System.out.println("VIP added to the array");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// employee

}// class
