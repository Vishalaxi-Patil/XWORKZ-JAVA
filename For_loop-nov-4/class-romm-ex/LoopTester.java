public class LoopTester
{
	public static void main(String[] displays)
	{
		System.out.println("JVM invoked main");
		boolean termination=true;
		for(byte start=0;termination;start++)
		{
			System.out.println("infinte");
			System.out.println(" value of init" +start);
			if(start==3)
			{
				termination=false;
				
			}
		}
	}
}