package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.beach.dto.BeachDTO;

public class BeachNoOfResortComparator implements Comparator<BeachDTO>{

	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		Integer o1No=o1.getNoOfResorts();//autoboxing
		Integer o2No=o2.getNoOfResorts();
		return o1No.compareTo(o2No);
	}

}
