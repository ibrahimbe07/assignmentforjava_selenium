package week2.day1;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test = "In am an software tester";
		
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			//If index is odd, reverse the word
			if(i%2 != 0) {
				char[] chars = words[i].toCharArray();
				
				//reverse character
				for(int j=chars.length-1; j>0 ; j--) {
					System.out.print(chars[j]);
					
				}
			}
			else {
				System.out.print(words[i]);
			}
			// Add space after each word
			System.out.print(" ");
		}
		
	}

}
