public class TableTester
{
	public static void main(String[] somethings)
	{
		System.out.println("JVM Invoked main");	
		System.out.println("main method args length" +somethings.length);
		
		String book="Comic";
		Table.holding(book);
		Table.holding(book,"pen");
		Table.holding(56,"bottle");
		Table.holding("bottle",6);
		System.out.println("Exit :: main");
		
	}
}