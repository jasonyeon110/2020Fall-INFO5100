package Assignment5;

public class DessertShoppe {
	//tax rate
	//name of store
	//Max size of item, name 
	//display cost of the item on the receipt
	
	final double taxRate = 0.065; 
	final String storeName = "M & M Dessert Shoppe";
	final int maxSizeItem = 30; 
	final int costWidth = 7;

	
	public String cents2dollarsAndCents(int cents) {
		return String.valueOf(cents/100.0);
	}
	
	public float getTaxRate() {
		return (float) (taxRate);
	}
	
	public String getStoreName() {
		return storeName;
	}
}
