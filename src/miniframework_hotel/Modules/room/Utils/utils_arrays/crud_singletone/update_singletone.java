package miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Utils.crud_room;
import miniframework_hotel.Modules.room.Utils.utils_arrays.ask_id;
import miniframework_hotel.Modules.room.Utils.utils_arrays.find_room;

public class update_singletone {

	public static void single() {
		String msg = "The single don't exist.";
		Single singleaux = ask_id.singleID();
		int index = find_room.single(singleaux);
		Single singleupdate = null;
		if (index != -1) {
			singleupdate = (Single) crud_room.update(Singletone.Single.get(index));
			Singletone.Single.set(index, singleupdate);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// single

	public static void doouble() {
		String msg = "The doouble don't exist.";
		Doouble dooubleaux = ask_id.dooubleID();
		int index = find_room.doouble(dooubleaux);
		Doouble dooubleupdate = null;
		if (index != -1) {
			dooubleupdate = (Doouble) crud_room.update(Singletone.Doouble.get(index));
			Singletone.Doouble.set(index, dooubleupdate);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// doouble

	public static void suite() {
		String msg = "The suite don't exist.";
		Suite suiteaux = ask_id.suiteID();
		int index = find_room.suite(suiteaux);
		Suite suiteupdate = null;
		if (index != -1) {
			suiteupdate = (Suite) crud_room.update(Singletone.Suite.get(index));
			Singletone.Suite.set(index, suiteupdate);
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end elseif
	}// suite

}// class