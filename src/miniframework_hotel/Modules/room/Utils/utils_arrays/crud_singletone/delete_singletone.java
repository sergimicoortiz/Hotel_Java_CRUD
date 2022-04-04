package miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Utils.utils_arrays.ask_id;
import miniframework_hotel.Modules.room.Utils.utils_arrays.find_room;

public class delete_singletone {
	public static void single() {
		String msg = "The single don't exist.";
		Single singleaux = ask_id.singleID();
		int index = find_room.single(singleaux);
		if (index != -1) {
			Singletone.Single.remove(index);
			System.out.println("Single " + index + " removed");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// single

	public static void doouble() {
		String msg = "The doouble don't exist.";
		Doouble dooubleaux = ask_id.dooubleID();
		int index = find_room.doouble(dooubleaux);
		if (index != -1) {
			Singletone.Doouble.remove(index);
			System.out.println("Doouble " + index + " removed");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// doouble
	
	public static void suite() {
		String msg = "The suite don't exist.";
		Suite suiteaux = ask_id.suiteID();
		int index = find_room.suite(suiteaux);
		if (index != -1) {
			Singletone.Suite.remove(index);
			System.out.println("Suite " + index + " removed");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// suite

}// class
