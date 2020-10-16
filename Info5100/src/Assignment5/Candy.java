package Assignment5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Candy extends DessertItem{
	
	private double weight;
	private double pricePerPound;
	
	public Candy(String name, double w, int pricePerPound) {
		super(name);
		this.weight = w;
		this.pricePerPound = pricePerPound;
	}

	public double getWeight() {
		return this.weight;
	}
	
	public double getPricePerPound() {
		return this.pricePerPound/100.00;
	}
	
	@Override
	public int getCost() {
		double p =  weight * pricePerPound;
		int price = (int) Math.round(p);
		return price;
		
	}
	
	
	
	
	
}
