import java.util.Scanner;
public class strings_and_methods {

	public static void main(String[] args) {

		System.out.println("(EX 1) Please enter a word:");//prompt/print code ex 1
		Scanner scnr = new Scanner(System.in);
		String userWord = scnr.nextLine();
		String userCapWord = capitalize(userWord);
		System.out.println(userCapWord);
		
		System.out.println("(EX 2) Please enter a phrase with 'Waldo' in it (case sensitive):");//prompt/print code ex 2
		String userPhrase = scnr.nextLine();
		int indexWaldo = wheresWaldo(userPhrase);
		System.out.println(indexWaldo);
		
		System.out.println("(EX 3) Please enter word one:");//prompt/print code ex 3
		String userWordOne = scnr.nextLine();
		System.out.println("(EX 3) Please enter word two:");
		String userWordTwo = scnr.nextLine();
		String alphabetical = firstThingsFirst(userWordOne, userWordTwo);
		System.out.println(alphabetical);
		
		System.out.println("(EX 4) Please enter string to reverse:");//prompt/print code ex 4
		String userWordToReverse = scnr.nextLine();
		String userWordReversed = reverse(userWordToReverse);
		System.out.println(userWordReversed);
		
		System.out.println("(EX 5) Please enter word A:");//prompt/print code ex 5
		String userWordA = scnr.nextLine();
		System.out.println("(EX 5) Please enter word B:");
		String userWordB = scnr.nextLine();
		String longerWord = soLong(userWordA, userWordB);
		System.out.println(longerWord);
		
		System.out.println("(EX6) Please enter a phrase:");//prompt/print code ex 6
		String userPhrase2 = scnr.nextLine();
		String newSubPhrase = afterMath(userPhrase2);
		System.out.println(newSubPhrase);
		
		System.out.println("(EX7) Please enter a word:");//prompt/print code ex 7
		String userInput = scnr.nextLine();
		letterize(userInput);
		
		scnr.close();
	}

	public static String capitalize (String word)//method 1 capitalize
	{
		String capWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return capWord;
	}

	public static int wheresWaldo (String phrase)//method 2 wheresWaldo
	{
		int index = phrase.indexOf("Waldo");
		return index;
	}

	public static String firstThingsFirst (String a, String b)//method 3 firstThingsFirst
	{
		String order;
		int compare = a.compareTo(b);
			if(compare < 0)
			{
				order = a + " " + b;
			}
			else if (compare > 0)
			{
				order = b + " " + a;
			}
			else 
			{
				order = "Both words are the same";
			}
		return order;
	}
	
	public static String reverse (String s)//method 4 reverse
	{
		String reverse = "";
		for(int i = s.length() - 1; i >= 0; i--)
		 {
		 reverse = reverse + s.charAt(i);
		 }
		return reverse;
	}
	
	public static String soLong (String a, String b)//method 5 soLong
	{
		String result;
		int lengthA = a.length();
		int lengthB = b.length();
			if(lengthA > lengthB)
			{
				result = a;
			}
			else if (lengthA < lengthB)
			{
				result = b;
			}
			else
			{
				result = a + " " + b;
			}
		return result;
	}
	
	public static String afterMath (String phrase2)//method 6 afterMath
	{
		String keyword = "math";
		String subphrase = "";
		int position = phrase2.indexOf(keyword);
		if(phrase2.contains(keyword))
		{
			subphrase = phrase2.substring(position);
		}
		else
		{
			subphrase = "dud";
		}
		return subphrase;
	}
	
	public static void letterize(String userWord)//method 7 letterize
	{
		for (int index = 0; index < userWord.length(); index++) 
		{
		    System.out.println(userWord.charAt(index));
		}
	}
}