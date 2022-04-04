package miniframework_hotel.Modules.Users.Classes;

import miniframework_hotel.Classes.fecha;

public class VIP extends User {
	private String	country;
	private fecha	fecha_nacimiento;
	private int		num_compras;

	public VIP(String username, String email, String password, String country, fecha fecha_nacimiento,
			int num_compras) {
		super(username, email, password);
		this.country = country;
		this.fecha_nacimiento = fecha_nacimiento;
		this.num_compras = num_compras;
	}

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

	public int getNum_compras() {
		return num_compras;
	}

	public void setNum_compras(int num_compras) {
		this.num_compras = num_compras;
	}

	public VIP(String username) {
		super(username);
	}// pk

	public String toString() {
		String cadena = "";
		cadena = cadena + ("Username: " + super.getUsername() + "\n");
		cadena = cadena + ("Email: " + super.getEmail() + "\n");
		cadena = cadena + ("Creation Date: " + super.getFecha_creacion().toString() + "\n");
		cadena = cadena + ("Password MD5: " + super.getPassword() + "\n");
		cadena = cadena + ("Country: " + this.country + "\n");
		cadena = cadena + ("Birth Date: " + this.fecha_nacimiento.toString() + "\n");
		cadena = cadena + ("Num compras: " + this.num_compras + "\n");
		return cadena;
	}
}// class
