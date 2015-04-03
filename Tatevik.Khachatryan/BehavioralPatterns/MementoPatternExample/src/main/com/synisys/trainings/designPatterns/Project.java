package main.com.synisys.trainings.designPatterns;
/**
 * The object for which the state is to be saved.
 * @author tatevik.khachatryan
 *
 */
public class Project {
	private Integer id;	
	private String code;
	private String title;
	
	public Project(Integer id, String code, String title){
		this.id = id;
		this.code = code;
		this.title = title;
	}
	
	public String toString() {
		return "Id: " + id + ", code: " + code + ", title: " + title;
	}
	
	public Memento save() {
		return new Memento(id, code, title);
	}

	public void restore(Object objMemento) {
		Memento memento = (Memento) objMemento;
		this.id = memento.mementoProjectId;
		this.code = memento.mementoProjectCode;
		this.title = memento.mementoProjectTitle;
	}
	 
	 /**
	  * Inner class that stores the saved state of the project
	  * @author tatevik.khachatryan
	  *
	  */
	private class Memento {
		private Integer mementoProjectId;
		private String mementoProjectCode;
		private String mementoProjectTitle;
		
		private Memento(Integer mementoProjectId, String mementoProjectCode, String mementoProjectTitle){
			this.mementoProjectId = mementoProjectId;
			this.mementoProjectCode = mementoProjectCode;
			this.mementoProjectTitle = mementoProjectTitle;
		}						
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
