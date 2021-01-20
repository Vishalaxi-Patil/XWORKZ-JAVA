package com.xworkz.solution.dto;

public class MovieDTO {
	private String name;
	private double duration;
	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", duration=" + duration + ", ratings=" + ratings + ", genre=" + genre + "]";
	}

	private int ratings;
	private String genre;
	
	public MovieDTO() {
		System.out.println("Invoked MovieDTO");
	}

	public MovieDTO(String name, double duration, int ratings, String genre) {
		super();
		this.name = name;
		this.duration = duration;
		this.ratings = ratings;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public double getDuration() {
		return duration;
	}

	public int getRatings() {
		return ratings;
	}

	public String getGenre() {
		return genre;
	}
	
	
	

}
