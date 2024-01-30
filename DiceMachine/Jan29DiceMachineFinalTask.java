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
		System.out.println(noSpaces);
		calculateTotal(noSpaces); //call calculateTotal method and pass it noSpaces. This will perform the dice rolling and totaling
		scan.close(); //close scan
	}
	
	/**
	 * removeSpaces method: removes spaces from the user's input
	 * @param str - the original user input
	 * @return noSpaces - the user input without spaces
	 */
	public static String removeSpaces(String str)
	{
		int spaceCount = countSpaces(str);
		String noSpaces = new String("");
		for (int i = 0; i < spaceCount; i++)
		{
			if (str.indexOf(' ') > 0) 
			{
				noSpaces = noSpaces.concat(str.substring(0, str.indexOf(' ')));
				str = str.substring(str.indexOf(' ')+1);
			}
		}
		noSpaces = noSpaces.concat(str);
		return noSpaces;
	}
	
	/**
	 * countSpaces method
	 * @param str
	 * @return count
	 */
	public static int countSpaces(String str)
	{
		int count = 0; //declare an int, named count, to keep track of the number of occurrences of the char in the String
		for (int i = 0; i < str.length(); i++) //for loop, which declares int i as zero and increments it until it is not less than the length of the String (using length() method)
		//this ensures the loop runs the proper amount of times
		{
			if (str.charAt(i) == ' ') //if statement to check if the character at the ith index of the String matches the char value (using charAt() method)
			//this ensures each character of the String is checked
			{
				count++; //adds one to the character count when if statement is true
			}
		}
		return count; //returns character count
	}
	
	/**
	 * calculateTotal method
	 * @param str
	 */
	public static void calculateTotal(String str)
	{
		int diceCount = countDice(str) + 1;
		int total = 0;
		for (int i = 1; i <= diceCount; i++)
		{
			int d = str.indexOf('d');
			int plus = str.indexOf('+');
			if (d > 0 && plus > 0)
			{
				
				int count = Integer.valueOf(str.substring(0, d));
				int faces = Integer.valueOf(str.substring(d+1, plus));
				total += rollDice(count, faces);
				str = str.substring(plus+1);
				System.out.println("You rolled " + count + " " + faces + "-faced dice.");
			}

			else if (d > 0 && plus == -1) 
			{
				int count = Integer.valueOf(str.substring(0, d));
				int faces = Integer.valueOf(str.substring(d+1));
				total += rollDice(count, faces); 
				str = "";
				System.out.println("You rolled " + count + " " + faces + "-faced dice.");	
			}
			else if (d == -1 && plus == -1)
			{
				int modifier = Integer.valueOf(str);
				total += modifier;
				System.out.println("You added " + modifier + ".");
			}
		}
		System.out.println("Your final result is " + total + "!");
	}
	
	/**
	 * countDice method
	 * @param str
	 * @return count
	 */
	public static int countDice(String str)
	{
		int count = 0; //declare an int, named count, to keep track of the number of occurrences of the char in the String
		for (int i = 0; i < str.length(); i++) //for loop, which declares int i as zero and increments it until it is not less than the length of the String (using length() method)
		//this ensures the loop runs the proper amount of times
		{
			if (str.charAt(i) == '+') //if statement to check if the character at the ith index of the String matches the char value (using charAt() method)
			//this ensures each character of the String is checked
			{
				count++; //adds one to the character count when if statement is true
			}
		}
		return count; //returns character count
	}
	
	/**
	 * rollDice method
	 * @param a
	 * @param b
	 * @return value
	 */
	public static int rollDice(int a, int b)
	{
		int value = 0; //the final value of all the dice rolls
		for (int i = 1; i <= a; i++) //for loop which declares an int i and increments it by 1 until it is not less than or equal to a
		//this ensures that the correct number of dice is rolled
		{
			value += (b * Math.random() + 1); //uses random method, multiplied by b and added to 1, to generate a random number between 1 and the face number
			//the result of each die is added to the final value
		}	
		return value;
	}
}
