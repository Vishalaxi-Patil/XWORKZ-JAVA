public class Tester
{
	public static void main(String[] action)
	{
		System.out.println("JVM invoked main");
		System.out.println("print value at runtime::"+action );
		 ArithOperation.operation(6,6);
		  ArithOperation.operation(6.5f,6.5f);
		 
		

		ArithOperation.operation(6,6,6);
		ArithOperation.operation(1,2,3,4);
		ArithOperation.operation(2.0f,2);
		
		
		System.out.println("Exit:: main");
	}
}