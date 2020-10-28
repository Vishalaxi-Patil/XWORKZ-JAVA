public class Age
{
	public static void main(String[] people)
	{
		System.out.println("JVM invoked main");
		String ageInString=people[0];
		byte age=Byte.parseByte(ageInString);
		Development.ageDefinition(age);
		System.out.println("EXIT::main()");
	}
}
		