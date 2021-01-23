package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.LincenseDAOImp.LincenseDAOImp;
import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.CommonDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {
	public static void main(String[] args) {
		
		Date date=new Date();
		AddressDTO addressDTO=new AddressDTO("Gadag", "Saibaba temple", "Ring road", 582101, "Gouramma", "Karnataka");
		System.out.println(addressDTO);
		
		CommonDTO commonDTO=new CommonDTO("Vishala", 23, date, addressDTO, 9980933246l,Gender.FEMALE, BloodGroup.O_POSITIVE);
		System.out.println(commonDTO);
		
		LicenseDTO licenseDTO=new LicenseDTO();
		licenseDTO.setIdProof(IdProof.ADHAR);
		licenseDTO.setIdProofNo(768654567);
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		licenseDTO.setVehicleType(VehicleType.TWO_WHEELER);
		
		System.out.println(licenseDTO);
		
		LicenseDAO licenseDAO=new LincenseDAOImp();
		licenseDAO.save(licenseDTO);
			
		
	
		
	}

}
