package Assignment4;

public class TestCylinder {

	public static void main(String[] args) {
		
		//create circle obj with radius 2 and Yellow color
		Circle circle = new Circle();
		circle.setRadius(2.0);
		circle.setColor("Yellow");
		System.out.println(circle.getArea());
		
		System.out.println("-------------------------------------------------------------");

		Cylinder cylinder1 = new Cylinder();
		cylinder1.setRadius(1.0);
		cylinder1.setHeight(1.0);
		cylinder1.setColor("Red");
		System.out.println("Radius is " + cylinder1.getRadius() + ", Height is " + cylinder1.getHeight() + ", Color is " + cylinder1.getColor() + ", Base Area is " + cylinder1.getArea() + ", Volume is " +  cylinder1.getVolume());
	
		System.out.println("-------------------------------------------------------------");
		
		Cylinder cylinder2 = new Cylinder(5.0, 2.0);
		cylinder1.setColor("Red");
		
		System.out.println("Radius is " + cylinder2.getRadius() + ", Height is " + cylinder2.getHeight() + ", Color is " + cylinder2.getColor() + ", Base Area is " + cylinder2.getArea() + ", Volume is " + cylinder2.getVolume());
		
	}

}
