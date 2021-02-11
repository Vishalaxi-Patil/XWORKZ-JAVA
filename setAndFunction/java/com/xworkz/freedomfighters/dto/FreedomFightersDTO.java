package com.xworkz.freedomfighters.dto;

public class FreedomFightersDTO {

	private String name;
	private String birthPlace;
	private Gender gender;

	public enum Gender {
		FEMALE, MALE
	}

	public FreedomFightersDTO() {
		System.out.println("Created object");
	}

	public FreedomFightersDTO(String name, String birthPlace, Gender gender) {
		this.name = name;
		this.birthPlace = birthPlace;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getBirthPlace() {
		return birthPlace;

	}

	public Gender getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int hashCode() {
		return 12;
	}

	public boolean equals(Object obj) {
		//System.out.println("overide equal");
		if (obj == null) {
			return false;

		}else {
			if(obj instanceof FreedomFightersDTO) {
				FreedomFightersDTO cast=(FreedomFightersDTO)obj;
				if(this.name!=null && this.name.equals(cast.getName())) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "FreedomFightersDTO [name=" + name + ", birthPlace=" + birthPlace + ", gender=" + gender + "]";
	}
}
