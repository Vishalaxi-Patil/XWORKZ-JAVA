public class ArithOperation
{
	public static  void operation(int num1,int num2)
	{
		System.out.println("invoked operation with two parameter");
		System.out.println("Addition operation");
		int res1=num1+num2;
		System.out.println("addition two number=" +res1);
	}
	public static  void operation(float num1,float num2)
	{
		System.out.println("invoked operation with two parameter");
		System.out.println("float and flaot");
		System.out.println("Addition operation");
		float res2=num1+num2;
		System.out.println("addition two number=" +res2);
	}
	
	
	public static void operation(int num1,int num2,int num3)
	{
		System.out.println("invoked operation with 3 parameter");
		System.out.println("subtraction of 3 numbers");
		int res3=num1-num2-num3;
		System.out.println("subtraction of 3 numbers=" +res3);
	}
	public static  void operation(int num1,int num2,int num3,int num4)
	{
		System.out.println("invoked operation with 4 parameter");
		System.out.println("Multiplication operation");
		int res4=num1*num2*num3*num4;
		System.out.println("multiplication of four numbers=" +res4);
	}
	public static void main(float num1,int num2)
	{
	   System.out.println("invoked operation with two parameter");
		System.out.println("Division operation");
		float res5=num1/num2;
		System.out.println("Division two number=" +res5);	
		
	}
	
	
	
}