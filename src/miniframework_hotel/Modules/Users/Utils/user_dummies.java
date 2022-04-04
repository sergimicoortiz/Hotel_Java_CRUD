package miniframework_hotel.Modules.Users.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Utils.utils_arays.find_user;
import miniframework_hotel.Utils.random;

public class user_dummies {

	public static void dummies() {

		Admin adminaux = null;
		Client clientaux = null;
		VIP vipaux = null;

		/**
		 * Admin data
		 */

		String[] usernames_admin = { "pepe", "juan", "pere22", "antonio44", "ferran_33", "test1", "test2",
				"jaun_antonio_tomas", "xd", "diez" };
		String[] password_admin = { "1234", "sfhgh", "34ghq354", "32g", "erg4", "sdg34", "43t6", "34t", "35hhh",
				"__sd__" };
		String[] email_admin = { "pepe@gmail.com", "juan@gmail.com", "pere@gmail.com", "antonio@gmail.com",
				"ferran@gmail.com", "test1@gmail.com", "test2@gmail.com", "juanantomio@gmail.com", "xd@gmail.com",
				"diez@gmail.com" };

		/**
		 * Client data
		 */
		String[] usernames_client = { "pepe2", "juan2", "pere22_2", "antonio44_2", "ferran_33_2", "test1_2", "test2_2",
				"jaun_antonio_tomas2", "xd2", "diez2" };
		String[] password_client = { "1wert234", "stttfhgh", "34tttghq354", "3t2g", "etrg4", "sdttg34", "43tt6", "3t4t",
				"3t5hhh", "__sd__" };
		String[] email_client = { "pepe@gmail.com", "juan@gmail.com", "pere@gmail.com", "antonio@gmail.com",
				"ferran@gmail.com", "test1@gmail.com", "test2@gmail.com", "juanantomio@gmail.com", "xd@gmail.com",
				"diez@gmail.com" };
		String country_client = "Spain";

		fecha[] fecha_client = { new fecha("1-1-2000"), new fecha("12-2-2001"), new fecha("22-7-1999"),
				new fecha("22-8-1999"), new fecha("2-7-1999"), new fecha("12-7-1999"), new fecha("12-4-1999"),
				new fecha("22-7-1999"), new fecha("11-7-1999"), new fecha("1-7-1999") };

		/**
		 * VIP data
		 */

		String[] usernames_vip = { "pepe22", "juan22", "pere22_22", "antonio44_22", "ferran_33_22", "test1_22",
				"test2_22", "jaun_antonio_tomas22", "xd22", "diez22" };
		String[] password_vip = { "12342", "sfewrhgh", "3wer4ghq354", "3erw2g", "ererwg4", "sedg34", "4erw3t6",
				"3erw4t", "35hhh", "__wsd__" };
		String[] email_vip = { "pepe1@gmail.com", "juan1@gmail.com", "pere1@gmail.com", "antonio1@gmail.com",
				"ferran1@gmail.com", "test11@gmail.com", "test12@gmail.com", "juana1ntomio@gmail.com", "1xd@gmail.com",
				"di1ez@gmail.com" };
		String country_vip = "Andorra";

		fecha[] fecha_vip = { new fecha("1-1-2000"), new fecha("12-2-2001"), new fecha("22-7-1999"),
				new fecha("22-8-1999"), new fecha("2-7-1999"), new fecha("12-7-1999"), new fecha("12-4-1999"),
				new fecha("22-7-1999"), new fecha("11-7-1999"), new fecha("1-7-1999") };

		int[] compra_vip = { 12, 2, 34, 42, 32, 4, 34, 23, 43, 23 };

		/**
		 * dummies creation
		 */

		for (int i = 0; i < 10; i++) {
			adminaux = new Admin(usernames_admin[i], email_admin[i], password_admin[i]);
			Singletone_users.Admin.add(adminaux);
		} // end for admin

		for (int i = 0; i < 10; i++) {

			clientaux = new Client(usernames_client[i], email_client[i], password_client[i], country_client,
					fecha_client[i]);
			Singletone_users.Client.add(clientaux);

		} // end for Client

		for (int i = 0; i < 10; i++) {

			vipaux = new VIP(usernames_vip[i], email_vip[i], password_vip[i], country_vip, fecha_vip[i], compra_vip[i]);
			Singletone_users.VIP.add(vipaux);

		} // end for VIP

	}// dummies

	public static void dummiesV2(int size) {
		int index = 0;
		boolean interuptor = false;
		Admin adminaux = null;
		Client clientaux = null;
		VIP vipaux = null;
		String usernameaux = "";
		String email = "";

		File userfile = new File("./names.txt");

		ArrayList<String> usernames = new ArrayList<String>();
		try {
			Scanner userscan = new Scanner(userfile);
			while (userscan.hasNextLine()) {
				String data = userscan.nextLine();
				usernames.add(data);
			} // end while
			userscan.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} // end try cath

		String country_client = "Spain";
		String country_vip = "Andorra";

		int min = 0;
		int max = usernames.size() - 1;

		for (int i = 0; i < size; i++) {

			// ADMIN
			interuptor = false;

			while (interuptor == false) {
				usernameaux = usernames.get(random.integrer(min, max));
				adminaux = new Admin(usernameaux);
				index = find_user.admin(adminaux);
				if (index == -1) {
					interuptor = true;
				} // end if
			} // end while

			email = usernameaux + "@gmail.com";
			adminaux = new Admin(usernameaux, email, usernameaux);
			Singletone_users.Admin.add(adminaux);
			System.out.println("User: " + usernameaux + " added as an Admin");

			// CLIENT
			interuptor = false;

			while (interuptor == false) {
				usernameaux = usernames.get(random.integrer(min, max));
				clientaux = new Client(usernameaux);
				index = find_user.client(clientaux);
				if (index == -1) {
					interuptor = true;
				} // end if
			} // end while

			email = usernameaux + "@gmail.com";
			clientaux = new Client(usernameaux, email, usernameaux, country_client, random.fecha());
			Singletone_users.Client.add(clientaux);
			System.out.println("User: " + usernameaux + " added as a Client");

			// VIP
			interuptor = false;

			while (interuptor == false) {
				usernameaux = usernames.get(random.integrer(min, max));
				vipaux = new VIP(usernameaux);
				index = find_user.vip(vipaux);
				if (index == -1) {
					interuptor = true;
				} // end if
			} // end while

			email = usernameaux + "@gmail.com";
			vipaux = new VIP(usernameaux, email, usernameaux, country_vip, random.fecha(), random.integrer(10, 100));
			Singletone_users.VIP.add(vipaux);
			System.out.println("User: " + usernameaux + " added as a VIP");

		} // end for
		System.out.println("The password is the same as the username");

	}// end summiesV2

}// class
