package com.xworkz.methods;

import com.xworkz.methods.movie.MovieTicketBooking;
import java.util.Arrays;

public class movieTester {

	public static void main(String[] args) {
		String[] movieNames = { "KGF", "Kushi", "Dabang", "Tarak", "Ambsreesha" };
		String[] name = new String[] { "KGF", "Kushi", "Dabang", "Tarak", "Ambsreesha" };
		MovieTicketBooking movieTicketBooking = new MovieTicketBooking("navrang", 500, movieNames);
		System.out.println(movieTicketBooking.getTheaterName());
		//System.out.println(movieTicketBooking.getTotalTickets());
		// System.out.println(movieTicketBooking.getMovieNames());
		System.out.println(Arrays.toString(name));
		movieTicketBooking.bookTicketsAndGetPrice("Tarak", 5, "Vishalaxi");
		movieTicketBooking.bookTicketsAndGetPrice("Tarak", 5, "Vishalaxi");

		movieTicketBooking.bookTicketsAndGetPrice("Tarak", 495, "Vishalaxi");
		movieTicketBooking.bookTicketsAndGetPrice("Tarak", 501, "Vishalaxi");
		
		System.out.println(movieTicketBooking.buySnacks("Chips", 2, true,null));
		

	}

}
