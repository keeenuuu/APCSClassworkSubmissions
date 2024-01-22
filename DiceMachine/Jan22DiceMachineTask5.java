/** 
 * DiceMathine class: rolls a user input's dice
 * @author Keanu
 */
public class DiceMachine 
{
	public static void main(String[] args) 
	{
		String str = new String("The quick brown dog"); //instantiate a new String phrase
		String str1 = new String(removeSpaces(str)); //instantiate a new String, which uses removeSpaces to remove the spaces from str
		System.out.println(str1); //print str1
	}
	/**
	 * removeSpaces method: removes the spaces from a String input
	 * @param str
	 * @return the String without any spaces
	 */
	public static String removeSpaces(String str)
	{
		int spaceIndex = 0; //declare int spaceIndex to be 0 (this will be used to keep track of the previous space's index, for concatenation)
		String noSpaces = new String(""); //instantiate a new String, named noSpaces, which will store the str value without spaces
		for (int i = 0; i < str.length(); i++) //for loop, which declares int i as zero and increments it until it is not less than the length of str (using length() method)
		//this ensures the loop runs the proper amount of times
		{
			if (str.charAt(i) == ' ') //if statement to check if the character at the ith index of the String is a space
			//this ensures each character of the String is checked
			{
				noSpaces = noSpaces.concat(str.substring(spaceIndex + 1, i)); //concatenate noSpaces to include the str value from the previous space's index to the current index
				//(this will cause the first character of str and the characters after the last space to be omitted. will resolve later)
				spaceIndex = i; //reassigns spaceIndex as the current index (stores current space's index to be used during next iteration)
			}
		}
		noSpaces = String.valueOf(str.charAt(0)).concat(noSpaces).concat(str.substring(spaceIndex + 1)); //constructs final noSpaces value through concatenation
		//includes 1st character of str and characters after the last space 
		return noSpaces; //return noSpaces
	}
}
