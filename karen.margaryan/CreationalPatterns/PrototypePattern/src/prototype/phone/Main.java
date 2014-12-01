package prototype.phone;

import prototype.phone.model.MobilePhone;
import prototype.phone.model.PhoneModels;

public class Main {
	public static void main(String[] args) {
		MobilePhoneCache.loadCache();
		
		MobilePhone iPhone5s= MobilePhoneCache.getMobilePhone(PhoneModels.IPHONE_5S);
		System.out.println(iPhone5s.getModelName());
		
		MobilePhone samsungS4= MobilePhoneCache.getMobilePhone(PhoneModels.SAMSUNG_S4);
		System.out.println(samsungS4.getModelName());
	}
}
