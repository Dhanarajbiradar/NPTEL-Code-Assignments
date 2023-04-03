/*Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.


Example:

Input: n = 5

-------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6
*/
package week1;

import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
int z = s.nextInt();
int result = 0;
if(x >= y && x >= z)
        {
            result=x;
        }
        else if(y >= z)
        {
            result=y;
        }
        else
        {
            result=z;
        }
     //Evaluation code 
System.out.println(result);
 }
}