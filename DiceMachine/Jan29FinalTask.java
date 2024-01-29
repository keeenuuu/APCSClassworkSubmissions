import java.util.Scanner;
/** 
 * DiceMathine class: rolls a user input's dice
 * @author Keanu
 */
public class DiceMachine 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Dice Roller! Roll your dice below.\nUse the #d# format, and separate dice with a plus.\nYou can even add a modifier at the end!\n");
		String input = scan.nextLine();
		System.out.println("");
		String noSpaces = removeSpaces(input);
		splitDice(noSpaces);
		scan.close();
	}
	/**
	 * 
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
	
	public static void splitDice(String str)
	{
		String original = str;
		int total = 0;
		for (int i = 1; i <= countPlus(original) + 1; i++)
		{
			int d = str.indexOf('d');
			int plus = str.indexOf('+');
			if (d > 0 && plus > 0)
			{
				
				int count = Integer.valueOf(str.substring(0, d));
				int faces = Integer.valueOf(str.substring(d+1, plus));
				total += rollDice(count, faces);
				str = str.substring(plus+1);
				System.out.println("You rolled " + count + " " + faces + "-faced die.");
			}

			else if (d > 0 && plus == -1) 
			{
				int count = Integer.valueOf(str.substring(0, d));
				int faces = Integer.valueOf(str.substring(d+1));
				total += rollDice(count, faces); 
				str = "";
				System.out.println("You rolled " + count + " " + faces + "-faced die.");	
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
	
	public static int countPlus(String str)
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
