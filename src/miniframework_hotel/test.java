package miniframework_hotel;

import javax.swing.JOptionPane;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Modules.Users.Classes.Admin;
import miniframework_hotel.Modules.Users.Classes.Client;
import miniframework_hotel.Modules.Users.Classes.VIP;
import miniframework_hotel.Modules.Users.Classes.User;
import miniframework_hotel.Modules.Users.Utils.crud;
import miniframework_hotel.Modules.Users.Utils.password_encryption;
import miniframework_hotel.Modules.Users.Utils.regex_user;
import miniframework_hotel.Modules.Users.Utils.user_dummies;
import miniframework_hotel.Modules.Users.Utils.utils_arays.crud_singeltone.read;
import miniframework_hotel.Modules.Users.Utils.utils_arays.crud_singeltone.register;
import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.Users.Classes.Singletone_users;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Utils.room_dummies;
import miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone.read_singletone;
import miniframework_hotel.Utils.menus;
import miniframework_hotel.Utils.random;
import miniframework_hotel.Utils.validators;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.security.MessageDigest;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class test {

	public static void main(String[] args) {

		Singletone.Single = new ArrayList<Single>();
		Singletone.Doouble = new ArrayList<Doouble>();
		Singletone.Suite = new ArrayList<Suite>();
		Singletone_users.Admin = new ArrayList<Admin>();
		Singletone_users.Client = new ArrayList<Client>();
		Singletone_users.VIP = new ArrayList<VIP>();
//		user_dummies.dummies();
//		room_dummies.dummies();

//		user_dummies.dummiesV2(1000);
//		for (int i = 0; i < Singletone_users.Client.size(); i++) {
//			System.out.println(Singletone_users.Admin.get(i).toString());
//			System.out.println(Singletone_users.Client.get(i).toString());
//			System.out.println(Singletone_users.VIP.get(i).toString());
//		} // end for

		fecha fentrada = random.fecha();
		long entradams = fentrada.calendario().getTimeInMillis();
		long dias = random.integrer(3, 30);
		long msdias = dias * 86400000;
		long total = entradams + msdias;

		Date currentDate = new Date(total);

		// printing value of Date
		// System.out.println("current Date: " + currentDate);

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		fecha fsalida = new fecha(df.format(currentDate));

		System.out.println(fentrada.toString());
		System.out.println(fsalida.toString());

		boolean inttest = false;

		switch (random.integrer(0, 1)) {
		case 0:
			inttest = false;
			break;
		case 1:
			inttest = true;
			break;

		}// swich
		System.out.println(inttest);

	}// class

}// main
