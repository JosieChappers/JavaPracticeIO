import java.util.Scanner;


public class Week4InClass {

	public static void main(String[] args) {
	//string manipulation
		
		Scanner console = new Scanner(System.in);
		
		String s1 = "Fife";
		String s2 = "College";
		// The + operator (concatenation)

		String s3 = s1 + " " + s2;
		
		System.out.println(s3);
		
		//Mixing Strings and Integers
		s3 = s1 + s2 + 2;
		System.out.println(s3); // 2 in inferred as being used as a string
		
		//Concat method
		s3 = s1.concat(s2);
		System.out.println(s3);
		//to concat and include a space , nest them
		s3 = s1.concat(" ".concat(s2));
		System.out.println(s3);
		
		//Uppercase / lowercase conversion
		String name;
		System.out.println("Enter your name please:");
		name = console.nextLine();
		//Returns a new string, the original remains the same value
		System.out.println(name.toUpperCase());
		//This shows that the original remains the same
		System.out.println(name);
		

		
		
	}

}
