package main.com.synisys.trainings.designPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Saves and restores a Project object's state via a memento. Project.Memento isn't visible to the ProjectCaretaker so we need to cast
 * the memento to Object
 * @author tatevik.khachatryan
 *
 */

public class ProjectCaretaker {
	private List<Object> mementoList = new ArrayList<Object>();

	public void addMemento(Object state) {
		mementoList.add(state);
	}

	public Object getMemento(int index) {
		return mementoList.get(index);
	}
}
