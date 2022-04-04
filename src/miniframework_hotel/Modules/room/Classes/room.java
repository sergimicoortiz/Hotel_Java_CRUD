package miniframework_hotel.Modules.room.Classes;

import miniframework_hotel.Classes.fecha;

public abstract class room {
	private String	id;
	private String	m2;
	private String	capacity;
	private boolean	avalible;
	private boolean	wifi;
	private fecha	fini;
	private fecha	fend;
	private String	price;
	private String	discount;

	public room(String id, String m2, String capacity, boolean avalible, boolean wifi, fecha fini, fecha fend) {
		super();
		this.id = id;
		this.m2 = m2;
		this.capacity = capacity;
		this.avalible = avalible;
		this.wifi = wifi;
		this.fini = fini;
		this.fend = fend;
		this.price = "";
		this.discount = "";
	}

	public room(String id) {
		this.id = id;
	}// primari key

	public int dias_estancia() {
		return this.fend.diferenciaFecha(this.fini);
	}// dias_estancia

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getM2() {
		return m2;
	}

	public void setM2(String m2) {
		this.m2 = m2;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public boolean isAvalible() {
		return avalible;
	}

	public void setAvalible(boolean avalible) {
		this.avalible = avalible;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public fecha getFini() {
		return fini;

	}

	public void setFini(fecha fini) {
		this.fini = fini;
	}

	public fecha getFend() {
		return fend;
	}

	public void setFend(fecha fend) {
		this.fend = fend;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public abstract String toString();

}// class