public class Gallery
{
	public static void main(String[] photos)
	{
		System.out.println("JVM invoked main,doing switch");
		System.out.println("command line argumens" +photos);
		
		String storeIn=photos[0];
		System.out.println("storeIn value from arg" +storeIn);
		switch(storeIn)
		{
		     case "private":
			 System.out.println("store images in private");
			 System.out.println("Stored on nov 7");
			 break;
			 
			 case "public":
			 System.out.println("store images in public");
			 System.out.println("Stored on oct 1");
			 break;
			 
			 case "cloud":
			 System.out.println("Store images in cloud");
			 System.out.println("stored on nov 10");
			 break;
			 
			 default:
			 System.out.println("cannot store images");
		}
	}
}