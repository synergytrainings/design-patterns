package design.patterns.iterator;

import java.util.ArrayList;
import java.util.List;


public class TaskCollection implements ITaskCollection{

    private List<Task> tasks;
    
    public TaskCollection(){
    	tasks = new ArrayList<>();
    }
    
	@Override
	public void registerTask(Task t) {
		tasks.add(t);
	}

	@Override
	public void finishTask(int index) {
		tasks.get(index).setDone(true);
	}

	@Override
	public INotDoneTasksIterator iterator() {
		return new NotDoneTaskIterator(tasks);
	}

}
