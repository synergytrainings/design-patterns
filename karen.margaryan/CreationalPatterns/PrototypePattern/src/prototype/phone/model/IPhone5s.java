package prototype.phone.model;


/**
 * Concrete implementation of MobilePhone.
 * @author Karen
 *
 */
public class IPhone5s extends MobilePhone {
	
	public IPhone5s() {
		modelName = PhoneModels.IPHONE_5S;
	}
	
	@Override
	public Object clone() {
		return super.clone();
	}
}
