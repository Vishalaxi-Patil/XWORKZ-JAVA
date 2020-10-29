public class Place
{
	public static String placeName(int distance)
	{
		System.out.println("Invoked placeName()");
		System.out.println("distance::" +distance);
		if(distance==150)
		{
			System.out.println("Distance from gadag to banglore");
			return "gadag to banglore";
			
		}
		return "place not in earth";
		
	}
}