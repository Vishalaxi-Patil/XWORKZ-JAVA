public class VTU
{
	public static void printMessage()
	{
		System.out.println("invoked printMessage()");
		for(byte msg=0;msg<=4;msg++)
		{
			System.out.println("shapping the future");
			System.out.println("Message" +msg);
			
		}
		
	}
	public static void printMessage(int loopSize)
	{
		System.out.println("ivoked second time printMessage");
		for(int msg=0;msg<=loopSize;msg++)
		{
			System.out.println("come out from your comfort zone" +msg);
			
		}
	}
	public static void groupMessageAndLoop()
	{
		System.out.println("Invoked groupMessageAndLoop");
		String[] messages={"Good Morning","power Off","Battery Low","update System","clear Hsitory"};
		System.out.println("length of messages" +messages.length);
		 
		 for(int count=0;count<messages.length;count++)
		 {
			 System.out.println("messages with count numbets" +count);
			 String message=messages[count];
			 System.out.println("Display messages" +message);
		 }
		
	}
}