package miniframework_hotel.Modules.Users.Utils.utils_arays;

import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Utils.ask_user;

public class ask_id {

	public static Admin adminID() {
		Singletone_users.username = ask_user.username();
		Admin adminaux = new Admin(Singletone_users.username);
		return adminaux;
	}// adminID

	public static Client clientID() {
		Singletone_users.username = ask_user.username();
		Client clientaux = new Client(Singletone_users.username);
		return clientaux;
	}// clientID

	public static VIP VIP_ID() {
		Singletone_users.username = ask_user.username();
		VIP VIPaux = new VIP(Singletone_users.username);
		return VIPaux;
	}// employeeID

}// class
