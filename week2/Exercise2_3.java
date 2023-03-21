//Complete the code segment to call print() method of class Question by creating a method named ‘student()’.
package week2;

public class Exercise2_3 {

	public static void main(String[] args) {
		
		Exercise2_3 q=new Exercise2_3();
		q.student();
    }
	
	
	void print(Exercise2_3 object){
		System.out.print("Well Done!");
	}

	
	void student(){
	
		print(this);
	}

}