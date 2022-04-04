package miniframework_hotel.Modules.Users.Classes;

import miniframework_hotel.Classes.fecha;

public class Admin extends User {
	private fecha alta;

	public Admin(String username, String email, String password) {
		super(username, email, password);
		this.alta = super.factual();
	}

	public Admin(String username) {
		super(username);
	}// pk

	public fecha getAlta() {
		return alta;
	}

	public void setAlta(fecha alta) {
		this.alta = alta;
	}

	public String toString() {
		String cadena = "";
		cadena = cadena + ("Username: " + super.getUsername() + "\n");
		cadena = cadena + ("Email: " + super.getEmail() + "\n");
		cadena = cadena + ("Creation Date: " + super.getFecha_creacion().toString() + "\n");
		cadena = cadena + ("Password MD5: " + super.getPassword() + "\n");
		cadena = cadena + ("Date register admin: " + this.alta.toString() + "\n");
		return cadena;
	}
}// class
