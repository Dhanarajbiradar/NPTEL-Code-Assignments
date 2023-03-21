//Complete the code segment to call default constructor first and then any other constructor in the class.
package week2;

public class Exercise2_4 {

	public static void main(String[] args) {
		Answer a = new Answer(10,"MCQ");
	}
}

class Answer{

	Answer(){
		System.out.println("You got nothing.");
	}
	
	Answer(int marks, String type){
		
		this();		
		
		System.out.println("You got "+marks+" for an "+ type);
	}
}

