package miniframework_hotel.Modules.Users.Utils;

import javax.swing.JOptionPane;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Classes.User;
import miniframework_hotel.Modules.Users.Utils.utils_arays.find_user;
import miniframework_hotel.Utils.menus;
import miniframework_hotel.Utils.validators;

public class crud {

	public static User register(int type) {
		// 0 Admin, 1 Client, 2 VIP
		String username = "";
		String email = "";
		String password = "";
		String country = "";
		fecha fnacim = null;
		User useraux = null;
		int num_compras = 0;

		username = Singletone_users.username;
		email = ask_user.email();
		password = ask_user.password();

		switch (type) {
		case 0:
			useraux = new Admin(username, email, password);
			break;
		case 1:
			country = ask_user.country();
			fnacim = ask_dates_user.date("Give me your date of birth.", "Date of birth");
			useraux = new Client(username, email, password, country, fnacim);
			break;
		case 2:
			country = ask_user.country();
			fnacim = ask_dates_user.date("Give me your date of birth.", "Date of birth");
			num_compras = validators.valida_num_pos("Number of buys", "Buys");
			useraux = new VIP(username, email, password, country, fnacim, num_compras);
			break;

		default:
			break;
		}// swich
		return useraux;
	}// register

	public static void login() {
		int cont = 0;
		String username = "";
		String password = "";
		String passwordaux = "";
		boolean interuptor = false;
		boolean user = false;
		boolean pass = false;
		int usertype = 0;
		Admin adminaux = null;
		Client clientaux = null;
		VIP VIPaux = null;
		int index = 0;

		while ((interuptor == false) && (cont < 5)) {
			cont++;
			index = -1;
			usertype = -1;
			user = false;
			pass = false;
			username = ask_user.username();
			passwordaux = ask_user.password();
			password = password_encryption.md5(passwordaux);
			adminaux = new Admin(username);
			clientaux = new Client(username);
			VIPaux = new VIP(username);

			index = find_user.admin(adminaux);
			System.out.println("inex0:" + index);
			if (index != -1) {
				System.out.println("if user 0");
				usertype = 0;
				user = true;
			} else {
				index = find_user.client(clientaux);
				System.out.println("inex1:" + index);
				if (index != -1) {
					System.out.println("if user 1");
					usertype = 1;
					user = true;
				} else {
					index = find_user.vip(VIPaux);
					System.out.println("inex2:" + index);
					if (index != -1) {
						System.out.println("if user 2");
						usertype = 2;
						user = true;
					} // end if
				} // end else if
			} // end else if

			if (user == true) {
				switch (usertype) {
				case 0:
					if (Singletone_users.Admin.get(index).getPassword().equals(password)) {
						pass = true;
					} // end if
					break;
				case 1:
					if (Singletone_users.Client.get(index).getPassword().equals(password)) {
						pass = true;
					} // end if
					break;
				case 2:
					if (Singletone_users.VIP.get(index).getPassword().equals(password)) {
						pass = true;
					} // end if
					break;

				default:
					break;
				}// end swich
			} // end if

			if ((user == true) && (pass == true)) {
				interuptor = true;
			} else {
				interuptor = false;
				JOptionPane.showMessageDialog(null,
						"The username or the password are incorrect.\nNumber of attemps: " + cont + "/5", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			} // end else if

		} // while
		if (interuptor == true) {
			Singletone_users.actual_user_index = index;
			Singletone_users.actual_user_type = usertype;
		} else {
			JOptionPane.showMessageDialog(null, "You tried to login 5 times without successful.", "Result",
					JOptionPane.INFORMATION_MESSAGE);
		} // end else if

	}// login

	public static void logout() {
		Singletone_users.actual_user_index = -1;
		Singletone_users.actual_user_type = -1;
	}// logout

	public static User profile(User useraux) {
		// 0 Admin, 1 Client, 2 VIP
		int continuar = 0;
		String[] opcions0 = { "email", "password" };
		String[] opcions1 = { "email", "password", "country", "fnacim" };
		String[] opcions2 = { "email", "password", "country", "fnacim", "num_compras" };
		String option = "";
		int type = -1;

		if (useraux instanceof Admin) {
			type = 0;
		} else if (useraux instanceof Client) {
			type = 1;
		} else if (useraux instanceof VIP) {
			type = 2;
		} // end else if

		switch (type) {
		case 0: {

			do {
				option = menus.desplegable("Select", "¿What do you wont to change?", opcions0);
				switch (option) {
				case "email":
					((Admin) useraux).setEmail(ask_user.email());
					break;
				case "password":
					((Admin) useraux).setPassword(ask_user.password());
					break;

				default:
					break;
				}// end swich
				continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to change somthing else?");
			} while (JOptionPane.OK_OPTION == continuar);
		} // case 0
			break;
		case 1: {

			do {
				option = menus.desplegable("Select", "¿What do you wont to change?", opcions1);
				switch (option) {
				case "email":
					((Client) useraux).setEmail(ask_user.email());
					break;
				case "password":
					((Client) useraux).setPassword(ask_user.password());
					break;
				case "country":
					((Client) useraux).setCountry(ask_user.country());
					break;

				case "fnacim":
					((Client) useraux)
							.setFecha_nacimiento(ask_dates_user.date("Change your date of birth.", "Date of birth"));
					break;

				default:
					break;
				}// end swich
				continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to change somthing else?");
			} while (JOptionPane.OK_OPTION == continuar);

		} // Case 1
			break;
		case 2: {

			do {
				option = menus.desplegable("Select", "¿What do you wont to change?", opcions2);
				switch (option) {
				case "email":
					((VIP) useraux).setEmail(ask_user.email());
					break;
				case "password":
					((VIP) useraux).setPassword(ask_user.password());
					break;
				case "country":
					((VIP) useraux).setCountry(ask_user.country());
					break;

				case "fnacim":
					((VIP) useraux)
							.setFecha_nacimiento(ask_dates_user.date("Change your date of birth.", "Date of birth"));
					break;

				case "num_compras":
					((VIP) useraux).setNum_compras(
							validators.valida_num_pos("Change the name of parchuses", "Number of parchuses"));
					break;

				default:
					break;
				}// end swich
				continuar = JOptionPane.showConfirmDialog(null, "¿Do you wont to change somthing else?");
			} while (JOptionPane.OK_OPTION == continuar);

		} // case 2
			break;

		default:
			break;
		}// end swich
		return useraux;
	}// profile

}// class
