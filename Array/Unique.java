public class Unique
{
	public static void main(String[] password)
	{
		System.out.println("JVM invoked main method");
		String[] statesNames={"Karnataka","Maharastra","Rajastan","Punjab","Uttar Pradesh","Odisha","Kerala","Haryana","Goa","Bihar","Manipur","Nagaland","Sikkim","Tripura","Tamil Nadu"};
		nameOfStates(statesNames);
		
		
		
		
		
		
		
		
		
		System.out.println("exit of main method");
	}
	public static void nameOfStates(String[] names)
	{
		System.out.println("name of states=" +names);
		int size=names.length;
		System.out.println("Size of array=" +size);
		System.out.println("element @ index 0=" +names[0]);
		System.out.println("element @ index 13=" +names[13]);
		
	}
}
		