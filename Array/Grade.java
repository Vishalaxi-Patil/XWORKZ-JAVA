public class Grade
{
	public static void main(String[] laptop)
	{
		System.out.println("Invoked main method by JVM");
		arrayOfGrade();
		System.out.println("exit main method by JVM");
	}
     public static void arrayOfGrade()
	 {
		 System.out.println("INvoked arrayOfGrade");
		 char sslcGrade='A';
		 char pucGrade='A';
		 char frstSem='A';
		 char secSem='B';
		 char thirdSem='B';
		 char fourthSem='A';
		 char fifthSem='B';
		 char sixththSem='A';
		 char sevemthSem='A';
		 char eightSem='A';
		 
		 char[] grade={sslcGrade,pucGrade,frstSem,secSem,thirdSem,fourthSem,fifthSem,sixththSem,sevemthSem,eightSem};
		 int sizeOfArray=grade.length;
		 System.out.println("Total size of array=" +sizeOfArray);
		 
		 char elementIndex0=grade[0];
		 System.out.println("Element at Index Zero=" +elementIndex0);
		 char elementIndex8=grade[8];
		 System.out.println("Element at Index eighth=" +elementIndex8);
	 }
}
		 
		 
		 
		 