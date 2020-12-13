package com.xworkz.data.dto;


	public class ICU {
		private boolean ventilatorAvailable;
		private int price;
		private boolean tvAvailable;
		private ICUAdmissionDetails icuAdmissionDetails;
		
		public ICU()
		{
			System.out.println("ICU Default constructor is called");
		}
		public ICU(boolean ventilatorAvailable,int price,boolean tvAvailable)
		{
			System.out.println("ICU constructor is called with 3 parameter");
			this.ventilatorAvailable=ventilatorAvailable;
			this.price=price;
			this.tvAvailable=tvAvailable;
		}
		public void ICUAdmissionDetails(String patientName,String severity,String doctorName,String nurseAssigned )
		{
			if(patientName!=null && severity!=null && doctorName!=null && nurseAssigned!=null)
			{
				System.out.println("Details are validated,can create admission");
			this.icuAdmissionDetails=new ICUAdmissionDetails(patientName, severity, doctorName, nurseAssigned);
			System.out.println("Created admission");
		}else
		{
			System.out.println("Cannot create an admission cause of null");
		}
		}
		public void updateDoctor(String newDoctorName)
		{
			System.out.println(" updateDoctor method is called");
			this.icuAdmissionDetails.setDoctorName(newDoctorName);
		}
		public void updatePrice(int newPrice)
		{
			System.out.println("updatePrice method");
			this.icuAdmissionDetails.setPrice(newPrice);
		}
		public void updateDoctorNameAndNurseAssigned(String newDoctorName,String newNurseName)
		{
			System.out.println("updateDoctorNameAndNurseAssigned method is called");
			this.icuAdmissionDetails.setNurseAssigned(newNurseName);
			this.icuAdmissionDetails.setDoctorName(newDoctorName);
			
		}
		
		public boolean isVentilatorAvailable() {
			return ventilatorAvailable;
		}
		public void setVentilatorAvailable(boolean ventilatorAvailable) {
			this.ventilatorAvailable = ventilatorAvailable;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public boolean isTvAvailable() {
			return tvAvailable;
		}
		public void setTvAvailable(boolean tvAvailable) {
			this.tvAvailable = tvAvailable;
		}
		public ICUAdmissionDetails getIcuAdmissionDetails() {
			return icuAdmissionDetails;
		}
		public void setIcuAdmissionDetails(ICUAdmissionDetails icuAdmissionDetails) {
			this.icuAdmissionDetails = icuAdmissionDetails;
		}
		
		
		
		

	}

	


