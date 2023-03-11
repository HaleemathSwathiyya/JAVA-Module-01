package listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>(); //arrays are the backing data structure of queue
		
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("forth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		String ele = queue.peek();//peek is for getting the first element  //getFirst();
		System.out.println(ele);
		queue.poll(); //poll is for getting and removing the first element
		System.out.println(queue);
		
		Iterator<String> iter = queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
