public class RandomLetterChooser extends RandomStringChooser
{
	private String[] letters;
	private 
	public RandomLetterChooser(String str)
	{ 
		letters = getSinglerLetters(str);
		if(letters.length 
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
