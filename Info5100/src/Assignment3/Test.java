package Assignment3;

public class Test {

	public static void main(String[] args) {
		
		Course java = new Course("Siva");
		
		Students a = new Students("Jason", 1);
		Students b = new Students("Yuri", 1004);
		Students c = new Students("hey", 2345);
		Students d = new Students("luck", 2231);
		Students e = new Students("You", 993);
		Students f = new Students("one", 34);
		Students g = new Students("two", 654);
		Students h = new Students("three", 3456);
		Students i = new Students("four", 685);
		Students j = new Students("five", 97684);
		Students k = new Students("NotLuckyone", 74556);
		Students l = new Students("NotLuckytwo", 8385964);
		System.out.println('\n');
		
		java.registerStudent(a);
		java.registerStudent(b);
		java.registerStudent(c);
		java.registerStudent(d);
		java.registerStudent(e);
		java.registerStudent(f);
		java.registerStudent(g);
		java.registerStudent(h);
		java.registerStudent(i);
		java.registerStudent(j);
		java.registerStudent(k);
		java.registerStudent(l);
	}

}
