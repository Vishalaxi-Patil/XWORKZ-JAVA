public class Iphone
{
	public static boolean call()
	{
		System.out.println("Invoked call()");
		boolean connect=false;
		return false;
	}
	public static String message()
	{
		System.out.println("Invoked message()");
		String msg="The Apple Iphone is a cell phone that works like a computer";
		return msg;
	}
	public static byte charging(double volts)
	{
	System.out.println("Invoked cahrging()");
	System.out.println("volts=" +volts);
	if(volts>3)
	{
		System.out.println("volts is greater than 3");
		return 100;
	}
	if(volts<3 && volts>0)
	{
		System.out.println("volts is greater than 3 and 0");
		return 0;
	}
	return -1;
	}
}