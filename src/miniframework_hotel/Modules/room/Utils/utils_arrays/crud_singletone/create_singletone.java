package miniframework_hotel.Modules.room.Utils.utils_arrays.crud_singletone;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Utils.crud_room;
import miniframework_hotel.Modules.room.Utils.utils_arrays.ask_id;
import miniframework_hotel.Modules.room.Utils.utils_arrays.find_room;

public class create_singletone {
	public static void single() {
		String msg = "The single is alredy created.";
		Single singleaux = ask_id.singleID();
		int index = find_room.single(singleaux);
		if (index == -1) {
			Singletone.Single.add((Single) crud_room.create(0));
			System.out.println("Single added to the array");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// single

	public static void doouble() {
		String msg = "The doouble is alredy created.";
		Doouble dooubleaux = ask_id.dooubleID();
		int index = find_room.doouble(dooubleaux);
		if (index == -1) {
			Singletone.Doouble.add((Doouble) crud_room.create(1));
			System.out.println("Doouble added to the array");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// doouble

	public static void suite() {
		String msg = "The suite is alredy created.";
		Suite suiteaux = ask_id.suiteID();
		int index = find_room.suite(suiteaux);
		if (index == -1) {
			Singletone.Suite.add((Suite) crud_room.create(2));
			System.out.println("Suite added to the array");
		} else {
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// suite
}// class
