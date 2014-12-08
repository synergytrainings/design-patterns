package main.com.synisys.trainings.factoryMethodPattern.impl;

/**
 * Concrete implementation of DeItem
 * 
 * @author tatevik.khachatryan
 * 
 */
public class Profile extends DeItemImpl {
	private String profileTitle;

	public String getProfileTitle() {
		return profileTitle;
	}

	public void setProfileTitle(String profileTitle) {
		this.profileTitle = profileTitle;
	}
	
	public Profile(Integer deItemId, String name){
		super(deItemId, name);
	}
	
	public String toString(){
		StringBuilder profileStr = new StringBuilder();
		profileStr.append("Id:").append(getId()==null?"":getId()).append(" ");
		profileStr.append("Name:").append(getName()==null?"":getName()).append(" ");
		profileStr.append("Profile-Title:").append(profileTitle==null?"":profileTitle).append("\n");
		return profileStr.toString();
	}
}
