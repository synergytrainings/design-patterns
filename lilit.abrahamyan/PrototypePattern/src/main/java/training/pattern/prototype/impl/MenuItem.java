package training.pattern.prototype.impl;

public class MenuItem {
	private int id;
	private String name;
	
	/**
	 * Copy constructor
	 * @param item {@link MenuItem} menu item
	 */
	public MenuItem(MenuItem item){
		new MenuItem(item.getId(), item.getName());
	}	
	
	/**
	 * Constructor 
	 * @param id menu id
	 * @param name menu name
	 */
	public MenuItem(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString(){
		 String EOL_STRING = System.getProperty("line.separator"); 
		 return   "id: " + id + EOL_STRING +
				  "name: " + name + EOL_STRING;
	}
}
