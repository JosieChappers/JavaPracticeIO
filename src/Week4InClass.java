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
		System.out.println(name.toLowerCase());
		
		
		//5. replace
		//For three of the strings (your choice), replace all instances 
		//of one vowel with a different vowel. 
		
		//Do this BEFORE changing the case.
		String somethingOrOther = "I am finding it hard to get to cruising altitude today.";
		
		String someOtherThing = somethingOrOther.replace('i', 'z');

		System.out.println(somethingOrOther);
		System.out.println(someOtherThing);
		
		
		// 6. 	length
		//print out the length of the final string.
		System.out.println(somethingOrOther.length());
		// we need to have the brackets after the instruction 
		
		//7 substring
			//1.For three of the strings (your choice), remove the first two letters of the string. Do this BEFORE adding them all together and printing them out.
			String numbers = "0123456789";
			
			// Substring from 2 to end
			System.out.println(numbers.substring(2));
			//substring from 2 to 7
			System.out.println(numbers.substring(2,8));
			//Index too high
			//System.out.println(numbers.substring(2,12)); 
			//this will give an error message that says that the number is too high for the length. It gives an exception warning.
			//2. For three of the strings (your choice), remove the last two letters of the string. Do this BEFORE adding them all together and printing them out.
			System.out.println(numbers.substring(1,8));
			//3. For three of the strings (your choice), remove the first and last letters of the string. Do this BEFORE adding them all together and printing them out.
			String removedFirst = numbers.substring(2);
					
			System.out.println(removedFirst);
			
			String removedFirst = numbers.substring(2);
		
		
		// 8. extension
		//investigate some of the other string methods on the string reference page on W3 schools, and try them out!
		
		
		
		
	}

}
