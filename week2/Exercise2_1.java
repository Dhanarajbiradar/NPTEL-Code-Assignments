//Complete the code segment to call the method  print() of class School first and then call print() method of class Student.
package week2;
class School { 
    
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 

class Student { 
	
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}
public class Exercise2_1 {

	public static void main(String[] args) {
		
		
				Student student = new Student();

			
				School school = new School();

				
				school.print();

		                
				student.print();

	}

}
