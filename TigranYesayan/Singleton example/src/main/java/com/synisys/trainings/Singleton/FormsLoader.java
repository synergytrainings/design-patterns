package com.synisys.trainings.Singleton;

import java.util.HashMap;
import java.util.Map;

public class FormsLoader {
	public static void loader() {
		//Something load from DB that was not changed during working
		Map<String, Integer> formIds = new HashMap<String, Integer>();
		for (int i = 0; i < 5; i++) {
			formIds.put("form" + i, i);
		}
		MySingleton.getInstance().setFormIds(formIds);
	}

}
