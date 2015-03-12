package design.patterns.iterator;

/**
 * Non-terminal expression
 * @author lilit.abrahamyan
 *
 */
public class Task{

	private boolean done;
	private Integer taskId;
	
	public Task(boolean done, Integer taskId) {
		super();
		this.done = done;
		this.taskId = taskId;
	}
	
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}	
}
