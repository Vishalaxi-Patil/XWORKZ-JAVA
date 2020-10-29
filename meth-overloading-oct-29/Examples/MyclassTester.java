public class MyclassTester
{
	public static void main(String[] calculation)
	{
		System.out.println("JVM invoked main");
		System.out.println("length of am array::" +calculation);
		Myclass.name("Infosys","TCS");
		Myclass.name("Infosys",1981);
		Myclass.name(1981,"TCS");
        System.out.println("Exit of main");		
		}
}
