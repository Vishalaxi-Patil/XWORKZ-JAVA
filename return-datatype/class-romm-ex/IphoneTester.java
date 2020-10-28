public class IphoneTester
{
	public static void main(String[] models)
	{
		System.out.println("JVM invoked main");
		Iphone.call();
		System.out.println("Return value from call");
		
		String sandesha=Iphone.message();
		System.out.println("return value from message" +sandesha);
		
		

		System.out.println("Exit :: main");
	}
}