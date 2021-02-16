package com.xworkz.optional.dao;

import java.util.Optional;

import com.xworkz.optional.dto.GiftDTO;

public interface GiftDAO {
	
	public void save(GiftDTO giftDTO);
	
	public Optional<GiftDTO> fetchGivenBy(String name);

}
