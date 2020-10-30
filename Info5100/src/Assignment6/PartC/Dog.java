package Assignment6.PartC;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Dog extends Pet implements Boardable{

	private String size;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate boardDate;
	
	Dog(String petName, String ownerName, String color, String size) {
		super(petName, ownerName, color);
		this.size = size;
		
	}
	
	public String getSize() {
		return size;
	}
	
	public String toString() {
		String s = "Dog:" + "\n";
		
		s += getPetName() + " owned by " + getOwnerName() + "\n" +
		"Color: " + getColor() + "\n" +
		"Sex: " + getSex() + "\n" + 
		"Size: " + getSize();
		
		return s;
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) throws DateTimeException {
		try {
			startDate = LocalDate.of(year, month, day);
		}catch (DateTimeException e) {
			System.out.println("Year must be 4 digits \nMonth must be 1-12, \nDay must be 1-31");
		}
	
	}
	

	@Override
	public void setBoardEnd(int month, int day, int year) throws DateTimeException {
		try {
			endDate = LocalDate.of(year, month, day);
		}catch (DateTimeException e) {
			System.out.println("Year must be 4 digits \nMonth must be 1-12, \nDay must be 1-31");
		}
		
	}

	@Override
	public boolean boarding (int month, int day, int year) throws DateTimeException {
		
		boolean isBoardingTime = false;
		
		
		try {
			boardDate = LocalDate.of(year, month, day);
		}catch (DateTimeException e) {
			System.out.println("Year must be 4 digits \nMonth must be 1-12, \nDay must be 1-31");
		}
		
		if ((boardDate.isAfter(startDate) && boardDate.isBefore(endDate)) || (boardDate.equals(startDate) || boardDate.equals(endDate))) {
			isBoardingTime = true;
		}
		return isBoardingTime;
	}
	
	
}
