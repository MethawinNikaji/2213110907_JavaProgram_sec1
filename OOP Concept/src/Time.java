
public class Time {
	private int second;
	private int minute;
	private int hour;
	
	//Constructor method
	public Time() {
		this.second=0;
		this.minute=0;
		this.hour=0;
	}
	public Time(int second,int minute,int hour) {
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	//this public getters/setters for the private variables.
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setHour(int hour) {
		this.hour=hour;
	}
	public void setMinute(int minute) {
		this.minute=minute;
	}
	public void setSecond(int second) {
		this.second=second;
	}
	//toString method in the form of "hh:mm:ss" with leading zeros
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public void setTime(int second,int minute,int hour) {
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	//advances this time instance by the one second
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second=0;
			++minute;
			if(minute>=60) {
				minute=0;
				++hour;
				if(hour>=60) {
					hour=0;
				}
			}
		}
		return this;
	}
	

}
