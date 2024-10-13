package ProblemSet_4b;

public class Classroom
{
	private String classroomName;
	private int classroomCapacity;
	private int[] studentIndex;
	private char[] studentFirstInitial;
	private String[] studentSurname;
	
	private String summativeList;
	
	public Classroom(String classroomName)
	{
		this.classroomName = classroomName;
	}
	
	
	public void addStudents(int inpstudentIndex, char inpstudentFirstInitial, String inpstudentSurname)
	{
		studentIndex[inpstudentIndex] = inpstudentIndex;
		studentFirstInitial[inpstudentIndex] = inpstudentFirstInitial;
		studentSurname[inpstudentIndex] = inpstudentSurname;
	}
	
	public String getSummary()
	{
		for (int i : studentIndex)
		{
			summativeList += (studentFirstInitial[i] + ". " + studentSurname[i] + "/n");
		}
		
		return summativeList;
	}
	
	public int howManyStudents()
	{
		return studentSurname.length;
	}
	
	public String getRoom()
	{
		return classroomName;
	}
	
	public int getCapacity()
	{
		return classroomCapacity;
	}
}