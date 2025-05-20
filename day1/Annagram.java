package week2.day1;

import java.util.Arrays;

public class Annagram {
	
	public static boolean anagramChecker(String stringOne, String stringTwo){
		
		//convert to lower case
		stringOne = stringOne.replaceAll("\\s","").toLowerCase();
		stringTwo = stringTwo.replaceAll("\\s","").toLowerCase();
		
		//Length of the string must match
		if(stringOne.length() != stringTwo.length()) {
			System.out.println("Length not match");
			return false;
		}
		
		//convert to character array ==> Example: "silent" becomes ['s', 'i', 'l', 'e', 'n', 't']
		char[] arr1 = stringOne.toCharArray();
		char[] arr2 = stringTwo.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//return array value
		return Arrays.equals(arr1, arr2);
				
		
	}
	
	
	public static void main(String[] args) {
		
		//provide two input string
		String stringOne = "silent";
		String stringTwo = "listen";
		
		if(anagramChecker(stringOne, stringTwo))
		{
			System.out.println(stringOne +" and " + stringTwo + " are Anagram");
		}
		else
		{
			System.out.println(stringOne +" and " + stringTwo + " are Not Anagram");
		}
		
		
	}

}
