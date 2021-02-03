package com.xworkz.beach.dto;

public class BeachDTO implements Comparable<BeachDTO> {

	private String name;
	private int noOfResorts;

	public BeachDTO() {
		System.out.println("Invoked BeachDTO");
	}

	public BeachDTO(String name, int noOfResorts) {
		super();
		this.name = name;
		this.noOfResorts = noOfResorts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfResorts() {
		return noOfResorts;
	}

	public void setNoOfResorts(int noOfResorts) {
		this.noOfResorts = noOfResorts;
	}
    
//	//comparing integer value
//	//@Override
//	public int compareToResort(BeachDTO o) {
//		System.out.println("Invoked compareTo");
//		// 0 equal,+1 grater,-1 lesser
//
//		if (this.noOfResorts == o.getNoOfResorts()) {
//			System.out.println("equal:" + noOfResorts);
//			return 0;
//
//		}
//		if(this.noOfResorts>o.noOfResorts)
//		{
//			System.out.println("grater:"+noOfResorts);
//			return 1;
//		}
//		if(this.noOfResorts<o.noOfResorts) {
//			System.out.println("lesser:"+noOfResorts);
//			return -1;
//		}
//		return 0;
//	}

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", noOfResorts=" + noOfResorts + "]";
	}
    
	//comparing string type
	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("Comparing by name");
		//int tempA=this.name.compareTo(o.getName());//ascending
		int tempD=o.getName().compareTo(this.name);//descending
		System.out.println("Comparing string by name:"+tempD);
		return tempD;
	}

}
