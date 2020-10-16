package Assignment5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sundae extends IceCream {
	
	
	private String topping;
	private float toppingCost;
	
	public Sundae(String name, int cost, String topping, float toppingCost) {
		super(name, cost);
		this.topping = topping;
		this.toppingCost = toppingCost;
	}
	
	public int getCost() {
		
		double p = super.getCost() + toppingCost;
		int price = (int) Math.round(p);
		return price;
		
	}
	
	public String getTopping() {
		return this.topping + " Sundae with";
	}
	
	public String getName() {
		return super.getName();
	}
	
	
}
	
	


