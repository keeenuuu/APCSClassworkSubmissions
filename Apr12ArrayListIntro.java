import java.util.ArrayList; //import ArrayList
/**
 * ArrayListIntro class
 * @author Keanu
 */
public class ArrayListIntro 
{
	public static void main(String[] args) 
	{
		ArrayList<String> studentNames = new ArrayList<String>(); //create empty ArrayList of Strings, named studentNames
		
		studentNames.add("Alice"); //add Alice to studentNames
		studentNames.add("Charlie"); //add Charlie to studentNames
		studentNames.add("Dave"); //add Dave to studentNames
		studentNames.add("Elizabeth"); //add Elizabeth to studentNames
		studentNames.add("Fieri"); //add Fieri to studentNames
		studentNames.add("Gwen"); //add Gwen to studentNames
		System.out.println(studentNames); //print studentNames
		
		studentNames.add(1, "Brittany"); //add Brittany to studentNames, after Alice (in index 1)
		
		studentNames.remove(2); //remove Charlie (in index 2) from studentNames
		
		String thirdStudent = studentNames.get(2); //declare String, named thirdStudent, which gets the student located at index 2 of studentNames
		System.out.println(studentNames); //print studentNames
		
		studentNames.set(3, "Evan"); //reassign Elizabeth (at index 3) to Evan in studentNames
	}
}
