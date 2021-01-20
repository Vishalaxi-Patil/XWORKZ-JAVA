package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {
	
	public static void main(String[] args) {
		
		MovieDTO dto1=new MovieDTO("Manikya",2.5,5, "Action");
		MovieDTO dto2=new MovieDTO("Tarle nan maga",2.5,5, "Comedy");
		MovieDTO dto3=new MovieDTO("om",2.5,4, "Action/war");
		MovieDTO dto4=new MovieDTO("KGF",2.5,4, "Action");
		
	   Collection<MovieDTO> movies=new ArrayList<MovieDTO>();
	   movies.add(dto1);
	   movies.add(dto2);
	   movies.add(dto3);
	   movies.add(dto4);
	   
	   Iterator<MovieDTO> iterator=movies.iterator();
	   while(iterator.hasNext()) {
		  MovieDTO movie=iterator.next();
		  System.out.println(movie);
		  if(movie.getGenre().equals("Comedy")) {
			  iterator.remove();
		  }
	   }
	   System.out.println("Movie after removing::"+movies.size());
	   
	   for(MovieDTO dto:movies) {
		   System.out.println(dto);
	   }
		
		
	}

}
