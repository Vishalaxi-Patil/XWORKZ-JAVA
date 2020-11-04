public class Country
{
	public static void main(String[] countryName)
	{
		System.out.println("JVM invoked main");
		System.out.println("This program will print all the arguments of the main method");
		for(int count=0;count<countryName.length;count++)
		{
			System.out.println("country name=" +count);
			String mainMethodArguments=countryName[count];
			System.out.println("name of the country=" +mainMethodArguments);
			
		}
		System.out.println("Exit::main");
	}
}