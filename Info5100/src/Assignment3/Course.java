package Assignment3;

import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.List;


public class Course {
		
		String name;
		int numberOfStudents = 0; //representing the number of registered students at the beginning, 0 at first
		// Array lists for registered class, 10 students total
 		//List<Students> registeredStudents = new ArrayList<Students>(4); 
		Students[] registeredStudents = new Students[10];
		
		//Course Constructor
		public Course(String name) {
			this.name = name;
		
		}
		
		
		
		public Students[] getStudent() {
			//return the array of registered student	
			System.out.println(Arrays.toString(registeredStudents));
			return registeredStudents;
			}
		
		
		
		public boolean isFull() {
			//return true if the course if full
			if (numberOfStudents == 10) {
				return true;  // Course is full
			} else {
				return false; // Course is not full
			}
		}
		
		
		public void registerStudent(Students student) {
			//if the course if not full, register a student in course.
			if (isFull() != true) {
				registeredStudents[numberOfStudents] = student;
				numberOfStudents ++;
				//for(int i = 0; i < registeredStudents.length; i ++) {
				//	System.out.println(registeredStudents[i]);
				//}
				System.out.println("Successfully Registered to " + student.getName() + "'s class \u2713 \n" );
				
				} else {
				System.out.println(name + "'s class is FULL. \u00D7 \n");
				System.out.println(student.getName() + ", You will be on the waiting list for this class \n");
			}
		}
}
	

