//Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.
package week1;

import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
if(radius<=0)
{
 System.out.println("please enter non zero positive number ");
}
else
{
 perimeter = 2 * Math.PI * radius;
area = Math.PI * radius * radius;
System.out.println(perimeter);
 System.out.println(area);
}
  }
}