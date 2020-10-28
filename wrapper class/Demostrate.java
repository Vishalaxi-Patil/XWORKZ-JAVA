public class Demostrate
{
	public static void main(String[] example)
	{
		System.out.println("JVM invoked main");
		System.out.println("This program will convert String to all primitive data type");
		
		String numOfkeyboard="104";
		byte convertNumOfkeyboard=Byte.parseByte(numOfkeyboard);
		System.out.println("converting from String to Byte::" +convertNumOfkeyboard);
		
		String numOfDist="104";
	    short convertNumOfDist=Short.parseShort(numOfDist);
		System.out.println("converting from String to Short::" +convertNumOfDist);
		
        String numOfItCompBang="67000";
	    int convertNumOfItCompBang=Integer.parseInt(numOfItCompBang);
		System.out.println("converting from String to Int::" +convertNumOfItCompBang);
		
		String versionOfJava="1.8";
	    float convertVersionOfJava=Float.parseFloat(versionOfJava);
		System.out.println("converting from String to Float::" +convertVersionOfJava);
		
		
		
		
		
		
		
		
		
	}
} 
