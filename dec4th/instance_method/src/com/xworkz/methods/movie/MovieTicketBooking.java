package com.xworkz.methods.movie;

public class MovieTicketBooking {
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;

	public MovieTicketBooking(String theaterName, int totalTickets, String[] movieNames) {
		System.out.println(" MovieTicketBooking contructor is called*****************************");
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
		this.movieNames = movieNames;
		System.out.println("MovieTicketBooking contructor is completed***************************");
	}

	public double bookTicketsAndGetPrice(String movieName, int noOfTickets, String bookedBy) {
		double totalPrice = 0;
		System.out.println(" bookTicketsAndGetPrice method is called*****************************");
		System.out.println("arg1::" + movieName);
		System.out.println("arg2::" + noOfTickets);
		System.out.println("arg3::" + bookedBy);
		for (int t = 0; t <= movieName.length(); t++) {
			String movie = movieNames[t];
			if (movieName.equals(movie)) {
				System.out.println("movie found so, book ticket");
				break;
			} else {
				System.out.println("movie not found so,dont book ticket");
			}

		}
		if (noOfTickets < totalTickets) {
			//totalTickets = totalTickets - noOfTickets;
			int t= totalTickets - noOfTickets;
			System.out.println("intial tottal number of ticket::" + noOfTickets);
			System.out.println("Remaining total number of tickets::" + t);
		} else
			System.out.println("seats are not available");
		System.out.println("bookTicketsAndGetPrice method is complted****************************");

		return totalPrice;

	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public String[] getMovieNames() {
		return movieNames;
	}

}
