public class Percentage
{
	public static void main(String[] per)
	{
		System.out.println("Invoked main method by JVM");
		arrayOfPercentage();
		System.out.println("exiting main method by JVM");
	}
	public static void  arrayOfPercentage()
	{
		System.out.println("invoked arrayOfPercentage");
		float sslcPercentage=64.32f;
		float pucPercentage=72.16f;
		float degreeCgpa=6.7646f;
		
		float[] percentages={sslcPercentage,pucPercentage,degreeCgpa};
		int sizeOfArray=percentages.length;
		System.out.println("Total size of an Array=" +sizeOfArray);
		float elementIndex0=percentages[0];
		System.out.println("Element at Index Zero=" +elementIndex0);
		float elementIndex1=percentages[1];
		System.out.println("Element at Index one=" +elementIndex1);
		float elementIndex2=percentages[2];
		System.out.println("Element at Index 2=" +elementIndex2);
	}
}
		
		
		