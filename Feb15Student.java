/**
* The Student class represents a student in school. 
* A Student object stores the student's name, grade level, and grades in science, math, and theology.
* @author Keanu
*/
public class Student
{
  /*
  * attributes of a Student object: name, gradeLevel, scienceGrade, mathGrade, theologyGrade.
  * The grade level stores a number from 1 to 12.
  * The grades store a number from 0.0 to 4.0. 
  */
  private String name;
  private int gradeLevel;
  private double scienceGrade;
  private double mathGrade;
  private double theologyGrade;

  /**
  * Student constructor: instantiates a Student object.
  * @param name is the name of the student.
  * @param grade is the grade level of the student.
  * @param science is the science grade of the student.
  * @param math is the math grade of the student.
  * @param theology is the theology grade of the student.
  */
  public Student(String name, int grade, double science, double math, double theology)
  {
    this.name = name; //assign this.name of the Student object to be the name parameter.
    this.gradeLevel = grade; //assign this.gradeLevel of the Student object to be the grade parameter.
    this.scienceGrade = science; //assign this.scienceGrade of the Student object to be the science parameter.
    this.mathGrade = math; //assign this.mathGrade of the Student object to be the math parameter.
    this.theologyGrade = theology; //assign this.theologyGrade of the Student object to be the theology parameter.
  }

  /**
  * getGPA functionality: calculates and returns the overall GPA of a Student object, derived from the average of the three GPA attributes.
  * @return the Student object's overall GPA.
  */
  public double getGPA()
  {
    return (this.scienceGrade + this.mathGrade + this.theologyGrade) / 3; //adds the three GPA attributes of the Student objects, divides the sum by 3 to find the average, and returns the result.
  }

  /**
  * introduceSelf functionality: prints a statement, stating the Student object's grade level, name, and overall GPA.
  */
  public void introduceSelf()
  {
    System.out.println("Hello! I am a student in grade" + this.gradeLevel + ". My name is " + this.name + ". My GPA is " + getGPA() + "."); //print statement
  }
}
