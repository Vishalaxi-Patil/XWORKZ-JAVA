public class ProgLanTester
{
	public static void main(String[] val)
	{
    System.out.println("JVM invoked main");
	String value="C";
	ProgLan enumString=ProgLan.valueOf(value);
	System.out.println("enum values in string::" +enumString);
	System.out.println("Exit::main");
	}
}