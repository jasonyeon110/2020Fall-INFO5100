package Assignment4;

public class TestKthElement extends LargestElement{

	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,3,5,6,7,8,5,9};
		
		//First extra code problem..
		kthElementSortDupRemoved(5,a);
		
		System.out.println("-----------------------------------------------------------------------");
	
		//First code problem
		kthElement(5, a);
	}

}
