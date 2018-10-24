package Basics;

import java.util.Scanner;

public class charactersReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ask user to enter string
		System.out.println("Please enter a String: ");
		
		//scan and display the string
		String originalString=callScan();
		System.out.println("This original string is this :  " + originalString);
		
		//reverse and display the string
		String reversedString=callReverseString(originalString);		
		String reversedString2=callReverseString2(originalString);
		//String originalString="this is a string";
				
		System.out.println("This reversed character string is this :  " + reversedString.trim());
		System.out.println(reversedString.getClass().getTypeName().contains("String"));
		
	}
	
	private static String callReverseString(String originalString) {
		// TODO Auto-generated method stub
		String reversedString="";
		System.out.println("the lenght of string array is: " + originalString.length());
		for (char tempChar: originalString.toCharArray()) {
					reversedString=tempChar+reversedString;
				}
		return reversedString;
	}
	
	private static String callReverseString2(String originalString) {
		// TODO Auto-generated method stub
		String reversedString="";
		System.out.println("the lenght of string array is: " + originalString.length());
		for (char tempChar: originalString.toCharArray()) {
					reversedString=tempChar+reversedString;
				}
		return reversedString;
	}

	public static String callScan() {
		Scanner scan1= new Scanner(System.in);
		String userString = scan1.nextLine();
		scan1.close();
		return userString;		
	}

}
