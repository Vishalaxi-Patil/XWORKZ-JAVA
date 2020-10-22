public class Vibes
{
	public static void main(String[] celebration)
	{
		System.out.println("JVM inviked main method");
		String nameOfCountry="India";
		countryName(nameOfCountry);
		countryName("Russia");
		countryName(null);
		

		System.out.println("exit from main method");
	}
	public static void countryName(String name)
	{
		System.out.println("Invoked countryName" +name);
		nameOfDevice("Redmi");
		nameOfDevice(null);
		String phone="Samsaung";
		nameOfDevice(phone);
		
	}	
	public static void nameOfDevice(String name)
	{
		System.out.println("Invoked nameOfDevice" +name);
	}
}