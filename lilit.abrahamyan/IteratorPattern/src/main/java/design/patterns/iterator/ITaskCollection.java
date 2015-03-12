package design.patterns.iterator;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public interface ITaskCollection {
	 
    public void registerTask(Task t);
     
    public void finishTask(int index);
     
    public INotDoneTasksIterator iterator();
     
}