package main.com.synisys.trainings.AdapterPattern;

/**
 * Adaptee class (source class)
 * @author tatevik.khachatryan
 *
 */
public interface PipProject {
	public Integer getPipProjectId();
	public String getTitle();
	public Integer getAmount();

	public void setPipProjectId(Integer pipProjectId);
	public void setTitle(String title);
	public void setAmount(Integer amount);
}
