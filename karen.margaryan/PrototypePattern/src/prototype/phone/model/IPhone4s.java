package prototype.phone.model;


/**
 * Concrete implementation of MobilePhone.
 * @author Karen
 *
 */
public class IPhone4s extends MobilePhone {
	
	public IPhone4s() {
		modelName = PhoneModels.IPHONE_4S;
	}
	
	@Override
	public Object clone() {
		return super.clone();
	}
	
}
