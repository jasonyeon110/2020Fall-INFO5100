package Assignment3;

public class Assignment3 {

	public class Student {
		String name;
		int id;
		
		//Student Constructor
		public Student (String name, int id) {
			this.name = name;
			this.id = id;
		}
	
		
		public String getName(String name) {
			return name;
		}
		
		public void setName(String name) {
			this.name =name;
		}
		
		
	}
	
	public class Course {
		
		String cs_name;
		int numberOfStudents = 0; //representing the number of registered students, 0 at first
		Student[] registeredStudents = new Student[10];// Array lists for registered class, 10 students total
 		
//		public Course(String name, int numerbOfStudent) {
//			cs_name = name;
//			this.numberOfStudents = numberOfStudents;
//		}
		
		public Student[] getStudent() {
			//return the array of registered student	
			return registeredStudents;
			}
		
		
		public boolean isFull() {
			//return true if the course if full
			if (numberOfStudents == 10) {
				return true;
			}
		}
		
		public void registerStudent(Student student) {
			//if the course if not full, register a student in course.
			if (isFull() != true) {
				
			}
		}
	}
		
		
		
		
		
		
		
		
		
}
	
