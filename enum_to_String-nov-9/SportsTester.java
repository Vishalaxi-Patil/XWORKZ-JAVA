public class SportsTester
{
	public static void main(String[] num)
	{
		System.out.println("JVM invoked main");
		//converting enumto string
		System.out.println("CONVERTING ENUM TO STRING*********************************************");
		String val="KHOKHO";
		Sports conEnumTOString=Sports.valueOf(val);
		System.out.println("values of enum::" +conEnumTOString);
		
		//accesing length of enum using values
		System.out.println("USING VALUES() ACCSESS LENGTH******************************************");
		Sports[] allSports=Sports.values();
		System.out.println("size of enum::" +allSports.length);
		
		//use for loop to access all the enum values and also print them
		System.out.println("*************************************************************************");
		for(int start=0;start<allSports.length;start++)
		{
			System.out.println("Index numbers::" +start);
			Sports sportvalue=allSports[start];
			System.out.println("Index values::" +sportvalue);
		}
		
		System.out.println("Exit::main");
		
		
	}
}