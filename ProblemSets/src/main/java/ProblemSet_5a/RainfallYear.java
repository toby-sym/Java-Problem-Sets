package ProblemSet_5a;

public class RainfallYear
{
	private int year;
	private String month;
	private double[] rainData;
	private String[] monthList;
	
	private double cumTotal;
	
	public RainfallYear(int year)
	{
		this.year = year;
		this.month = month;
		this.rainData = new double[12];
		this.monthList = new String[12];
		monthList[0] = "JANUARY";
		monthList[1] = "FEBRUARY";
		monthList[2] = "MARCH";
		monthList[3] = "APRIL";
		monthList[4] = "MAY";
		monthList[5] = "JUNE";
		monthList[6] = "JULY";
		monthList[7] = "AUGUST";
		monthList[8] = "SEPTEMBER";
		monthList[9] = "OCTOBER";
		monthList[10] = "NOVEMBER";
		monthList[11] = "DECEMBER";

	}
	
	public int getYear()
	{
		return year;
	}
	
	public void enterData(double[] inprainData)
	{
		for (int i = 0; i < monthList.length; i++)
		{
			rainData[i] = inprainData[i];
			System.out.println("Data Imported: " + rainData);
		}
	}
	
	public double getRainfallMonth(String monthString) {
        for (int i = 0; i < monthList.length; i++)
        {
            if (monthList[i] == monthString)
            {
                return rainData[i];
            }
        }
		return 0.0;
	}
	
	public double calculateHighestRainfall()
	{
		cumTotal = 0;
		for (int i = 0; i < monthList.length; i++)
		{
			if (rainData[i] > cumTotal)
			{
				cumTotal = rainData[i];
			}
		}
		return cumTotal;
	}
	
	public double calculateMeanRainfall()
	{
		cumTotal = 0;
		for (int i = 0; i < monthList.length; i++)
		{
			cumTotal += rainData[i];
		}
		return (cumTotal / 12);
	}
}