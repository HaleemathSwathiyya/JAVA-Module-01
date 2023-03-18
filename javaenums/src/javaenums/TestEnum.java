package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is " + today.getNmae());
		//This would give output like - "Today is Saturday".
		
		switch(today) {
		
		case MONDAY:
			         System.out.println("Hard Work");
			         break;
		case TUESDAY:
			         System.out.println("Little Work");
			         break;
		case WEDNESDAY:
			         System.out.println("Little little work");
			         break;
		case THURSDAY:
			         System.out.println("Work More");
			         break;
		case FRIDAY:
			        System.out.println("Weekend coming");
			        break;
		case SATURDAY:
			        System.out.println("Have Coffee, Go for Shopping");
			        break;
		case SUNDAY:
			        System.out.println("Enjooyyyyyyy");
			        break;
		}

	}

}
