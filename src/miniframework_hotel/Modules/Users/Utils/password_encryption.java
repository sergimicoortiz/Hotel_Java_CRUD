package miniframework_hotel.Modules.Users.Utils;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class password_encryption {

	public static String md5(String input) {
		String output = "";

		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(input.getBytes());
			byte[] bytes = md5.digest();

			StringBuilder s = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			} // end for

			output = s.toString();
		} // end try
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			output = "";
		} // end cath
	//	System.out.println("password: " + output);
		return output;
	}// md5

}// class