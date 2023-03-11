package oopsday4.inheritance;

public class CompanyHR {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 24000);
		System.out.println(emp1);
		Employee emp2 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		System.out.println(emp2);
		Employee emp3 = new Employee("Joh Doe", "Female", 26, 103, "Research", 26000);
		System.out.println(emp3);
		Employee emp4 = new Employee("Jone Doe", "Male", 27, 104, "Sales", 27000);
		System.out.println(emp4);
		Employee emp5 = new Employee("Jane Doe", "Female", 28, 105, "Accounting", 28000);
		System.out.println(emp5);
		
		if(emp1.equals(emp5)) 
			System.out.println("same");
		else
			System.out.println("different");
		
		
	}

}
