import java.util.Scanner;
public class strings_and_methods {

	public static void main(String[] args) {

	StringMethods sm = new StringMethods();
		
		System.out.println("(EX 1) Please enter a word:");//prompt/print code ex 1
		Scanner scnr = new Scanner(System.in);
		String userWord = scnr.nextLine();
		String userCapWord = sm.capitalize(userWord);
		System.out.println(userCapWord);
		
		System.out.println("(EX 2) Please enter a phrase with 'Waldo' in it (case sensitive):");//prompt/print code ex 2
		String userPhrase = scnr.nextLine();
		int indexWaldo = sm.wheresWaldo(userPhrase);
		System.out.println(indexWaldo);
		
		System.out.println("(EX 3) Please enter word one:");//prompt/print code ex 3
		String userWordOne = scnr.nextLine();
		System.out.println("(EX 3) Please enter word two:");
		String userWordTwo = scnr.nextLine();
		String alphabetical = sm.firstThingsFirst(userWordOne, userWordTwo);
		System.out.println(alphabetical);
		
		System.out.println("(EX 4) Please enter string to reverse:");//prompt/print code ex 4
		String userWordToReverse = scnr.nextLine();
		String userWordReversed = sm.reverse(userWordToReverse);
		System.out.println(userWordReversed);
		
		System.out.println("(EX 5) Please enter word A:");//prompt/print code ex 5
		String userWordA = scnr.nextLine();
		System.out.println("(EX 5) Please enter word B:");
		String userWordB = scnr.nextLine();
		String longerWord = sm.soLong(userWordA, userWordB);
		System.out.println(longerWord);
		
		System.out.println("(EX6) Please enter a phrase:");//prompt/print code ex 6
		String userPhrase2 = scnr.nextLine();
		String newSubPhrase = sm.afterMath(userPhrase2);
		System.out.println(newSubPhrase);
		
		System.out.println("(EX7) Please enter a word:");//prompt/print code ex 7
		String userInput = scnr.nextLine();
		sm.letterize(userInput);
		
		System.out.println("EX8) Please enter a phrase:");//prompt/print code ex 8
		String userInput2 = scnr.nextLine();
		String camelCase = sm.toCamelCase(userInput2);
		System.out.println(camelCase);
		
		scnr.close();
	}	 
}
