/**
 * for each Loop Intro
 * @author Keanu
 */
public class Mar11ForEachLoopIntro 
{
	public static void main(String[] args) 
	{
	    //Snippet 1: 
		
			//declare an array of Strings
			String[] students = {"Alice", "Bob", "Carrie", "David"};
			
			//make our 'for each loop'
			for (String currentElementCopy : students) 
			{
			  System.out.println(currentElementCopy);
			}
			
			/**
			 * a. What is the data type of each element in the array?
					String
      		   b. What is the enhanced for loop variable?
					currentElementCopy
               c. Each iteration, what is the enhanced for loop variable assigned a copy of?
					it is assigned a copy of the elements in the students array
               d. What does this snippet do?
					prints out each (copy of the) element of the students array
               e. Could you accomplish what this code does using a for or a while loop instead? How?
               		yes: for (int i = 0; i < students.length; <i++)
               		{
               			System.out.println(students[i];
               		}
			 */
	
			//Snippet 2:
			
			//declare an array of ints
			int[] grades = {22, 89, 55, 67, 81, 33};
			
			//hmmm, what is this one for?
			int sum = 0;
			
			//make our 'for each loop'
			for (int currentElement : grades) {
			  sum += currentElement;
			}
			
			System.out.println(sum);
			
			/**
			 * a. What is the data type of each element in the array?
			 * 		int
      		   b. What is the enhanced for loop variable?
      		   		currentElement
               c. Each iteration, what is the enhanced for loop variable assigned a copy of?
               		it is assigned a copy of the elements in the grades array
               d. What does this snippet do?
               		it adds the (copies of the) elements of the grades array to the sum variable
               e. Could you accomplish what this code does using a for or a while loop instead? How?
               		yes: for (int i = 0; i < grades.length; i++)
               		{
               			sum += grades[i];
               		}
			 */
			
			//Snippet 3: 
			
			//declare an array of doubles
			double[] scores = {8.5, 9.0, 3.3, -2.7, 44.12};
			
			//what is this for? i wonder...
			double avg = 0;
			
			//make our 'for each loop'
			for (double i : scores) {
			  avg += i;
			}
			
			//what's this do? huh...
			System.out.println(avg / scores.length);
			
			/**
			 * a. What is the data type of each element in the array?
					double
      		   b. What is the enhanced for loop variable?
					i
               c. Each iteration, what is the enhanced for loop variable assigned a copy of?
					it is assigned a copy of the elements in the scores array
               d. What does this snippet do?
					it adds the (copies of the) elements of the scores array to the avg variable, then prints out the avarage by dividing the avg variable by the array length
               e. Could you accomplish what this code does using a for or a while loop instead? How?
               		yes: for (int i = 0; i < scores.length; i++)
               		{
               			avg += scores[i];
               		}
			 */

			//Snippet 4:
			
			String[] workers = {"Alice", "Bob", "Carrie", "David"};
			
			for (String currentWorker : workers) {
			  currentWorker = null;
			}
			
			/**
			 *  a. What is this snippet of code trying to do?
			 *  	it is trying to reassign each of the elements of the workers array into null values
      			b. Why does it not work?
      				it doesn't work because currentWorker only stores a copy of the elements, not the actual values itself
			 */

	}

}
