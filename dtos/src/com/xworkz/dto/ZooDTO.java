package com.xworkz.dto;

public class ZooDTO implements Cloneable{

	private String name;
	private int noOfAnimals;
	private boolean open;
	private double entryFees;
	private boolean safari;

	public ZooDTO(String name, int noOfAnimals, boolean open, double entryFees, boolean safari) {
		System.out.println("ZooDTO constructor is called");
		this.name = name;
		this.noOfAnimals = noOfAnimals;
		this.open = open;
		this.entryFees = entryFees;
		this.safari = safari;
	}
	public ZooDTO(String name,boolean safari) {
		
		System.out.println("Default ZooDTO");
		this.name=name;
		this.safari=safari;
		
	}

	public String getName() {
		return name;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public boolean isOpen() {
		return open;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public boolean isSafari() {
		return safari;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return 22;
	}

	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", noOfAnimals=" + noOfAnimals + ", open=" + open + ", entryFees=" + entryFees
				+ ", safari=" + safari + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj == this) {
				System.out.println("two objects are pointing to same instance");
				return true;
			} else {
				if (obj instanceof ZooDTO) {
					ZooDTO cast = (ZooDTO) obj;
					if (cast.name != null && cast.getName().equals(this.name)) {
						System.out.println("name is equal");
						return true;
					} else {
						System.out.println("name is not equal");
					}
				}
			}
		}
		System.out.println("obj is null");
		return false;
	}
	@Override
	public  ZooDTO clone() throws CloneNotSupportedException {
		System.out.println("Invoked clone from ZooDTO");
		ZooDTO dto=new ZooDTO(name, safari);
		this.name=dto.getName();
		this.safari=dto.isSafari();
		return (ZooDTO)super.clone();
	}

}
