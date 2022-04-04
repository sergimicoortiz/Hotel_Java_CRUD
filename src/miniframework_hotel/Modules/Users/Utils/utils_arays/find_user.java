package miniframework_hotel.Modules.Users.Utils.utils_arays;

import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;

public class find_user {

	public static int admin(Admin adminaux) {
		int index = -1;
		for (int i = 0; i < (Singletone_users.Admin.size()); i++) {
		//	System.out.println("for: " + i);
			if ((Singletone_users.Admin.get(i).getUsername()).equals(adminaux.getUsername())) {
			//	System.out.println("if num: " + i);
				index = i;
			} // end if
		} // end for
		return index;
	}// admin

	public static int client(Client clientaux) {
		int index = -1;
		for (int i = 0; i < (Singletone_users.Client.size()); i++) {
		//	System.out.println("for: " + i);
			if ((Singletone_users.Client.get(i).getUsername()).equals(clientaux.getUsername())) {
			//	System.out.println("if num: " + i);
				index = i;
			} // end if
		} // end for
		return index;
	}// client

	public static int vip(VIP VIPaux) {
		int index = -1;
		for (int i = 0; i < (Singletone_users.VIP.size()); i++) {
		//	System.out.println("for: " + i);
			if ((Singletone_users.VIP.get(i).getUsername()).equals(VIPaux.getUsername())) {
				//System.out.println("if num: " + i);
				index = i;
			} // end if
		} // end for
		return index;
	}// client

}// class
