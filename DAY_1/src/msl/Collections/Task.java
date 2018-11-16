package msl.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * To jest klasa ktora testuje logowanie
 * @author student
 * @since 2018-11-15
 * @version 1.1
 * @see Task#Task(String, int)
 * 
 */
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
	
	private static final Logger LOG = LogManager.getLogger(Task.class);
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}

	public Task(String name, int priorty) {
		super();
		this.name = name;
		this.priority = priority;
	}
	
}
