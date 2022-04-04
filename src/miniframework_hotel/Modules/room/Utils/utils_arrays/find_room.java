package miniframework_hotel.Modules.room.Utils.utils_arrays;

import java.util.ArrayList;

import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Classes.room;

@SuppressWarnings("unused")
public class find_room {

	public static int single(Single singleaux) {
		int index = -1;
		for (int i = 0; i < (Singletone.Single.size()); i++) {
			System.out.println("for: " + i);
//			System.out.println("for1: " + Singletone.Single.get(i).getId());
//			System.out.println("for2: " + singleaux.getId());
			
			if ((Singletone.Single.get(i).getId()).equals(singleaux.getId())) {
				System.out.println("if num: " + i);
				index = i;
			}//end if
		} // end for
		return index;
	}// Single


	public static int doouble(Doouble dooubleaux) {
		int index = -1;
		for (int i = 0; i < (Singletone.Doouble.size()); i++) {
			System.out.println("for: " + i);
			if ((Singletone.Doouble.get(i).getId()).equals(dooubleaux.getId())) {
				System.out.println("if num: " + i);
				index = i;
			} // end if
		} // end for
		return index;
	}// Doouble

	public static int suite(Suite suiteaux) {
		int index = -1;
		for (int i = 0; i < (Singletone.Suite.size()); i++) {
			System.out.println("for: " + i);
			if ((Singletone.Suite.get(i).getId()).equals(suiteaux.getId())) {
				System.out.println("if num: " + i);
				index = i;
			} // end if
		} // end for
		return index;
	}// Doouble

}// Class
