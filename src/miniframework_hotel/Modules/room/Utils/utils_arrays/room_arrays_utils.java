package miniframework_hotel.Modules.room.Utils.utils_arrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import miniframework_hotel.Modules.room.Classes.room;
import miniframework_hotel.Utils.menus;

public class room_arrays_utils {

	public static String[] id_list(ArrayList<room> roomaux) {
		String[] lista_id = new String[roomaux.size()];
		for (int i = 0; i < roomaux.size(); i++) {
			lista_id[i] = roomaux.get(i).getId();
		} // end for
		return lista_id;
	}// id_list

	public static int id_index(ArrayList<room> roomaux) {
		String[] options = room_arrays_utils.id_list(roomaux);
		boolean interuptor = false;
		int menu = 0;
		while (interuptor == false) {
			menu = menus.botons("Rooms", "Choose a room.", options);
			if (menu != -1) {
				interuptor = true;
			} else {
				JOptionPane.showMessageDialog(null, "You need to select something.", "Result",
						JOptionPane.INFORMATION_MESSAGE);
			} // end if else
		} // end while

		System.out.println("index room: " + menu);
		return menu;
	}// id_index

}// class
