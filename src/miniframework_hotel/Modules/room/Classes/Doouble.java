package miniframework_hotel.Modules.room.Classes;

import miniframework_hotel.Classes.fecha;
import miniframework_hotel.Utils.formater;

public class Doouble extends room {
	private boolean	musica;
	private boolean	candles;

	public Doouble(String id, String m2, String capacity, boolean avalible, boolean wifi, fecha fini, fecha fend,
			boolean musica, boolean candles) {
		super(id, m2, capacity, avalible, wifi, fini, fend);
		this.musica = musica;
		this.candles = candles;
		super.setDiscount(this.calc_discount());
		super.setPrice(this.calc_price());
	}

	public Doouble(String id) {
		super(id);
	}// primary key

	/**
	 * sum_discount es el tanto por ciento que se suma cada x_dias con un maxima de
	 * descuento de max
	 */
	public String calc_discount() {
		int sum_discount = 2;
		int x_days = 3;
		int max_disc = 25;
		double cont_dies_aux = super.dias_estancia() / x_days;
		double discount_aux = cont_dies_aux * sum_discount;
		String discount = formater.nodec(Double.toString(discount_aux));

		if (Integer.parseInt(discount) >= max_disc) {
			discount = Integer.toString(max_disc);
		} // end if

		return discount;
	}// calc_discount

	public String calc_price() {
		double price_day = 50.60;
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

	public boolean isMusica() {
		return musica;
	}

	public void setMusica(boolean musica) {
		this.musica = musica;
	}

	public boolean isCandles() {
		return candles;
	}

	public void setCandles(boolean candles) {
		this.candles = candles;
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
		cadena = cadena + ("musica: " + this.musica + "\n");
		cadena = cadena + ("candles: " + this.candles + "\n");
		return cadena;
	}

}
