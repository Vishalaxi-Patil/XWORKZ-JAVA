public class LaptopTester
{
	public static void main(String[] properties)
	{
		System.out.println("JVM invoked main");
		System.out.println("About JAVA ...............");
		
		Java.javaVersion=15;
		System.out.println("Version of java::" +Java.javaVersion );
		Java.developedYear=1995;
		System.out.println("java developed in the year::" +Java.developedYear);
		Java.developedBy="James Gosling and his team";
		System.out.println("java was developed by::" +Java.developedBy);
		Java.ownedBy="Oracle";
        System.out.println("Java owned by::"  +Java.ownedBy );
        Java.oldName="Ook";
        System.out.println("old name of java::" +Java.oldName);	
  
        System.out.println("..............................................................");
		System.out.println("Information about INDIA");
	    India.population=1384641584;
		System.out.println("population::" +India.population);
		India.foundedBy="Vasco da Gama";
		System.out.println("Founded by::" +India.foundedBy);
		India.ruledBy="Chandragupta Maurya";
		System.out.println("ruled by::" +India.ruledBy);
		India.noOfFlagColour=3;
		System.out.println("number of colours in flag::" +India.noOfFlagColour );
		
		India.fullForm="Independent Nation Declared In August";
		System.out.println("Full form of india::" +India.fullForm);
		
		
		System.out.println("..............................................................");
		
		System.out.println("about meeeeeeeeeeeeeee");
		Human.name="Vishalaxi";
		System.out.println("name::" +Human.name);
		Human.age=23;
		System.out.println("age::" +Human.age);
		Human.height=5.2f;
		System.out.println("Height::" +Human.height);
		Human.birthYear=1998;
		System.out.println("Birth year::" +Human.birthYear);
		Human.gender="Female";
		System.out.println("Gender::" +Human.gender);
		
		
		System.out.println("..............................................................");
		System.out.println("About WATER.........................");
		Water.molecularFormulla="H2O";
		System.out.println("molecularFormulla::" +Water.molecularFormulla);
		Water.boilsAt=100;
		System.out.println("water boils at "+Water.boilsAt+ " degree Celcius");
		Water.boilingPoint=99.97f;
		System.out.println("normal boiling point of water " +Water.boilingPoint+ " degree Celcius");
		Water.state="Liquid";
		System.out.println("State::" +Water.state);
		Water.colour="Colourless";
		System.out.println("Colour::" +Water.colour);
		
		System.out.println("..............................................................");
		System.out.println("About laptop......................................................");
		
		Laptop.osName="Windows";
		System.out.println("name of operating system " +Laptop.osName+ " 10");
		Laptop.ram=8;
		System.out.println("RAM " +Laptop.ram+ "GB");
        Laptop.systemType=64;
		System.out.println("System type " +Laptop.systemType+ "bit");
	    Laptop.computerName="vishalaxi";
		System.out.println("computerName::" +Laptop.computerName);
		Laptop.processorName="Intel core i";
		System.out.println("Processor  name " +Laptop.processorName+ "3");
		
		
		
		
		
		
		
		
	}
}