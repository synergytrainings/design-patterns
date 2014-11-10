package main.com.synisys.trainigs.prototypePattern;

public class Project implements Copyable, Cloneable {
	// required fields
	private Integer id;
	private String title;

	// optional fields
	private String description;
	private Integer statusId;

	/**
	 * Constructor with required parameters
	 * 
	 * @param id
	 * @param title
	 */
	public Project(Integer id, String title) {
		this.id = id;
		this.title = title;
	}

	/**
	 * Constructor with all parameters
	 * 
	 * @param id
	 * @param title
	 * @param description
	 * @param statusId
	 */
	public Project(Integer id, String title, String description,
			Integer statusId) {
		this(id, title);
		this.description = description;
		this.statusId = statusId;
	}
	
	/**
	 * Creates new project using values of current project properties 
	 */
	@Override	
	public Object copy() {
		return new Project(this.id, this.title, this.description, this.statusId);
	}

	/**
	 * Creates new project using only required or all properties of current project based on shallow parameter value 
	 */
	@Override	
	public Object copy(boolean shallow) {
		if (shallow) {// copy only required!!!
			return new Project(id, title);
		} else {
			return copy();
		}
	}
	
	/**
	 * Creates current object clone
	 */
	@Override	
	public Object clone(){
		Object clone = null;
	      try {
	         clone = super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	}

	@Override
	public String toString() {
		StringBuilder projectStr = new StringBuilder();
		projectStr.append("ProjectId=").append(id).append("\n");
		projectStr.append("Title=").append(title).append("\n");
		projectStr.append("Description=")
				.append(description == null ? "" : description).append("\n");
		projectStr.append("StatusId=").append(statusId == null ? "" : statusId)
				.append("\n");
		return projectStr.toString();
	}
}
