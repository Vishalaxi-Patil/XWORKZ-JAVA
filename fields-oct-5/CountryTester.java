public class CountryTester
{
	public static void main(String[] field)
	{
		System.out.println("JVM invoked main");
		Country.countryName="india";
		System.out.println("Name of the country=" +Country.countryName);
		Country.countryCode=91;
		System.out.println("country code of "+Country.countryName+ " is::" +Country.countryCode);
		Country.countryPopulation=1384641584;
		System.out.println("country population of "  +Country.countryName+ " is::" +Country.countryPopulation);
		String  countriesNo="195";
		short converCountryNo=Short.parseShort(countriesNo);
		System.out.println("Number of countries in the world::" +converCountryNo);
		Country.nationalDrink="Tea";
		System.out.println("national drink of "+Country.countryName+ " is::" +Country.nationalDrink);
		
		
	    
		
	}
}