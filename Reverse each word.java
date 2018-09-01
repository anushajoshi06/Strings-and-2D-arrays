public class Solution {

	
	public static String reverseEachWord(String input) {
		
      String temp="",t="";
String[] words = input.split(" ");
      for(int i=0;i<words.length;i++){
        for(int j=words[i].length()-1;j>=0;j--){
          temp=temp+words[i].charAt(j);
          
        }
        words[i]=temp;
        temp="";
      }
     for(int k=0; k<words.length; k++){
      
       t=t+words[k];
       t=t+" ";
     }
    return t;
  
	}
}
