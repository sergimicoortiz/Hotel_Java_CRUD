package miniframework_hotel.Modules.Users.Classes;

import miniframework_hotel.Classes.fecha;

public class Client extends User {
	private String	country;
	private fecha	fecha_nacimiento;

	public Client(String username, String email, String password, String country, fecha fecha_nacimiento) {
		super(username, email, password);
		this.country = country;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Client(String username) {
		super(username);
	}// pk

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public fecha getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(fecha fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = cadena + ("Username: " + super.getUsername() + "\n");
		cadena = cadena + ("Email: " + super.getEmail() + "\n");
		cadena = cadena + ("Creation Date: " + super.getFecha_creacion().toString() + "\n");
		cadena = cadena + ("Password MD5: " + super.getPassword() + "\n");
		cadena = cadena + ("Country: " + this.country + "\n");
		cadena = cadena + ("Birth Date: " + this.fecha_nacimiento.toString() + "\n");
		return cadena;
	}

}// class
