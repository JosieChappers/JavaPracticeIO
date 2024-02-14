// use a library above the public class
import java.util.Scanner; // This library is needed for input


public class JavaPracticeIO {

	public static void main(String[] args) {
		
		//This is an output example	
		System.out.println("Hello World!");
		
		//This is a variable used for output
		String toPrint = "What is your favourite colour?";
		
		System.out.println(toPrint);
		
		//Input example
		Scanner input = new Scanner(System.in);
		//this variable is a Scanner type instead of a string or integer. It is an object
		//the new means we are allocating memory to the new
		String colourChoice = input.nextLine(); //input here is the variable name which is saved in colourChoice
		System.out.println("Ah, I like "+  colourChoice+ " too");	
		
		
	}
	
	
	
}
