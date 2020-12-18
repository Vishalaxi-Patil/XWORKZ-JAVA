package com.xworkz.aboutstring.string;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Vishalaxi";
		String s2="Vishalaxi";
		String s3=new String("Vishalaxi");
		/**
		 * == operator in java used to compare two object whether they are same
		 */
		if(s1==s3)
		{
			System.out.println("two defferent reference variable to poiniting to the same object");
		}else
		{
			System.out.println("two defferent reference variable to poiniting to the different object");
		}
		/**
		 * .equals operator is used to compare two string.is both string are same return true otherwise false
		 */
		if(s1.equals(s3))
		{
			System.out.println("two defferent reference variable to poiniting to the same object");
		}else
		{
			System.out.println("two defferent reference variable to poiniting to the different object");
		}
		/**
		 * length() property returns length os the array
		 */
		System.out.println(s1.length());
		/**
		 * charAt() returns character at specific position,return type char
		 */
		System.out.println(s1.charAt(4));
		/**
		 * toCharArray() used to convert string to charater of array
		 */
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		/**
		 * boolean isEmpty() will check whether string is empty or not.
		 */
		String s4="Hello";
		String s5="";
		String s6=" ";
		
		
		
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		
		/**
		 * String toUpperCase() used to convert String from lowercase to upper
		 */
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		/**
		 * String concat(String) used to concat two String using +operator and concat
		 */
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s4));
		
		/**
		 *  int compareTo() used compare two strings
		 */
		System.out.println(s1.compareTo(s5));
		/**
		 * codePointAt(int index) used to return unicode of the first character-return type int
		 */
		String s8="Hii";
		System.out.println(s8.codePointAt(0));
		/**
		 * codePointBefore() used to return unicode values of the character before the specified index
		 */
		System.out.println(s8.codePointBefore(1));
		/**
		 * boolean contains() method is used to find out if a string conatins a sequence of characetr
		 */
		System.out.println(s8.contains("ii"));
		
		/**
		 * boolean endWith() method check whether a string ends with specified characters
		 */
		String s9="AiSh";
		System.out.println(s9.endsWith("h"));
		System.out.println(s9.endsWith("a"));
		
		/**
		 * int indexOf() method used to return first position of the frst occurance os specified character(s) in a String
		 * int lastIndexOf() method used to return last position of the frst occurance os specified character(s) in a String
		 */
		String sentence="The expert in anything was once a beginner";
		System.out.println(sentence.indexOf("beginner"));
		System.out.println(sentence.lastIndexOf("beginner"));
		/**
		 * String replace() method is to replace character from old to new
		 */
		System.out.println(s9.replace("S", "s"));
		
		/**
		 * startWith() method is used to check whether a string starts with specified character os not
		 */
		System.out.println(s9.startsWith("Ai"));
		System.out.println(s9.startsWith("ai"));
		/**
		 * trim() method is used to removes whitespaces from both ends of string
		 */
		String s10="     self respect is'nt selfish    ";
		System.out.println(s10.trim());

		
		
	}

}
