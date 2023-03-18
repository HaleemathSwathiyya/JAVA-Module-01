package javaenums;

public enum DayOfWeek {
	
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday"),
	SUNDAY("Sunday");
	
	private final String name;
	
	private DayOfWeek(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public String getNmae() {
		return name;
	}
	
		

}
