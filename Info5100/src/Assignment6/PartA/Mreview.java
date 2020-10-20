package Assignment6;

import java.util.*;

public class Mreview implements Comparable<Mreview>{
	
	//Instance Variables
	private String title;
	private ArrayList<Integer> ratings;
	
	
	//Constructors
	Mreview(){
		this.title = "";
		ratings = new ArrayList<Integer>();
	}
	
	Mreview(String title){
		this.title = title;
		ratings = new ArrayList<Integer>();
	}
	
	Mreview(String title, int firtRating){
		this.title = title;
		ratings = new ArrayList<Integer>(1); 
	}
	
	
	//methods
	public String getTitle() {
		return title;
	}
	
	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		
		double sum = 0;
		
		for (int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i);		
		}
		return (double) Math.round(sum/ratings.size() * 100) /100;
	}
	
	public int numRatings() {
		return ratings.size();
	}
	
	@Override
	public int compareTo(Mreview obj) {
		return title.compareTo(obj.title);
	}
	
	public boolean equals(Mreview obj) {
		return title.equals(obj.title);
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s += title + "'s average movie review is " + aveRating() + " out of " + numRatings() + " reviews";
		
		return s;
	}
	
	
	
}
