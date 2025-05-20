package week2.day1;

public class RemoveDuplicate {
	public static void main(String[] args) {
		//Input String
        String text = "We learn Java basics as part of java sessions in java week1";
        
        //Split text into words
        String[] words = text.split(" ");
        System.out.print(words.toString());
        //Loop to find duplicates
        for(int i = 0; i < words.length; i++) {
        	int count = 1; // reset count for each word
        	
        	//Compare words ignoring case
        	for(int j = i+1; j < words.length; j++) {
        		if(words[i] != words[j]) {
        			words[j] = "";
        			count++;
        			
        		}
        		
        		
        		
        	}
        	if (count > 1) {
                System.out.println("Duplicate word found: " + words[i]);
            }
        	
        }

		
	}

}
