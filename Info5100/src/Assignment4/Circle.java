package Assignment4;

public class Circle {
	
	
	private double radius = 1.0;
	private String color = "red";
	
	//constructor without parameter
	public Circle() {
		//System.out.println("Circle has been created");
	} 
	
	public Circle(double radius) {
		this.radius = radius;
		//System.out.println("Circle's Raidus is " + getRadius());
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		//System.out.println("Circle's Raidus is " + getRadius() + ", Color is  " + getColor());
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea () {
		System.out.print("\u25CB Circle's Radisu is " + getRadius() + ", Color is " + getColor() + " Base area is ");
		return Math.pow(radius, 2) * Math.PI;
		
	}
	
	
}
