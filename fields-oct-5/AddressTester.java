public class AddressTester
{
   public static void main(String[] names)
   {
	System.out.println(" JVM invoked main");
	
	Short door=Address.doorNo;
	System.out.println("door Number=" +door);
	Address.doorNo=45;
	System.out.println("updated door no=" +Address.doorNo);
	door=56;
	System.out.println("upated form of door=" +door);
	Address.doorNo=100;
	System.out.println("Address number=" +Address.doorNo);
	Address.city="Banglore";
	System.out.println("Address city=" +Address.city);
	Address.street="9th cross";
	System.out.println("Address street=" +Address.street);
	Address.pinCode=582101;
	System.out.println("Address pinCode=" +Address.pinCode);
	
	
	
	
	
	
	System.out.println("Exit :: main");
   }
}
