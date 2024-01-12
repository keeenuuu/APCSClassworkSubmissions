/** 
 * CountChars: uses a method to count how many times a char shows up in a String value 
 * @author Keanu
 */
public class Jan12CountChars 
{
	public static void main(String[] args) 
	{
		System.out.print(countChars("abacadaba", 'a')); //print out return statement of countChars method, which takes in String object and char data type
	}
	
	/**
	 * countChars method: counts how many times a char parameter shows up in a String value
	 * @param str
	 * @param c
	 * @return the amount of times the char shows up in the String
	 */
	public static int countChars(String str, char c)
	{
		int count = 0; //declare an int, named count, to keep track of the number of occurrences of the char in the String
		for (int i = 0; i < str.length(); i++) //for loop, which declares int i as zero and increments it until it is not less than the length of the String (using length() method)
		//this ensures the loop runs the proper amount of times
		{
			if (str.charAt(i) == c) //if statement to check if the character at the ith index of the String matches the char value (using charAt() method)
			//this ensures each character of the String is checked
			{
				count++; //adds one to the character count when if statement is true
			}
		}
		return count; //returns character count
	}
}
