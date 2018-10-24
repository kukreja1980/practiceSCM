package Basics;

public class stringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String originalString = "this is a string";
		String reversedString="";
		
		System.out.println("Before reversal - " + originalString);
		String[] newString=originalString.split(" ");
		System.out.println("the lenght of string array is: " + newString.length);
		for (int i=newString.length; i>0; i--) {
//			System.out.println(newString[i-1]);
			reversedString=reversedString.concat(newString[i-1])+ " ";	
		}
		reversedString=reversedString.trim();
		//originalString.substring(0, lastIndex);
		System.out.println("After reversal - " + reversedString);
	}

}
