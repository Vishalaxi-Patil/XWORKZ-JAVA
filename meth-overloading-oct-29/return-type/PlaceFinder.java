public class PlaceFinder
{
	public static void main(String[] names)
	{
		System.out.println("JVM invoked main");
		String placeDistanceInKm=names[0];
		int dis=Integer.parseInt(placeDistanceInKm);
		Place.placeName(dis);
		System.out.println("Exit::main");
		
	}
}