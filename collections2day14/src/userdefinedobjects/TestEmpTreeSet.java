package userdefinedobjects;

//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.TreeSet;

//import oopsday4.inheritance.Employee;

public class TestEmpTreeSet {

	public static void main(String[] args) {
		//user-defined types into the collections
		
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 24000);
		Employee emp2 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		Employee emp3 = new Employee("Joh Doe", "Female", 26, 103, "Research", 26000);
		Employee emp4 = new Employee("Jone Doe", "Male", 27, 104, "Sales", 27000);
		Employee emp5 = new Employee("Jonne Doe", "Female", 28, 105, "Accounting", 28000);
		//Employee emp5 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet);
		

	}

}
