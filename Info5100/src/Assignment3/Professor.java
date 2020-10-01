package Assignment3;

import Assignment3.Professor.Builder;

public class Professor {

	private String firstName;
	private String lastName;
	private int	id;
	
	public static class Builder {
		private String firstName;
		private String lastName;
		private int id;
		
		public Builder(String firstname, String lastname, int id) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = id;
		}
		
		public Professor build() {
			return new Professor(firstName, lastName, id);
		}
		
	}
	
	public Professor (String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}

}


class Getout {
	public static void main(String[] args) {
		Professor x = new Professor.Builder("Charles", "Xavier", 1).build();
		
	}
}





