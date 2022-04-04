package miniframework_hotel.Modules.room.Utils.utils_arrays;

import miniframework_hotel.Modules.room.Classes.Doouble;
import miniframework_hotel.Modules.room.Classes.Single;
import miniframework_hotel.Modules.room.Classes.Singletone;
import miniframework_hotel.Modules.room.Classes.Suite;
import miniframework_hotel.Modules.room.Classes.room;
import miniframework_hotel.Modules.room.Utils.ask_room;

@SuppressWarnings("unused")

public class ask_id {
	
	public static Single singleID() {

		Singletone.id = ask_room.id("Give me an id", "ID");
		Single singleaux = new Single(Singletone.id);
		return singleaux;
	}// singleid

	public static Doouble dooubleID() {
		Singletone.id = ask_room.id("Give me an id", "ID");
		Doouble dooubleaux = new Doouble(Singletone.id);
		return dooubleaux;
	}// singleid

	public static Suite suiteID() {
		Singletone.id = ask_room.id("Give me an id", "ID");
		Suite suiteaux = new Suite(Singletone.id);
		return suiteaux;
	}// singleid

}// class
