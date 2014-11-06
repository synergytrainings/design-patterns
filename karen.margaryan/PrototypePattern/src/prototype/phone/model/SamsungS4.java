package prototype.phone.model;


/**
 * Concrete implementation of MobilePhone.
 * @author Karen
 *
 */
public class SamsungS4 extends MobilePhone {
	
	public SamsungS4() {
		modelName = PhoneModels.SAMSUNG_S4;
	}
	
	@Override
	public Object clone() {
		return super.clone();
	}
}
