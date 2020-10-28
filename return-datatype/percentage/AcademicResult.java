public class AcademicResult
{
	public static void main(String[] result)
	{
		System.out.println("JVM invoked main");
		String resInString=result[0];
		double res=Double.parseDouble(resInString);
		Percentage.report(res);
        System.out.println("Exit of main::");
		 
	}
}