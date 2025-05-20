package week2.day1;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test = "changeme";
		
		//convert string to character array
		char[] chars = test.toCharArray();
		
		for(int i =0; i < chars.length; i++) {
			if(i%2 != 0) {
				//convert to uppercase if index is odd
				chars[i] = Character.toUpperCase(chars[i]);
								
			}
			
		}
		for(char c:chars) {
			System.out.print(c);
			
		}
	}

}
