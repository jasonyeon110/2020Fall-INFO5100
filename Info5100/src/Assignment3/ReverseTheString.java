package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseTheString {

	public static void main(String[] args) {	
			
		String a = "hello my name is yuri";
		String str[] = a.split(" ");
		List<String> b = new ArrayList<String>();
		b = Arrays.asList(str);
		//System.out.println(str[2]);
		//System.out.println(b.size());
		int c = b.size();
		//System.out.println("c value is: " + c);
		//System.out.println("str value is: " + str.length);
		int i = 0;
		while (i < str.length) {
			if (b.size() == 1) {
				System.out.println("Nothing to reverse.");
				break;
			}
			//			for (String i : str ) {
//				System.out.println(str[c-1]);
//				c ++;
//			}
			System.out.print(str[i+c-1] + " ");  // first i = 0, c = 4  str[3], second i = 1 c = 3 so 1 + 3 -2 str[2]
			i ++;
			c = c -2;
			
		}
			
	}
	

}
