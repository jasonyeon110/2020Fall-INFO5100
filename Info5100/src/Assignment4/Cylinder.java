package Assignment4;

public class Cylinder extends Circle {
	

	private double height = 1.0;

	Cylinder() {
		System.out.println("Cylinder has been created");
	}
	
	Cylinder(double height) {
		this.height = height;
		//System.out.println("Cylinder's Height is " + getHeight());
	}
	
	Cylinder(double height, double radius) {
		super(radius);
		this.height = height;	
		//System.out.println("Cylinder's Radius is " + getRadius() + ", Height is " + getHeight());
	}
	
	Cylinder(double radius, double height , String color){
		super(radius, color);
		this.height = height;
		//System.out.println("Cylinder's Radius is " + getRadius() + ", Height is "  + getHeight() + "Color is " + getColor());
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double getVolume() {
		//System.out.print("Radius is " + getRadius() + ", Height is " + getHeight() + ", Color is " + getColor() + ", Base Area is " + ", Volume is " + getVolume());
		//above is recursive and it will invoke java.lang.Stack.OverflowError...
		return Math.PI * Math.pow(getRadius(), 2) * height; 
	}
	
	@Override
	public double getArea () {
		//System.out.print("Radius is " + getRadius() + ", Height is " + getHeight() + ", Color is " + getColor() + ", Base Area is " + ", Volume is " + getVolume());
		//Same as above
		return 2 * Math.PI * getRadius() * (getRadius() + height);
	}
	
}
