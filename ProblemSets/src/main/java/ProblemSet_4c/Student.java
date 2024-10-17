package ProblemSet_4c;

public class Student
{
	private char studentInitial;
	private String studentSurname;
	
	private String[] moduleNames;
	private double[] moduleAverages;
	
	private int moduleAverageTotal;
	private String cumulativeArray;
	
	public Student(char studentInitial, String studentSurname)
	{
		this.studentInitial = studentInitial;
		this.studentSurname = studentSurname;
		this.moduleNames = new String[8];
		this.moduleAverages = new double[8];
		
	}
	
	public String getStudentDetails()
	{
		moduleAverageTotal = 0;
		for (int i = 0; i <= 7; i++)
		{
		moduleAverageTotal += moduleAverages[i];
		}
		
		moduleAverageTotal /= 8;
		
		return (studentInitial + ". " + studentSurname + " " + moduleAverageTotal + "%");
	}
	
	public void setModules(int index, String moduleName, double moduleAverage)
	{
		moduleNames[index] = moduleName;
		moduleAverages[index] = moduleAverage;
	}
	
	public String displayArray()
	{
		cumulativeArray = "";
		moduleAverageTotal = 0;
		
		for (int i = 0; i <= 7; i++)
		{
			cumulativeArray += (moduleNames[i] + ": " + moduleAverages[i] + "\n");
			moduleAverageTotal += moduleAverages[i];
		}
		moduleAverageTotal /= 8;
		cumulativeArray += ("Year Average: " + moduleAverageTotal + "%");
		
		return cumulativeArray;
	}
	
	public int calculateYearAverage()
	{
		moduleAverageTotal = 0;
		for (int i = 0; i <= 7; i++)
		{
		moduleAverageTotal += moduleAverages[i];
		}
		
		moduleAverageTotal /= 8;
		
		return moduleAverageTotal;
	}
	
	public Module getModules(int i) {
	    return new Module(moduleNames[i], moduleAverages[i]);
	}

}