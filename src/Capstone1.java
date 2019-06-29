import java.util.Scanner;
public class Capstone1 {

	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput;
		String userReloop;
		String translateWord;
		
		
		do {
			System.out.println("Welcome to Grand Circus' Pig Latin Translator!\n");
			
			System.out.println("Please enter your phrase to be translated: ");		
			
			userInput = scan.nextLine().toLowerCase();
			translateWord = pigLatin(userInput);
			
			
			System.out.println("The Pig Latin version of your word is: " + translateWord + ".");
			System.out.println("Would you like to keep going?(y/n)");
			userReloop = scan.nextLine();
			
		} while (userReloop.equalsIgnoreCase("y"));
		
		boolean isValidChoice = userReloop.matches("^[ynYN]$");
		
		
		while (!isValidChoice) {
			System.out.println("That is not a valid option");
			System.out.println("Keep going?");
			userReloop = scan.nextLine();
		isValidChoice = userReloop.matches("^[ynYN]$");
		}
	
	if (userReloop.equalsIgnoreCase("n") == true) {
		System.out.println("Thank you for playing!");
		scan.close();
	}		

}
		

	public static String pigLatin(String input) {
		String newWord = "";
		String word = input;
		if(Character.toString(input.charAt(0)).matches("^[aeiou]$")) { 
			newWord = input.concat("w");
			System.out.println("Vowel newWord: " + newWord);
		} else {
			while(!Character.toString(word.charAt(0)).matches("^[aeiou]$")) { 
				
				String charToString = Character.toString(word.charAt(0)); 
				char[] wordToArray = word.toCharArray(); 
				wordToArray[0] = ' ';
				newWord = String.valueOf(wordToArray); 
				newWord = newWord.trim().concat(charToString);
				word = newWord;
			}
		}
		newWord +="ay";
		return newWord;
	}

}

		
