package design.patterns.iterator;

import org.junit.Assert;
import org.junit.Test;

import design.patterns.iterator.Task;
import design.patterns.iterator.INotDoneTasksIterator;
import design.patterns.iterator.ITaskCollection;
import design.patterns.iterator.TaskCollection;

public class TaskCollectionTests {
	
	@Test
	public void testTaskCollectionIterator(){

		ITaskCollection taskCollection = new TaskCollection();

		taskCollection.registerTask(new Task(false, 1));
		taskCollection.registerTask(new Task(false, 2));
		taskCollection.registerTask(new Task(false, 3));
		taskCollection.registerTask(new Task(false, 4));
		taskCollection.registerTask(new Task(false, 5));
		
		taskCollection.finishTask(1);
		taskCollection.finishTask(3);
		
		INotDoneTasksIterator it = taskCollection.iterator();
		
		int notDoneTasksCount = 0;
		
		while(it.hasNext()) {
			System.out.print(((Task)it.next()).getTaskId());
			notDoneTasksCount++;
		}
		
		Assert.assertEquals(notDoneTasksCount, 3);
	}
}
