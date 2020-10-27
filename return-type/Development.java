public class Development
{
  public static String ageDefinition(byte age)
 {
	 System.out.println("Invoked ageDefination()");
	 System.out.println("Age of people=" +age);
	 if(age>0 && age<=5)
	 {
		 System.out.println("The people who are greater than 0 and less than 5 will be child");
		 String child="child";
		 return child;
	 }
	 if(age>=6 && age<=12)
	 {
		 System.out.println("The people who are greater than 6 and less than 12 will be kid"); 
		  String kid="kid";
		 return kid;
	 }
	 if(age>=13 && age<=19)
	 {
		  System.out.println("The people who are greater than 13 and less than 19 will be teen");
		 String teen="teen";
		  return teen;
	 }
	 if(age>=19 && age<=60)
	 {
		  System.out.println("The people who are greater than 19 and less than 60 will be adult");
		   String adult="adult";
		  return adult;
	 }
	 if(age>=61  && age<=100)
	 {
		  System.out.println("The people who are greater than 61 and less than 100 will be old");
		 String  old="old";
		  return old;
	 }
	 String type="age";
	 return type;
	 
 }
 
   
}