package com.xworkz.optional;

import java.util.Optional;

import com.xworkz.optional.dto.GiftDTO;
import com.xworkz.optional.dto.GiftDTO.GiftType;

public class TesterOperation {

	public static void main(String[] args) {

       GiftDTO giftDTO=new GiftDTO();
       Optional<GiftType> type=Optional.ofNullable(GiftType.CHOCHLATE);
       giftDTO.setGiftType(type);
       Optional<GiftType> getType=giftDTO.getGiftType();
       getType.ifPresent(o->System.out.println(o)); //lambda 
       //or type.ifPresent(System.out::println); method reference
       
       giftDTO.setGivenBy(Optional.ofNullable("Shush"));
       giftDTO.getGivenBy().ifPresent(v->System.out.println(v.toUpperCase()));
       giftDTO.getGivenBy().map(String::toLowerCase);
       

	}

}
