package ProblemSet_4b;

public class Classroom
{
	private String classroomName;
	private int classroomCapacity;
	private char[] studentInitials;
	private String[] studentSurnames;
	private int studentCount;
		
	public Classroom(String classroomName)
	{
		this.classroomName = classroomName;
	    this.classroomCapacity = 20;
		this.studentInitials = new char[classroomCapacity];
        this.studentSurnames = new String[classroomCapacity];
        this.studentCount = 0;
	}

	public String getRoom()
	{
		return classroomName;
	}
	
	public int getCapacity()
	{
		return classroomCapacity;
	}
	
    public void addStudents(int index, char studentInitial, String studentSurname)
    {
        if (index >= 0 && index < studentInitials.length)
        {
            studentInitials[index] = studentInitial;
            studentSurnames[index] = studentSurname;
            studentCount += 1;
        }
    }

    public int howManyStudents()
    {
        return studentCount;
    }
    
    public String getSummary()
    {
        if (studentCount == 0)
        {
            return "No students added";
        }
        
        String summary = "";
        for (int i = 0; i < studentCount; i++) {
            summary += studentInitials[i] + ". " + studentSurnames[i] + "\n";
        }
        return summary;
        
        
    }
}
