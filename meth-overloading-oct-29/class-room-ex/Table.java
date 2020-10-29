public class Table
{
	public static void holding(String thing)
	{
		System.out.println("invoked holding");
		System.out.println("arg things::" +thing);
		
	}
	//chnage in parameter
	//no of parameters
	public static void holding(String something,String noOfPlates)
	{
		System.out.println("Invoked holding with two parameter");
		System.out.println("String and String");
		System.out.println("arg1 something::" +something);
		System.out.println("arg2 noOfPlates::" +noOfPlates);
		
	}
	//change in data type of the parameters
	public static void holding(String something,int noOfPlates)
	{
		System.out.println("Invoked holding with two parameter of different datatype");
		System.out.println("String and int");
		System.out.println("arg1 something::" +something);
		System.out.println("arg2 noOfPlates::" +noOfPlates);
	}
	//change in sequence of parameters
	public static void holding(int noOfPlates,String something)	
	{
		System.out.println("Invoked holding with two parameter of changing sequence");
		System.out.println("int and string");
		System.out.println("arg1 noOfPlates::" +noOfPlates);
		System.out.println("arg2 something::" +something);
  		}
	
}
