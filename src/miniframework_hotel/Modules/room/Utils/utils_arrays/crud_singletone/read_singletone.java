package miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Utils.crud_room;
import miniframework_hotel.Modules.room.Utils.utils_arrays.ask_id;
import miniframework_hotel.Modules.room.Utils.utils_arrays.find_room;

public class read_singletone {
	/**
	 * toString one room
	 */

	public static void r_one_single() {
		String msg = "The single don't exist.";
		Single singleaux = ask_id.singleID();
		int index = find_room.single(singleaux);
		if (index != -1) {
			crud_room.see(Singletone.Single.get(index));
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// r_one_single

	public static void r_one_doouble() {
		String msg = "The doouble don't exist.";
		Doouble dooubleaux = ask_id.dooubleID();
		int index = find_room.doouble(dooubleaux);
		if (index != -1) {
			crud_room.see(Singletone.Doouble.get(index));
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// r_one_doouble

	public static void r_one_suite() {
		String msg = "The suite don't exist.";
		Suite suiteaux = ask_id.suiteID();
		int index = find_room.suite(suiteaux);
		if (index != -1) {
			crud_room.see(Singletone.Suite.get(index));
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// r_one_suite

	/**
	 * toString All
	 */

	public static void r_all_single() {
		String msg = "The array is empty";
		String cadena = "";
		if (Singletone.Single.size() != 0) {
			for (int i = 0; i < Singletone.Single.size(); i++) {
				cadena = cadena + (Singletone.Single.get(i).toString() + "\n\n");
			} // end for
			JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end else if
	}// r_all_single

	public static void r_all_doouble() {
		String msg = "The array is empty";
		String cadena = "";
		if (Singletone.Doouble.size() != 0) {
			for (int i = 0; i < Singletone.Doouble.size(); i++) {
				cadena = cadena + (Singletone.Doouble.get(i).toString() + "\n\n");
			} // end for
			JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end else if
	}// r_all_doouble

	public static void r_all_suite() {
		String msg = "The array is empty";
		String cadena = "";
		if (Singletone.Suite.size() != 0) {
			for (int i = 0; i < Singletone.Suite.size(); i++) {
				cadena = cadena + (Singletone.Suite.get(i).toString() + "\n\n");
			} // end for
			JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end else if
	}// r_all_suite

	/**
	 * Attributes
	 */

	public static void r_atr_single() {
		String msg = "The single don't exist.";
		Single singleaux = ask_id.singleID();
		int index = find_room.single(singleaux);
		if (index != -1) {
			crud_room.see_atr(Singletone.Single.get(index));
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// r_atr_single

	public static void r_atr_doouble() {
		String msg = "The doouble don't exist.";
		Doouble dooubleaux = ask_id.dooubleID();
		int index = find_room.doouble(dooubleaux);
		if (index != -1) {
			crud_room.see_atr(Singletone.Doouble.get(index));
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// r_atr_doouble

	public static void r_atr_suite() {
		String msg = "The suite don't exist.";
		Suite suiteaux = ask_id.suiteID();
		int index = find_room.suite(suiteaux);
		if (index != -1) {
			crud_room.see_atr(Singletone.Suite.get(index));
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// r_atr_suite

	/**
	 * List all ids
	 */

	public static void r_id_single() {
		String msg = "The array is empty";
		String cadena = "";
		if (Singletone.Single.size() != 0) {
			for (int i = 0; i < Singletone.Single.size(); i++) {
				cadena = cadena + (Singletone.Single.get(i).getId() + "\n");
			} // end for
			JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end else if
	}// r_id_single

	public static void r_id_doouble() {
		String msg = "The array is empty";
		String cadena = "";
		if (Singletone.Doouble.size() != 0) {
			for (int i = 0; i < Singletone.Doouble.size(); i++) {
				cadena = cadena + (Singletone.Doouble.get(i).getId() + "\n");
			} // end for
			JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end else if
	}// r_id_double

	public static void r_id_suite() {
		String msg = "The array is empty";
		String cadena = "";
		if (Singletone.Suite.size() != 0) {
			for (int i = 0; i < Singletone.Suite.size(); i++) {
				cadena = cadena + (Singletone.Suite.get(i).getId() + "\n");
			} // end for
			JOptionPane.showMessageDialog(null, cadena, "Result", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end else if
	}// r_id_suite

}// class