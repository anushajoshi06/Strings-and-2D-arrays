/*Given a 2D integer array of size M*N, 
find and print the sum of ith row elements separated by space.*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
 int n,m;
    //Scanner Class to get user input
    Scanner scan = new Scanner(System.in);
  //  System.out.print("Enter the size of Array (nXn). i.e., n = ");
    //taking input of Array size 
    n = scan.nextInt();
      m = scan.nextInt();
    //Initilizing Array with nXn size
    int Array[][] = new int[n][m];
    //Initilizing Row array to store sum of each row elements
    int row[] = new int[n];
    //Initilizing column array to store sum of each column elements
    int column[] = new int[m];
    //Taking input from user of Array data
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        //System.out.print("Enter data of Array["+i+"]["+j+"] : ");
        Array[i][j] = scan.nextInt();
      }
    }
    //Calculating sum of each row elements and storing that to row array.
    for(int i=0;i<n;i++){
      int sum = 0;
      for(int j=0;j<m;j++){
        sum = sum + Array[i][j];
      }
      row[i] = sum;
    }
      for(int i=0;i<n;i++){
      System.out.print(row[i]+" ");
    }
	}
}
