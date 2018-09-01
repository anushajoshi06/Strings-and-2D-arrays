/*Given an NxM 2D array, you need to find out which 
row or column has largest sum (sum of its elements)
 overall amongst all rows and columns.*/
public class Solution {

	
	public static void findLargest(int input[][]){
		
		
boolean row=true;
      int largestSum=Integer.MIN_VALUE;
      int num=0;
      
      for(int i=0; i<input.length; i++)
      {
        int rowSum=0;
        for(int j=0;j<input[0].length;j++)
        {
          rowSum+=input[i][j];
        }
        if(rowSum>largestSum)
        {
          largestSum=rowSum;
          num=i;
        }
      }
      
      for(int j=0;j<input[0].length;j++)
      {
        int colSum=0;
        for(int i=0;i<input.length;i++)
        {
          colSum+=input[i][j];
        }
        if(colSum>largestSum)
        {
          largestSum=colSum;
          num=j;
          row=false;
        }
      }
      if(row)
      {
        System.out.println("row"+" "+num+" "+largestSum);
      }
      else{
        System.out.println("column"+" "+num+" "+largestSum);
      }

	}

	
}
