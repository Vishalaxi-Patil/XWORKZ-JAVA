public class Myclass
{
	//no of parameters
	public static void name(String companyName1,String companyName2)
	{
		System.out.println("invoked name with two parameter");
		System.out.println("String and String");
		System.out.println("It company name 1::" +companyName1);
		System.out.println("It company name 2::" +companyName2);
	}
	public static void name(String companyName,int establishedDateInfosys)
	{
		System.out.println("invoked name with two parameter");
		System.out.println("String and int");
		System.out.println("It company name 1::" +companyName);
		System.out.println("Infosys company established date::" +establishedDateInfosys);
	}
	public static void name(int establishedDateTcs,String companyName)
	{
		System.out.println("invoked name with two parameter");
		System.out.println("int and string");
		System.out.println("It company name 1::" +companyName);
		System.out.println("TCS company established date::" +establishedDateTcs);
		System.out.println("It company name ::" +companyName);
	}
}
