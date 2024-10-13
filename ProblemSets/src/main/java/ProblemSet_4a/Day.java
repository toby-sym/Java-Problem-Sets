package ProblemSet_4a;

public class Day
{
	private String dayName;
	private Session[] sessions;
	private String output;
	
	public Day(String dayName)
	{
		this.dayName = dayName;
		this.sessions = new Session[3];
	}
	
	public String getName()
	{
		return dayName;
	}

	public Session getSessions(int index)
	{
			return sessions[index];
	}

	public void setSession(int index, String sessionName, int startTime, int endTime)
	{
		if (index >= 0 && index < sessions.length)
		{
			sessions[index] = new Session(sessionName, startTime, endTime);
		}
	}	
	
	public String toString()
	{
		output = "";
		for (Session session : sessions)
		{
			if (session != null)
			{
				output += (session.getSessionName() + ": " + session.getStartTime() + " - " + session.getEndTime() + "\n");
			}
		}
		
		return output;
	}
}						