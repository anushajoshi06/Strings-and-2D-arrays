
public class Solution {
	
	public static String minLengthWord(String input){
		
		
String[] words = input.split(" ");
    
    
    String shortest = words[0];

    for(int i=0;i<words.length;i++){
      
        if(words[i].length() < shortest.length())
            shortest = words[i];
    }
    return shortest ;
	}
}
