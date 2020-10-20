package Assignment6;

public class TestMreview {

	public static void main(String[] args) {
		
		Mreview movie = new Mreview("Interstellar");
		movie.addRating(10);
		movie.addRating(9);
		movie.addRating(9);
		System.out.println(movie);
		
		
	}	
}
