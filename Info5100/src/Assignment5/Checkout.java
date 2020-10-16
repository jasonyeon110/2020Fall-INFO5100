package Assignment5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Vector;

public class Checkout {
	
	private Vector<DessertItem> desserts = new Vector<>();
	private final int ReceiptWidth = 35;
	
	public Checkout() {
		desserts = new Vector<DessertItem>();
	}
	
	public int numberOfItems() {
		int num = desserts.size();
		return num;
	}
	
	public void enterItem(DessertItem item) {
		desserts.add(item);
	}
	
	public void clear() {
		desserts.clear();
		//System.out.println("Cleared the Checkout");		
	}		
	
	public int totalCost() {
		int price = 0;
		for (DessertItem item: desserts) {
			price += item.getCost();
		}
		return price;
		}
	
	public int totalTax() {
		return (int) (totalCost() * new DessertShoppe().getTaxRate());
	}
	
	
	public String toString() {
		String s = "";
		DessertShoppe shp = new DessertShoppe();
		//print header
		s += "        " + shp.getStoreName() + "\n";
		s += "        --------------------" + "\n";
		s += "\n";
		
		//print all the item + price of the item
		for (int i = 0; i < numberOfItems(); i ++) {
			
			String iName = desserts.get(i).getName(); //item names
			String iPrice = shp.cents2dollarsAndCents(desserts.get(i).getCost()); // get the cost for all items
			
			if (iPrice.length() > shp.costWidth) {
				iPrice = iPrice.substring(0, shp.costWidth);
				
			} else {
				if (desserts.get(i) instanceof Candy) {
					s += ((Candy) desserts.get(i)).getWeight() + " lbs. @ " + ((Candy) desserts.get(i)).getPricePerPound() + " /lb." + "\n";
					
					while(iName.length() < ReceiptWidth - iPrice.length()) {
						iName += " ";
					}
					
					s += iName + "$" + iPrice + "\n";
					s += "\n";
					
				} else if (desserts.get(i) instanceof Cookie) {
					s += ((Cookie) desserts.get(i)).getNumber() + " @ " + ((Cookie) desserts.get(i)).getPPD() + " /dz. \n";
					
					while(iName.length() < ReceiptWidth - iPrice.length()) {
						iName += " ";
					}
					
					s += iName + "$" + iPrice + "\n";
					s += "\n";
					
				} else if (desserts.get(i) instanceof Sundae) {
					s += ((Sundae) desserts.get(i)).getTopping() + " \n";
					
					while(iName.length() < ReceiptWidth - iPrice.length()) {
						iName += " ";
					}
					
					s += iName + "$" + iPrice + "\n";
					s += "\n";
					
				} else {
					
					while(iName.length() < ReceiptWidth - iPrice.length()) {
						iName += " ";
					}
					
					s += iName + "$" + iPrice + "\n";
					
					s += "\n";
					
					
				}
		
			}
			

		}
		
		String t = shp.cents2dollarsAndCents(totalTax());
		String tax = "TAX";
		String totalCost = "ToTal Cost";
		String check = shp.cents2dollarsAndCents(totalCost() + totalTax()) ;
		while (tax.length() < ReceiptWidth - t.length()) {
			tax += " ";
		}
	
		s += tax + "$" + t + "\n";
		
		while (totalCost.length() < ReceiptWidth - check.length()) {
			totalCost += " ";
		}
	
		s += totalCost + "$" + check + "\n" + "\n";
		
		
		
		return s  ;
	}
	
}

