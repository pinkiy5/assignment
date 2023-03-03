package mypackage;

public class Main {
	public static void main(String[] args) {
		Movie obj = new Movie();  //create object of movie class
		//setting all values
		obj.setMovieName("kabir singh");
		obj.setMovieStartTime("2:00 PM");
		obj.setMovieEndTime("5:00 PM");
		obj.setMovieTicketPrice(300f);
		//getting all values
		System.out.println("movie name is : "+obj.getMovieName());
		System.out.println("movie start time is : "+obj.getMovieStartTime());
		System.out.println("movie end time is : "+obj.getMovieEndTime());
		System.out.println("ticket price is : "+obj.getMovieTicketPrice());
	}

}
