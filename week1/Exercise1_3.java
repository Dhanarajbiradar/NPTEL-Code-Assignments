//Complete the code segment to find the perimeter and area of a circle given a value of radius.
package week1;

import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
int result=1;
int i=0;
while(result<=n)
	 {
	  if(i%2==0)
	  {
		 if(i%3==0)
		 {
			 sum=sum+i;
			
         }			
		 result=result+1; 
	  }
	  i=i+1;
	 }
      System.out.println(sum);
 }
}