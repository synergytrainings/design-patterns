package main.com.synisys.trainings.designPattern;

public class Location {
	private String code;
	private Integer id;
	private String name;

	public Location(String code, Integer id, String name) {
		this.code = code;
		this.id = id;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
