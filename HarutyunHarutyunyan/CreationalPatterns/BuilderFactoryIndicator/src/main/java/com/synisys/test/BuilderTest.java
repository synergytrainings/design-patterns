package com.synisys.test;

import com.synisys.builderPattern.ActivityIndicator;
import com.synisys.builderPattern.Indicator;

public class BuilderTest {
	public static void main(String[] args) {
		Indicator activityIndicator = new ActivityIndicator.Builder(10)
				.rfLevel2Id(5).targetValue(250).build();
		Indicator indicator = new Indicator.Builder(10).rfLevel2Id(5).build();
	}
}
