
public class StringMethods {
	
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
	
	public static String letterize(String userWord)//method 7 letterize
	{
		String out = "";
		for (int index = 0; index < userWord.length(); index++) 
		{
		    out += userWord.charAt(index) + "\n";			
		    //System.out.println(userWord.charAt(index));
		}
		System.out.println(out);
		return out;
	}
	
	public static String toCamelCase(String s)//method 8 toCamelCase
	{
	    String result = "";
	    String[] tokens = s.split(" "); 
	    for (int i = 0, L = tokens.length; i<L; i++) 
	    {
	        String token = tokens[i];
	        if (i==0) 
	        	{
	        	result = token.toLowerCase();
	        	}
	        else
	        	{
	            result += token.substring(0, 1).toUpperCase() +
	                token.substring(1, token.length()).toLowerCase();
	        	}
	     }
	    return result;
	}
}
