package com.xworkz.player;

import com.xworkz.player.Exception.Service;
import com.xworkz.player.dto.PlayerDTO;

public class PlayerTester {

	public static void main(String[] args) {
		  Service service=new Service();
		  PlayerDTO dto=new PlayerDTO();
		  service.detailedInfo(null);
		  System.out.println("*****************");
		  service.detailedInfo(dto);

	}

}
