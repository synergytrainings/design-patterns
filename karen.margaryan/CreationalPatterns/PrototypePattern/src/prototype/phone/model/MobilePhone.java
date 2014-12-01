package prototype.phone.model;

/**
 * Base class for mobile phones.
 * @author Karen
 *
 */
public class MobilePhone implements Cloneable {
	
	protected String modelName;
	
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return clone;
	}
	
}
