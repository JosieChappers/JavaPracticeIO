
public class Week4PracticeWork {

	public static void main(String[] args) {

		// Starting strings
		//Make 10 different string variables, called myString1 and so on. Put one to three words in each string. Try to write the strings so that when put together they make a sentence or a few sentences.
		
		String myString1 = "Hello.";
		String myString2 = "It's Wednesday.";
		String myString3 = "What's";
		String myString4 = "occuring?!";
		String myString5 = "I can't wait";
		String myString6 = "to eat my lunch.";
		String myString7 = "But I";
		String myString8 = "need";
		//System.out.println(myString8.toUpperCase());		
		
		String myString9 = "to";
		String myString10 = "RUN!!";
		
		//Create another string variable called combinedString. Add all the other strings together. 
		String combinedString = myString1 + " " + myString2 + " " + myString3 + " " + myString4 + " " + myString5 + " " + myString6 + " " + myString7 + " " + myString8 + " " + myString9 + " " + myString10; 
	
		//Print out the combinedString.
		System.out.println(combinedString);
		
		// toUpperCase
		//Change three of the variables (your choice) to all upper case.
		String combinedString1 = myString1.toUpperCase() + " " + myString2 + " " + myString3 + " " + myString4.toUpperCase() + " " + myString5 + " " + myString6 + " " + myString7.toUpperCase() + " " + myString8 + " " + myString9 + " " + myString10; 
		System.out.println(combinedString1);
		
		//Do this BEFORE adding them all together and printing them out.

		//toLowerCase
		//Change three of the variables (your choice) to all lower case. Do this BEFORE adding them all together and printing them out.
		String combinedString2 = myString1.toUpperCase() + " " + myString2.toLowerCase() + " " + myString3.toLowerCase() + " " + myString4.toUpperCase() + " " + myString5 + " " + myString6 + " " + myString7.toUpperCase() + " " + myString8 + " " + myString9 + " " + myString10.toLowerCase(); 
		System.out.println(combinedString2);
		
		//	replace
		//For three of the strings (your choice), replace all instances of one vowel with a different vowel. Do this BEFORE changing the case.
		String myString11 = myString1.replace('e', 'u');
		System.out.println(myString11);
		
		myString1 = myString1.replace('e', 'u');
		System.out.println(myString1);

	//	System.out.println(someOtherThing);
		
	}

}
