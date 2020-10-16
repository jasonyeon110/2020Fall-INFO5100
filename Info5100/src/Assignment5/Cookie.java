package Assignment5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cookie extends DessertItem{
	
	private int number;
	private int pricePerDozen;
	
	public Cookie(String name, int number, int pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
		
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public double getPPD() {
		return this.pricePerDozen/100.0;
	}

	@Override
	public int getCost() {
		double p =  (double) pricePerDozen/12 * number;
		int price = (int) Math.round(p);
		return price;
	}
	
}
