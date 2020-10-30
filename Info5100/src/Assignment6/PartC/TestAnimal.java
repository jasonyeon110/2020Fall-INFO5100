package Assignment6.PartC;

public class TestAnimal {

	public static void main(String[] args) {
		
		Pet pet = new Pet("Berry", "Jason", "Blue");
		pet.setSex(1);
		System.out.println(pet);

		System.out.println("------------------------------");
		
		Dog d = new Dog("Yuki", "Yuri", "White", "Small");
		d.setSex(3);
		System.out.println(d);
		d.setBoardStart(1, 30, 2020);
		d.setBoardEnd(10, 30, 2020);
		System.out.println(d.boarding(4, 1, 2021)); // false
		
		
		System.out.println("------------------------------");
		
		Cat c = new Cat("Inu", "Jason", "Black/Brown", "Short");
		c.setSex(4);
		System.out.println(c);
		c.setBoardStart(1, 30, 2020);
		c.setBoardEnd(10, 30, 2020);
		System.out.println(c.boarding(3, 1, 2020)); //true
		

	}

}
