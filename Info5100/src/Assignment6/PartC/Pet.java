package Assignment6.PartC;

public class Pet {
	
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	
	//constructor
	Pet(String petName, String ownerName, String color){
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return this.petName;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSex(int sexid) {
		sex = sexid; 
	}
	
	public String getSex() {
		String result = "";
		switch(sex) {
		case 1:
			result = "MALE";
			break; 
			
		case 2:
			result = "FEMALE";
			break;
			
		case 3:
			result = "SPAYED";
			break;
			
		case 4:
			result = "NEUTERED";
			break;
		
		default:
			result = "Please choose a number between 1 ~ 4";
			break;
		}
		return result;
			
	}
	
	public String toString() {
		
		String s = "";
		
		s += getPetName() + " owned by " + getOwnerName() + "\n"
				+ "Color: " + getColor() + "\n"
				+ "Sex: " + getSex();
		
		return s;		
		
	}

}