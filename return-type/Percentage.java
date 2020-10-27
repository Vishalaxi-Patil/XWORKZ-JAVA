public class Percentage
{
  public static String report(double percentage)
{
   System.out.println("invoked report()");
   if(percentage>=60 && percentage<=75)
   {
	   System.out.println("first class");
	   return "A";
   }
   if(percentage>=50 && percentage<=60)
   {
	   System.out.println("second class");
	   return "B";
   }
   if(percentage>=40 && percentage<=50)
   {
	   System.out.println("first class");
	   return "C";
   }
   String perc="per";
   return perc;

}
}