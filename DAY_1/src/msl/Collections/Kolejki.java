package msl.Collections;

import java.util.*;

public class Kolejki {
	public static void main(String[] args) {
		Queue<Task> tasks = new PriorityQueue<>(6, new TaskPriorityComparator());
		tasks.add(new Task("Normal", 5));
		tasks.add(new Task("Urgent", 4));
		tasks.add(new Task("Lazy", 10));
		tasks.add(new Task("ASAP", 1));
		for(Task tsk:tasks) { //bez gwarancji kolejnosci
			System.out.println(tsk);
		}
		System.out.println("ello");
		while(!tasks.isEmpty()) { //z gwarancja kolejnosci
			System.out.println(tasks.poll().toString());
		}
	}

	static class TaskPriorityComparator implements Comparator<Task> {
		@Override
		public int compare(Task o1, Task o2) {
			return Integer.compare(o1.getPriority(), o2.getPriority());
		}
	}

}
