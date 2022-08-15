package employee;

public class FullTime {

	private int hour;
	private int rate;
	
	
	public FullTime() {
		
		this.rate = 10;
		
	}
	public FullTime(int hour) {
		
		this.hour = hour;
		this.rate = 10;
		
	}
	
	public int gethour() {
		
		return hour;
		
	}
	
	public void sethour(int hour) {
		
		this.hour = hour;
		
	}
	
	public int getrate() {
		
		return rate;
		
	}
	public void setrate(int rate) {
		
		this.rate = rate;
		
	}
}
