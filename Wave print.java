/*Given a two dimensional n*m array,
 print the array in a sine wave order. i.e. 
print the first column top to bottom, next column bottom 
to top and so on.

Sample Input :
3 4
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output :
1 5 9 10 6 2 3 7 11 12 8 4*/
public class Solution {

	
	
	public static void wavePrint(int input[][]){
		
		
if(input.length==0)
{
  return;
  
}
      int numRows=input.length;
      int numCols=input[0].length;
      
      for(int j=0;j<numCols;j++)
      {
        if(j%2==0)
        {
          for(int i=0;i<numRows;i++)
          {
            System.out.print(input[i][j]+" ");
          }
        }
        else
        {
          for(int i=input.length-1;i>=0;i--)
          {
            System.out.print(input[i][j]+" ");
          }
        }
      }
	}

	
}
