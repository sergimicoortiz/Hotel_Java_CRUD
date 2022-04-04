package miniframework_hotel.Modules.Users.Classes;

import java.util.Calendar;
import java.util.Locale;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Modules.Users.Utils.password_encryption;

public abstract class User {
	private String	username;
	private fecha	fecha_creacion;
	private String	email;
	private String	password;

	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.fecha_creacion = this.factual();
		this.email = email;
		this.password = password_encryption.md5(password);
	}

	public User(String username) {
		this.username = username;
	}// pk

	public fecha factual() {
		Locale loc = new Locale("es");
		Calendar calendar = Calendar.getInstance(loc);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
//	    System.out.println(calendar.get(Calendar.YEAR));
//	    System.out.println(calendar.get(Calendar.MONTH) + 1);
//	    System.out.println(calendar.get(Calendar.DATE));
		fecha fechaaux = new fecha("1-1-2020");
		fechaaux.setDay(day);
		fechaaux.setMonth(month);
		fechaaux.setYear(year);
		return fechaaux;

	}// factual

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public fecha getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(fecha fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password_encryption.md5(password);
	}

	@Override
	public abstract String toString();

}// class
