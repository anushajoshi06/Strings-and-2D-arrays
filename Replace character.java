
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		
char[] c = new char [input.length()]; // O(1);



            c = input.toCharArray(); //assuming it to be O(1)
            for(int i=0;i<c.length;i++)//O(n)
            {
                if(c1==c[i]) // O(1)
                {
                    c[i] = c2; // O(1)
                }
            }

            //for(int i=0;i<c.length;i++)
                //System.out.print(c[i] + "\t");



        String s = String.valueOf(c); //// O(1)

        return s; //// O(1)
	}
}
