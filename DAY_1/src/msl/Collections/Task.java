package msl.Collections;

public class Task {
	String name;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	private void setPriority(int priority) {
		this.priority = priority;
	}

	int priority;

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}

	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	
}
