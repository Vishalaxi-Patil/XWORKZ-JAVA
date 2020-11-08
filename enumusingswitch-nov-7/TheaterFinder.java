public class TheaterFinder
{
	public static void bestTheaterUsingSwitch(String theaterName)
    {
		System.out.println("Invoked bestTheaterUsingSwitch");
		switch(theaterName)
		{
			case "nandini":
			System.out.println("theater name::" +theaterName);
			break;
			
			case "ganga":
			System.out.println("theater name::" +theaterName);
			break;
			
			case "pvr":
			System.out.println("theater name::" +theaterName);
			break;
			
			default:
			System.out.println("Theater name not matched");
			
		}
		System.out.println("Exit::bestTheaterUsingSwitch");
		
	}
	public static void bestTheaterUsingEum(Theater theaterName)
    {
		System.out.println("Invoked bestTheaterUsingEum");
		System.out.println("cmd line argument::" +theaterName);
		switch(theaterName)
		{
			case LAVANYA:
			System.out.println("theater name::" +theaterName);
			break;
			
			case NANDINI:
			System.out.println("theater name::" +theaterName);
			break;
			
			case PVR:
			System.out.println("theater name::" +theaterName);
			break;
			
			
			
		}
		
		System.out.println("Exit::bestTheaterUsingEum");
	}
}