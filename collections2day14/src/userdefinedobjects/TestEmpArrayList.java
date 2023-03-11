package userdefinedobjects;

import java.util.ArrayList;

//import oopsday4.inheritance.Employee;

public class TestEmpArrayList {

	public static void main(String[] args) {
		//user-defined types into the collections
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 24000);
		Employee emp2 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		Employee emp3 = new Employee("Joh Doe", "Female", 26, 103, "Research", 26000);
		Employee emp4 = new Employee("Jone Doe", "Male", 27, 104, "Sales", 27000);
		Employee emp5 = new Employee("Jane Doe", "Female", 28, 105, "Accounting", 28000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		

	}

}
