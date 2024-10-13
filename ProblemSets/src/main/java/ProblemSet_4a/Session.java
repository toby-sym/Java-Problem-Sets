package ProblemSet_4a;

public class Session
{
	private String sessionName;
	private int sessionStartTime;
	private int sessionEndTime;
	
	public Session(String sessionName, int sessionStartTime, int sessionEndTime)
	{
		this.sessionName = sessionName;
		this.sessionStartTime = sessionStartTime;
		this.sessionEndTime = sessionEndTime;
	}
	
	public String getSessionName()
	{
		return sessionName;
	}
	
	public int getStartTime()
	{
		return sessionStartTime;
	}
	
	public int getEndTime()
	{
		return sessionEndTime;
	}
	
    public void setStartTime(int sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public void setEndTime(int sessionEndTime) {
        this.sessionEndTime = sessionEndTime;
    }
}