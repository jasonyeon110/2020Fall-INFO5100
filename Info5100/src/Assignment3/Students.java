package Assignment3;

public class Students {
	
	private String name;
	private int id;
	
	//Student Constructor
	public Students (String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println(name + " => registered as a Student");
		System.out.println("Your Student ID is " + id);
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	

}


