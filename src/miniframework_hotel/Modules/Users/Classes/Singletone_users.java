package miniframework_hotel.Modules.Users.Classes;

import java.util.ArrayList;

public class Singletone_users {
	public static ArrayList<Admin>	Admin;
	public static ArrayList<VIP>	VIP;
	public static ArrayList<Client>	Client;
	public static String			username;
	public static int				actual_user_index	= -1;
	public static int				actual_user_type	= -1;	// 0 Admin, 1 Client, 2 VIP, -1 No User
}
