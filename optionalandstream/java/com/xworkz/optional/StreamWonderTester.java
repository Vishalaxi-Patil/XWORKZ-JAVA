package com.xworkz.optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.optional.dto.WonderDTO;
import com.xworkz.optional.dto.WonderDTO.Period;

public class StreamWonderTester {

	public static void main(String[] args) {

		WonderDTO wonder1 = new WonderDTO("Taj-Mahal", "India", Period.AC);

		WonderDTO wonder2 = new WonderDTO("Great Wall", "China", Period.BC);

		WonderDTO wonder3 = new WonderDTO("Chichén Itza", "Mexico", Period.AC);

		WonderDTO wonder4 = new WonderDTO("Petra", "Jordan", Period.BC);

		WonderDTO wonder5 = new WonderDTO("Machu Picchu", "Machu Picchu", Period.BC);

		WonderDTO wonder6 = new WonderDTO("Christ the Redeemer", "Brazil", Period.BC);

		WonderDTO wonder7 = new WonderDTO("Colosseum", "Colosseum", Period.BC);

		List<WonderDTO> wonderList = new ArrayList<WonderDTO>();
		wonderList.add(wonder1);
		wonderList.add(wonder2);
		wonderList.add(wonder3);
		wonderList.add(wonder4);
		wonderList.add(wonder5);
		wonderList.add(wonder6);
		wonderList.add(wonder7);

		List<WonderDTO> bcWonders = new ArrayList<WonderDTO>();
		wonderList.forEach(v -> {
			if (v.getPeriod().equals(Period.BC)) {
				bcWonders.add(v);

			}
		});
		System.out.println(bcWonders);
		
	Collections.sort(bcWonders,(a1,a2)->a2.getPalace().compareTo(a1.getPalace()));
	
	List<String> bcWonderName=new ArrayList<String>();
	   bcWonders.forEach(w->{
		   bcWonderName.add(w.getPalace());
	   });
	   System.out.println(bcWonderName);
	   
	   System.out.println("STREAMSTREAMSTREAMSTREAMSTEAMSTREAMSTREAMSTREAMSTREAMSTREAM");
	   
	 //wonderList.stream().sorted((a1, a2) -> a2.getPlace().compareTo(a1.getPlace()));
		
	 		List<String> list=wonderList
	 				.stream()
	 				.filter(e->e.getPeriod().equals(Period.BC))
	 				.sorted((a1, a2) -> a2.getPalace().compareTo(a1.getPalace()))
	 				.map(e->e.getName()).collect(toList());
	 		
	 		System.out.println(list);


	}

}
