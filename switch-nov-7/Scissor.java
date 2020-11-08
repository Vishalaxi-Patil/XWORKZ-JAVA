public class Scissor
{
	public static void main(String[] value)
	{
		System.out.println("JVM invoked main");
		String argvalues=value[0];
		int cmdLineArg=Integer.parseInt(argvalues);
		System.out.println("Giving values at runtime::" +cmdLineArg);
		switch(cmdLineArg)
		{
			case 1:
			System.out.println("case 1 is matched");
			break;
			
			case 2:
			System.out.println("case 2 is matched");
			break;
			
			case 3:
			System.out.println("case 3 is matched");
			break;
			
			default:
			System.out.println("case not matched");
			
		}
	}
}