package dip;

public class Worker {
	
	public void work() {}
}

class Manager{
	
	Worker worker;
	
	public void setWorker(Worker w) {
		worker = w;
	}
	
	public void manager() {
		worker.work();
	}

class SuperWorker {
	public void work() {
		//...working much more
	}
}
}


