public class InstituteTester
{
	public static void main(String[] names)
	{
		System.out.println("JVM invoked main");
		/* giving value at runtime
		String storeIn=names[0];
		String num=InstituteFinder.lowestAndBestUsingString(storeIn);
		System.out.println("storeIn value from arg" +num);
		*/
		InstituteFinder.lowestAndBestUsingString("ABC");
		String instituteName="ABC";
		Institute enumInstituteName=Institute.valueOf(instituteName);
		InstituteFinder.lowestAndBestUsingEnum(enumInstituteName);
		System.out.println("Exit::main");
		
        
	}
}