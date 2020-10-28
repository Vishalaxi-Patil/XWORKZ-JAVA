public class BatteryTester{
	
	
	public static void main(String[] bats)
	{
		
		System.out.println("JVM invoked main()");
		
		byte chargeValue=Iphone.charging(-45);
		System.out.println("return value from charging()"+chargeValue);
		
		System.out.println("EXIT::main()");
	}
	
	
}