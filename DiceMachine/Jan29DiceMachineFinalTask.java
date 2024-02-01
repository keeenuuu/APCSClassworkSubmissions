import java.util.Scanner; //import Scanner
/** 
 * DiceMathine class: rolls a user input's dice
 * @author Keanu
 */
public class DiceMachine 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //open Scanner, named scan
		System.out.println("Welcome to Dice Roller! Roll your dice below.\nUse the #d# format, and separate dice with a plus.\nYou can even add a modifier at the end!\n"); //give user prompt to input dice
		String input = scan.nextLine(); //instantiate String, named input, which takes in the user's input
		System.out.println(""); //line break
		String noSpaces = removeSpaces(input); //instantiate String, named noSpaces, which calls removeSpaces method and passes it the input. This removes the spaces from the user input
		calculateTotal(noSpaces); //call calculateTotal method and pass it noSpaces. This will perform the dice rolling and totaling
		scan.close(); //close scan
	}
	
	/**
	 * removeSpaces method: removes spaces from the user's input
	 * @param str, the original user input
	 * @return noSpaces, the user input without spaces
	 */
	public static String removeSpaces(String str)
	{
		int spaceCount = countSpaces(str); //declare int, named spaceCount, which calls countSpaces method and passes it the user's input. This stores the amount of spaces in the user's input
		String noSpaces = new String(""); //instantiate String, named noSpaces, which will store the new String without spaces. Default value contains nothing.
		for (int i = 0; i < spaceCount; i++) //create a for loop, which declares int i as 0 and increments it until it is not less than the amount of spaces. This ensures the loop runs the proper amount of times
		{
			if (str.indexOf(' ') >= 0) //if statement to check if the index of the space in the user's input equals or is greater than zero. Practically, it checks if a space exists in the user's input
			{
				noSpaces = noSpaces.concat(str.substring(0, str.indexOf(' '))); //reassign noSpaces to be the current String, plus everything in the user's input from the beginning up to the space. This adds the characters without spaces together
				str = str.substring(str.indexOf(' ')+1); //reassign user's input to everything after the space. This removes the space that was checked and retains everything else to be checked.
			}
		}
		noSpaces = noSpaces.concat(str); //reassign noSpaces to be the current String, plus the remaining characters after the last space of the user's input
		return noSpaces; //return the user's input without spaces
	}
	
	/**
	 * countSpaces method: counts the amount of spaces in a user's input
	 * @param str, the user's input
	 * @return count, the amount of spaces in the user's input
	 */
	public static int countSpaces(String str)
	{
		int count = 0; //declare an int, named count, to store the number of occurrences of the space in the user's input. Default value is zero
		for (int i = 0; i < str.length(); i++) //create a for loop, which declares int i as zero and increments it until it is not less than the length of the user's input. This ensures the loop runs the proper amount of times
		{
			if (str.charAt(i) == ' ') //if statement to check if the character at the ith index of the String is a space. This ensures each character of the String is checked
			{
				count++; //adds one to the space count when the character being checked is a space
			}
		}
		return count; //returns the amount of spaces in the user's input
	}
	
	/**
	 * calculateTotal method: performs dice rolls, modifier addition, and calculates total of the rolls
	 * @param str, the user's input without spaces
	 */
	public static void calculateTotal(String str)
	{
		int diceAmount = countDice(str); //declare int, named diceAmount, which calls countDice, passing it the user's input without spaces. This stores the amount of dice to roll and modifiers to add
		int total = 0; //declare int, named total, whith will store the total of all rolls. Default value is zero
		for (int i = 0; i < diceAmount; i++) //create a for loop, which declares in i as zero and increments it until it is not less than the amount of dice and modifiers. This ensures the loop runs the proper amount of times
		{
			int d = str.indexOf('d'); //declare int, named d, to be the index of the character d in the user's input without spaces
			int plus = str.indexOf('+'); //declare int, named plus, to be the index of the plus character (+) in the user's input without spaces
			if (d > 0 && plus > 0) //if statement to check if the index of d and the plus character is greater than zero. Practically, this checks if multiple dice are present in the user's input
			{
				
				int count = Integer.valueOf(str.substring(0, d)); //declare int, named count, which takes the integer value of the user's input from the beginning up to the index of d. This stores the count of the dice that will be rolled
				int faces = Integer.valueOf(str.substring(d+1, plus)); //declare int, named faces, which takes the integer value of the user's input from the index succeeding d to the index of the plus character. This stores the faces of the dice that will be rolled
				total += rollDice(count, faces); //call method rollDice, passing the dice count and the number of faces for each dice, and adding it to the total
				str = str.substring(plus+1); //reassign the user's input without spaces to be everything from the plus. This removes the dice that was checked and retains everything else to be checked
				System.out.println("You rolled " + count + " " + faces + "-faced dice."); //print statement telling user which dice was rolled, noting its count and faces
			}

			else if (d > 0 && plus == -1) //else if statement to check if the index of d is greater than 0, and the index of the plus character is -1 (there is no plus character). Practically, this checks if there is only one dice remaining in the user's input (with no modifier)
			{
				int count = Integer.valueOf(str.substring(0, d)); //declare int, named count, which takes the integer value of the user's input from the beginning up to the index of d. This stores the count of the dice that will be rolled
				int faces = Integer.valueOf(str.substring(d+1)); //declare int, named faces, which takes the integer value of the user's input from the index succeeding d onward. This stores the faces of the dice that will be rolled
				total += rollDice(count, faces); //call method rollDice, passing the dice count and the number of faces for each dice, and adding it to the total
				str = ""; //reassign the user's input to default value (nothing)
				System.out.println("You rolled " + count + " " + faces + "-faced dice."); //print statement telling user which dice was rolled, noting its count and faces	
			}
			else if (d == -1 && plus == -1) //else if statement to check if the index of d and the plus character is -1 (there is no d or plus character). Practically, this checks if only a modifier is present
			{
				int modifier = Integer.valueOf(str); //declare int, named modifier, which takes the integer value of the remaining portion of the user's input (the modifier)
				total += modifier; //add the modifier to the total
				System.out.println("You added " + modifier + "."); //print statement telling user the addition of the modifier, noting the modifier's value
			}
		}
		System.out.println("\nYour final result is " + total + "!"); //print out the final result
	}
	
	/**
	 * countDice method: counts the amount of dice and modifiers in a user's input
	 * @param str, the user's input without spaces
	 * @return count, the amount of dice and modifiers in the user's input
	 */
	public static int countDice(String str)
	{
		int count = 0; //declare int, named count, to store the number of occurrences of the plus character in the user's input. Default value is zero
		for (int i = 0; i < str.length(); i++) //for loop, which declares int i as zero and increments it until it is not less than the length of the user's input. This ensures the loop runs the proper amount of times
		{
			if (str.charAt(i) == '+') //if statement to check if the character at the ith index of the String is a plus character
			//this ensures each character of the String is checked
			{
				count++; //adds one to the plus count when character being checked is a plus
			}
		}
		count ++; //add one to the plus count (this is because the amount of dice and modifiers will be one greater than the amount of plus characters)
		return count; //returns the amount of dice and modifiers in the user's input
	}
	
	/**
	 * rollDice method: rolls a certain amount of a certain-faced dice given by the user's input
	 * @param a, the amount of dice being rolled
	 * @param b, the face of the dice being rolled
	 * @return value, the result of the dice roll
	 */
	public static int rollDice(int a, int b)
	{
		int value = 0; //declare int, named value, which stores the value of the dice rolls. Default value is zero
		for (int i = 0; i < a; i++) //for loop, which declares int i as zero and increments it by 1 until it is not less than the amount of dice
		//this ensures that the correct number of dice is rolled
		{
			value += (b * Math.random() + 1); //generates random value between 0 and 1, multiplies it by the face value, and adds one, ensuring the result is within face parameters. The result of each die is added to the final value
		}	
		return value; //returns the result of the dice roll
	}
}
