package com.xworkz.optional.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.optional.dto.GiftDTO;

public class GiftDAOImpl implements GiftDAO {

	private List<GiftDTO> list;

	public GiftDAOImpl() {
		this.list = new ArrayList<GiftDTO>();
	}

	@Override
	public void save(GiftDTO giftDTO) {
		System.out.println("Invoked save:"+giftDTO);
		this.list.add(giftDTO);
	}

	@Override
	public Optional<GiftDTO> fetchGivenBy(String name) {
		System.out.println("Invoked fetchGivenBy:"+name);
		for (GiftDTO giftDTO : list) {
			Optional<String> getByDTO=giftDTO.getGivenBy();
			if(getByDTO.isPresent()) {
				   String get=getByDTO.get();
				   if(get.equals(name)) {
					   System.out.println("name is match so will create optional");
					   return Optional.of(giftDTO);
				   }else {
					   System.out.println("name is not matching");
				   }
			}
			
		}
		return Optional.empty();
		
	}

}
