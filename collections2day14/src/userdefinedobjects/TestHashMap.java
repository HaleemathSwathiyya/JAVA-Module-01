package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashMap {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 24000);
		Employee emp2 = new Employee("Jon Doe", "Male", 25, 102, "Finance", 25000);
		Employee emp3 = new Employee("Joh Doe", "Female", 26, 103, "Research", 26000);
		Employee emp4 = new Employee("Jone Doe", "Male", 27, 104, "Sales", 27000);
		Employee emp5 = new Employee("Jonne Doe", "Female", 28, 105, "Accounting", 28000);
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		HashSet<Employee> empSet1 = new HashSet<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		

		TreeSet<Employee> empSet = new TreeSet<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		HashMap<String,Collection> dataMap = new HashMap<>();
		
		dataMap.put("empList", empList);
		dataMap.put("empSet1",empSet1);
		dataMap.put("empTreeSet", empSet);
		System.out.println(dataMap);
		
		Collection<Employee> list = dataMap.get("empList");
		Iterator<Employee> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collection<Employee> set = dataMap.get("empSet1");
		iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collection<Employee> tree = dataMap.get("empTreeSet");
		iter = tree.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		

	}

}
