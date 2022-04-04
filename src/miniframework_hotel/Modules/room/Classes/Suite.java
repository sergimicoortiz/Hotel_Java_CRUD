package miniframework_hotel.Modules.room.Classes;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Utils.formater;

public class Suite extends room {

	private String	suplementspa;
	private fecha	finispa;
	private fecha	fendspa;
	private boolean	vistas;

	public Suite(String id, String m2, String capacity, boolean avalible, boolean wifi, fecha fini, fecha fend,
			fecha finispa, fecha fendspa, boolean vistas) {
		super(id, m2, capacity, avalible, wifi, fini, fend);
		this.finispa = finispa;
		this.fendspa = fendspa;
		this.vistas = vistas;
		this.suplementspa = this.extra_spa();
		super.setDiscount(this.calc_discount());
		super.setPrice(this.calc_price());
	}

	public Suite(String id) {
		super(id);
	}// primary key

	public int calc_dies_spa() {
		int dies_spa = this.getFendspa().diferenciaFecha(this.finispa);

		return dies_spa + 1;
	}// calc_dies_spa

	public String extra_spa() {
		double coste_dia_spa = 15.0;
		double total = coste_dia_spa * this.calc_dies_spa();
		return Double.toString(total);

	}// estra_spa

	/**
	 * sum_discount es el tanto por ciento que se suma cada x_dias con un maxima de
	 * descuento de max
	 */
	public String calc_discount() {
		int sum_discount = 4;
		int x_days = 5;
		int max_disc = 40;
		double cont_dies_aux = super.dias_estancia() / x_days;
		double discount_aux = cont_dies_aux * sum_discount;
		String discount = formater.nodec(Double.toString(discount_aux));

		if (Integer.parseInt(discount) >= max_disc) {
			discount = Integer.toString(max_disc);
		} // end if

		return discount;
	}// calc_discount

	public String calc_price() {
		double price_day = 301.30;
		int discount = Integer.parseInt(this.calc_discount());
		double price_no_dis = price_day * (double) super.dias_estancia();
		double price_disc = price_no_dis * ((double) 1 - ((double) discount / (double) 100));
		return Double.toString(price_disc);
	}// calc_price

	public void setFini(fecha fini) {
		super.setFini(fini);
		super.setDiscount(this.calc_discount());
		super.setPrice(this.calc_price());
	}

	public void setFend(fecha fend) {
		super.setFend(fend);
		super.setDiscount(this.calc_discount());
		super.setPrice(this.calc_price());
	}

	public String getSuplementspa() {
		return suplementspa;
	}

	public void setSuplementspa(String suplementspa) {
		this.suplementspa = suplementspa;
	}

	public fecha getFinispa() {
		return finispa;
	}

	public void setFinispa(fecha finispa) {
		this.finispa = finispa;
		this.suplementspa = this.extra_spa();
	}

	public fecha getFendspa() {
		return fendspa;
	}

	public void setFendspa(fecha fendspa) {
		this.fendspa = fendspa;
		this.suplementspa = this.extra_spa();
	}

	public boolean isVistas() {
		return vistas;
	}

	public void setVistas(boolean vistas) {
		this.vistas = vistas;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = cadena + ("id: " + super.getId() + "\n");
		cadena = cadena + ("m2: " + super.getM2() + "\n");
		cadena = cadena + ("capacity: " + super.getCapacity() + "\n");
		cadena = cadena + ("avalible: " + super.isAvalible() + "\n");
		cadena = cadena + ("wifi: " + super.isWifi() + "\n");
		cadena = cadena + ("fini: " + super.getFini().toString() + "\n");
		cadena = cadena + ("fend: " + super.getFend().toString() + "\n");
		cadena = cadena + ("price: " + formater.euros(super.getPrice()) + "\n");
		cadena = cadena + ("discount: " + formater.percent(super.getDiscount()) + "\n");

		cadena = cadena + ("extraspa: " + formater.euros(this.suplementspa) + "\n");
		cadena = cadena + ("finispa: " + this.finispa.toString() + "\n");
		cadena = cadena + ("fendspa: " + this.fendspa.toString() + "\n");
		cadena = cadena + ("views: " + this.vistas + "\n");
		return cadena;
	}

}
