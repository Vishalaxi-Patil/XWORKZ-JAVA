package com.xworkz.dto;

public class PalaceDTO implements Cloneable{
	
	private String location;
	private String kingName;
	private String queenName;
	
	public PalaceDTO(String location,String kingName,String queenName) {
		this.location=location;
		this.kingName=kingName;
		this.queenName=queenName;
	}
	//calling of constructor within another constructor
	public PalaceDTO() {
		this("Kuradgi","Kallanagouda","Jayashree");
		System.out.println("PalaceDTO called as default");
		
	}
	public String getLocation() {
		return location;
	}
	public String getKingName() {
		return kingName;
	}
	public String getQueenName() {
		return queenName;
	}
	
	@Override
	public int hashCode() {
		  System.out.println("hashCode");
		return 16;
	}
	@Override
	public String toString() {
		return "PalaceDTO [location=" + location + ", kingName=" + kingName + ", queenName=" + queenName + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(obj!=null) {
			System.out.println("obj is not null");
			if(this==obj) {
				System.out.println("two object are pointing to same instance");
				return true;
				
			}else {
				if(obj instanceof PalaceDTO) {
					PalaceDTO cast=(PalaceDTO)obj;
					if(cast.getLocation()!=null && cast.getLocation().equals(this.location)) {
						System.out.println("Location is same");
						return true;
						
					}else {
						System.out.println("name is not equal");
					}
				}
			}
		}
		System.out.println("obj is null");
		return false;
	}
	@Override
	public PalaceDTO clone() throws CloneNotSupportedException {
		  System.out.println("Object clone is called");
		return (PalaceDTO)super.clone();
	}
	
	
	

}
