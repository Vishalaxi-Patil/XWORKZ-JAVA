 public class CarBrand
    {
     public static String[] getBrands()
	 {
        System.out.println("invoked of type string method");
        String[] carNames={"Toyota","Kia","Honda","Mazda","Mini"};
        System.out.println("length of the array=" +carNames.length);
        for(int count=0;count<carNames.length;count++)
        {
			System.out.println("car number=" +count);
			String names=carNames[count];
			System.out.println("name of the car brands=" +names);
		}
		return carNames;
	 }
	 public static void main(String[] name)
	 {
		 System.out.println("JVM invoked main");
		 CarBrand.getBrands();
	 }

}