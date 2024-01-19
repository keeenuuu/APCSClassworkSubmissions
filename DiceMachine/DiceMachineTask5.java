/** 
 * DiceMathine class: rolls a user input's dice
 * @author Keanu
 */
public class DiceMachine 
{
	public static void main(String[] args) 
	{
		printNums("2d10"); //call printNums method, which takes in dice input "2d10" (two 10-sided dice)
		String str = new String(removeSpaces("The quick brown dog"));
		System.out.println(str);
	}
	/**
	 * printNums method: prints the two number components of a dice input, and prints their sum.
	 * @param str = the dice input, in #d#
	 */
	public static void printNums(String str)
	{
		String num1 = str.substring(0, str.indexOf('d')); //declares a String, named num1, which takes the substring of the dice input from index 0 to the index of the d character
		String num2 = str.substring(str.indexOf('d')+1); //declares a String, named num2, which takes the substring of the dice input from the index succeeding 'd' onward
		System.out.println("The 1st number is " + num1 + " and the 2nd number is " + num2 + "."); //prints the two number components
		int a = Integer.valueOf(num1); //declares an int, named a, which takes the Integer value of num1
		int b = Integer.valueOf(num2); //decares an int, named b, which takes in the Integer value of num2
		//System.out.println(a + " + " + b + " = " + (a+b)); //prints the sum of a and b
		rollDice(a, b); //call rollDice method to roll the dice, using the two numbers from the input
	}
	/**
	 * rollDice method: rolls a specific number of a specific-faced dice 
	 * @param a - the amount of times a dice is rolled
	 * @param b - the faces of the die
	 */
	public static void rollDice(int a, int b)
	{
		int value = 0; //the final value of all the dice rolls
		for (int i = 1; i <= a; i++) //for loop which declares an int i and increments it by 1 until it is not less than or equal to a
		//this ensures that the correct number of dice is rolled
		{
			value += (b * Math.random() + 1); //uses random method, multiplied by b and added to 1, to generate a random number between 1 and the face number
			//the result of each die is added to the final value
		}	
		System.out.println("Rolling " + a + " " + b + "-sided dice gives " + value + "."); //print final value of dice rolls, while noting the type and number of dice
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
