package com.xworkz.license.dto;

import java.sql.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO{
	
	private IdProof idProof;
	private int idProofNo;
	private VehicleType vehicleType;
	private Date startDate;
	private boolean Disability;
	private boolean commercial;
	
	
	public LicenseDTO() {
		System.out.println("Invoked LicenseDTO");
	}


	public LicenseDTO(String name, int age, Date date, AddressDTO addressDTO, long mobileNo, Gender gender,
			BloodGroup bloodGroup) {
		super(name, age, date, addressDTO, mobileNo, gender, bloodGroup);
		// TODO Auto-generated constructor stub
	}


	public IdProof getIdProof() {
		return idProof;
	}


	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}


	public int getIdProofNo() {
		return idProofNo;
	}


	public void setIdProofNo(int idProofNo) {
		this.idProofNo = idProofNo;
	}


	public VehicleType getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public boolean isDisability() {
		return Disability;
	}


	public void setDisability(boolean disability) {
		Disability = disability;
	}


	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", startDate=" + startDate + ", Disability=" + Disability + ", commercial=" + commercial + "]";
	}


	public boolean isCommercial() {
		return commercial;
	}


	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}
	
	
		
	
	
	
	

}
