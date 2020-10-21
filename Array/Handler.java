public class Handler
{
	public static void main(String[] hand)
	{
		System.out.println("Invoked main method by JVM");
		arrayOfBoolean();
		System.out.println("Exit of main method by JVM");
	}
	public static void arrayOfBoolean()
	{
		System.out.println("invoked arrayOfBoolean");
		
		boolean milkIsBlack=false;
		boolean earthIsFlat=false;
		
		boolean[] handler={milkIsBlack,earthIsFlat};
		int sizeOfArray=handler.length;
		System.out.println("Length of an array=" +sizeOfArray);
		
		boolean elementIndex0=handler[0];
		System.out.println("element at Index zero=" +elementIndex0);
		boolean elementIndex1=handler[1];
		System.out.println("element at Index one=" +elementIndex1);
	}
}
	