package design.patterns.iterator;

import java.util.List;

public class NotDoneTaskIterator implements INotDoneTasksIterator {

	private List<Task> tasks;
	private int index = 0;

	public NotDoneTaskIterator(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	@Override
	public boolean hasNext() {
		while(index < tasks.size()) {
			if (tasks.get(index).isDone()) {
				index++;
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object next() {
		Task t = tasks.get(index);
		index++;
		return t;
	}

}
