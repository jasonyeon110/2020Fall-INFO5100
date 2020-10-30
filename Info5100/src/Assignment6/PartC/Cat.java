package Assignment6.PartC;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

//import jdk.javadoc.internal.tool.Start;

public class Cat extends Pet implements Boardable {

	private String hairLength;
	//private int startMonth, startDay, startYear, endMonth, endDay, endYear;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate boardDate;
	
	Cat(String petName, String ownerName, String color, String hairLength) {
		super(petName, ownerName, color);
		this.hairLength = hairLength;
		
	}
	
	public String getHairLength() {
		return this.hairLength;
	}
	
	public String toString() {
		
		String s = "CAT: \n";
		
		s += getPetName() + " Owned by " + getOwnerName() + "\n" +
		"Color: " + getColor() + "\n" + 
		"Sex: " + getSex() + "\n" +
		"Hair: " + getHairLength();
		
		return s;
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		try {
			startDate = LocalDate.of(year, month, day);
		}catch (DateTimeException e) {
			System.out.println("Year must be 4 digits \nMonth must be 1-12, \nDay must be 1-31");
		}
	
	}
	

	@Override
	public void setBoardEnd(int month, int day, int year) {
		try {
			endDate = LocalDate.of(year, month, day);
		}catch (DateTimeException e) {
			System.out.println("Year must be 4 digits \nMonth must be 1-12, \nDay must be 1-31");
		}
		
	}

	@Override
	public boolean boarding (int month, int day, int year) {
		
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
