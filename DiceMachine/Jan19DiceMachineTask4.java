/** DiceMathine class: rolls a user input's dice
 * @author Keanu
 */
public class DiceMachine 
{
	public static void main(String[] args) 
	{
		printNums("2d10"); //call printNums method, which takes in dice input "2d10" (two 10-sided dice)
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
}
