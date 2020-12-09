package com.xworkz.methods.movie;

import java.util.Arrays;

public class MovieTicketBooking {
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;
	private int ticketPrice = 100;
	private String[] names = { "Pop Corn", "Chips", "Samosa", "nachos" };
	private int totalSnackPrice=50;
	private int noOfSnacks=2000;
	

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
			totalTickets = totalTickets - noOfTickets;
			this.ticketPrice = this.ticketPrice * noOfTickets;
			System.out.println("price of ticket::" + this.ticketPrice);

			System.out.println("intial tottal number of ticket::" + noOfTickets);
			System.out.println("Remaining total number of tickets::" + totalTickets);
		} else
			System.out.println("seats are not available");
		System.out.println("bookTicketsAndGetPrice method is complted****************************");

		return totalPrice;

	}

	public double buySnacks(String nameOfSnack, int quantity,boolean selfService, String seatNo) {
		double price = 0;
		System.out.println("Arg 1::"+nameOfSnack);
		System.out.println("Arg 2::"+quantity);
		System.out.println("Arg 3::"+selfService);
		System.out.println("Arg 4::"+seatNo);
		System.out.println(Arrays.toString(names));
		for(int s=0;s<names.length;s++)
		{
		    String name=names[s];
		    
		    if(nameOfSnack.equals(name))
		    		{
		    	       
		    	       System.out.println("Snacks are available");
		    	       if(quantity<=noOfSnacks)
		    	    		   {
		    	    	           System.out.println("number of snacks are available"); 
		    	    	           price=quantity*totalSnackPrice;
		    	    	           System.out.println("total price::" +price);
		    	    	           
		    	    		   }else
		    	    		   {
		    	    			   System.out.println("number of snacks are not avaliable");
		    	    		   }break;
		    		}else
		    		{
		    			System.out.println("Snacks are not avalibale");
		    		}
		}
		

		return price;
	}

	public String getTheaterName() {
		return theaterName;

	}

	public String[] getMovieNames() {
		return movieNames;
	}

}
