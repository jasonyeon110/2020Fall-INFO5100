package Assignment5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IceCream extends DessertItem{
	
	private double costOfIceCream;

	public IceCream() {
		
	}
	
	public IceCream(String name, int cost) {
		super(name);
		this.costOfIceCream = cost;
	}
	
//	public IceCream(int cost) {
//		this.costOfIceCream = cost;
//	}
	
	
	@Override
	public int getCost() {
		double p = costOfIceCream;
		int price = (int) Math.round(p);
		return price;
	}
	
	
	
}
