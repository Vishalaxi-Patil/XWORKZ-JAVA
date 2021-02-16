package com.xworkz.optional;

import java.util.Optional;

import com.xworkz.optional.dao.GiftDAO;
import com.xworkz.optional.dao.GiftDAOImpl;
import com.xworkz.optional.dto.GiftDTO;
import com.xworkz.optional.dto.GiftDTO.GiftType;

public class OptionalTester {
	
	public static void main(String[] args) {
		
		GiftDTO giftDTO=new GiftDTO();
		giftDTO.setGiftType(Optional.of(GiftType.CHOCHLATE));
		giftDTO.setGivenBy(Optional.of("Shush"));
		giftDTO.setPrice(3000);
		
		GiftDAO giftDAO=new GiftDAOImpl();
	    giftDAO.save(giftDTO);
	    
	    GiftDTO giftDTO1=new GiftDTO();
		giftDTO1.setGiftType(Optional.of(GiftType.DOLL));
		giftDTO1.setGivenBy(Optional.of("Vena"));
		giftDTO1.setPrice(4000);
		giftDAO.save(giftDTO1);
	    
	    
	    Optional<GiftDTO> givenByName=giftDAO.fetchGivenBy("Vena");
	    givenByName.ifPresent(e->System.out.println(e));
		
	}

}
