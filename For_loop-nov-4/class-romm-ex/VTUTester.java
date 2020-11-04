public class VTUTester
{
	public static void main(String[] tester)
	{
		System.out.println("JVM invoked main");
		VTU.printMessage();
		
		System.out.println(".........................................................");
		
		String valueAtIndex0=tester[0];
		int number=Integer.parseInt(valueAtIndex0);
		VTU.printMessage(number);
		
		System.out.println(".........................................................");
		
		VTU.groupMessageAndLoop();
		
		
	}
}