public class TheaterTester
{
	public static void main(String[] value)
	{
		System.out.println("JVM invoked main");
		System.out.println("********************************************************************************");
		TheaterFinder.bestTheaterUsingSwitch("nandini");
		System.out.println("********************************************************************************");
		String convEnum="NANDINI";
		Theater enumTheaterName=Theater.valueOf(convEnum);
		TheaterFinder.bestTheaterUsingEum(enumTheaterName);
		System.out.println("Exit::::main");
		
	}
}