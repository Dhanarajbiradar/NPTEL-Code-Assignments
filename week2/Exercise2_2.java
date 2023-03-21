//Complete the code segment to call the method  print() of class given class Printer to print the following.
package week2;

class Printer { 
    
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
    public void print(String s) { 
		System.out.println(s); 
    } 
} 
public class Exercise2_2 {

	public static void main(String[] args) {
		

Printer p = new Printer();



p.print();
p.print("Hi! I am class STUDENT");

    }

}
