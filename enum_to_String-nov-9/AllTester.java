public class AllTester
{
	public static void main(String[] num)
    {
		System.out.println("JVM invoked main");
		String value="LINUX";
		OperatingSystem enumString=OperatingSystem.valueOf(value);
		System.out.println("enum single value::" +enumString);
		
		OperatingSystem[] allOs=OperatingSystem.values();
		System.out.println("size of enum::" +allOs.length);
		
		for(int start=0;start<allOs.length;start++)
		{
			System.out.println("index number::" +start);
			OperatingSystem allValue=allOs[start];
			System.out.println("Index value::" +allValue);
			
		}
		System.out.println("*******************************************************");
		
		 Laptop[] allLaptop=Laptop.values();
		 System.out.println("Size of enum laptop::" +allLaptop.length);
		 
		 for(int start=0;start<allLaptop.length;start++)
		{
			System.out.println("index number::" +start);
		    Laptop allValue=allLaptop[start];
			System.out.println("Index value::" +allValue);
			
		}
		
		System.out.println("*******************************************************");

        Ide[] allIde=Ide.values();
		 System.out.println("Size of enum laptop::" +allIde.length);
		 
		 for(int start=0;start<allIde.length;start++)
		{
			System.out.println("index number::" +start);
		    Ide allValue=allIde[start];
			System.out.println("Index value::" +allValue);
			
		}	

         System.out.println("*******************************************************");
         Branch[] allBranch=Branch.values();
		 System.out.println("Size of enum laptop::" +allBranch.length);
		 
		 for(int start=0;start<allBranch.length;start++)
		{
			System.out.println("index number::" +start);
		    Branch allValue=allBranch[start];
			System.out.println("Index value::" +allValue);
			
		}
        System.out.println("*******************************************************");
        XworkzCourses[] AllXworkzCourses=XworkzCourses.values();
        System.out.println("Size of enum XworkzCourses::" +AllXworkzCourses.length);

        for(int start=0;start<AllXworkzCourses.length;start++)
		{
			System.out.println("Index number::" +start);
			XworkzCourses allValue=AllXworkzCourses[start];
			System.out.println("Index value::" +allValue);
		}
		System.out.println("Exit::::::main");
        		
		 
	}
}