package prototype.phone;

import java.util.HashMap;

import prototype.phone.model.IPhone4s;
import prototype.phone.model.IPhone5s;
import prototype.phone.model.MobilePhone;
import prototype.phone.model.PhoneModels;
import prototype.phone.model.SamsungS4;

/**
 * Cacher class for mobile phones
 * @author Karen
 *
 */
public class MobilePhoneCache {
	
	private static HashMap<String, MobilePhone> mobilePhones = new HashMap<String, MobilePhone>();
	
	/**
	 * Returns mobile phone object based on the model name
	 * @param model model name
	 * @return MobilePhone object
	 */
	public static MobilePhone getMobilePhone(String model) {
		MobilePhone mobilePhone = (MobilePhone) mobilePhones.get(model);
		return (MobilePhone) mobilePhone.clone();
	}
	
	/**
	 * Creates possible objects and stores in a map
	 */
	public static void loadCache() {
		mobilePhones.put(PhoneModels.IPHONE_4S, new IPhone4s());
		mobilePhones.put(PhoneModels.IPHONE_5S, new IPhone5s());
		mobilePhones.put(PhoneModels.SAMSUNG_S4, new SamsungS4());
	}
}
