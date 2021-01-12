package com.xworkz.player.Exception;

import com.xworkz.player.dto.PlayerDTO;

public class Service {
	
	public void detailedInfo(PlayerDTO dto) {
		String name=null;
		int jurseyNo=0;
		String sports=null;
		try {
			System.out.println("start of try block");
			String name1=dto.getName();
		    int jurseyNo1=dto.getJurseyNo();
		    int[] array= {1};
		    System.out.println(array[2]);
			String sports1=dto.getSports();
			System.out.println("End of try block");
		    }catch (NullPointerException np) {
				System.out.println("catching NullPointerException");
			}catch(ArrayIndexOutOfBoundsException ap) {
				System.out.println("catching ArrayIndexOutOfBoundsException");
			}
	        System.out.println(name);
	        System.out.println(jurseyNo);
	        System.out.println(sports);
		
	}

}
