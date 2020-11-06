public class Mobile
{
	private static String unlock="Pin";
	
	//getter
	public static String getUnlock()
	{
		System.out.println("Read only");
		return unlock;
	}
	
	//setter
	public static void setUnlock(String  newUnlock)
	{
		if(newUnlock.equals("fingerPrint") || newUnlock.equals("pattern") || newUnlock=("face") || newUnlock.equals("password"))
		{
			System.out.println("new unlock is::" +newUnlock);
			unlock=newUnlock;
		}
		else{
		    System.out.println("you cannot change the unlock");	
		}
	}
}