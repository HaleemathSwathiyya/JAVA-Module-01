package userdefinedobjects;

//import java.util.ArrayList;
import java.util.HashSet;

//import oopsday4.inheritance.Employee;

public class TestEmpHashSet {

	public static void main(String[] args) {
		//user-defined types into the collections
		//for hashset equals is important
		HashSet<Employee> empSet1 = new HashSet<Employee>();
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 24000);
		Employee emp2 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		Employee emp3 = new Employee("Joh Doe", "Female", 26, 103, "Research", 26000);
		Employee emp4 = new Employee("Jone Doe", "Male", 27, 104, "Sales", 27000);
		Employee emp5 = new Employee("Jonne Doe", "Female", 28, 105, "Accounting", 28000);
		//Employee emp5 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		
		empSet1.add(emp1);
		empSet1.add(emp2);
		empSet1.add(emp3);
		empSet1.add(emp4);
		empSet1.add(emp5);
		
		System.out.println(empSet1);
		

	}

}
