package com.synisys.training.designPatterns.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.synisys.trainings.designPatterns.bridge.api.MapContent;
import com.synisys.trainings.designPatterns.bridge.impl.FlashMapController;
import com.synisys.trainings.designPatterns.bridge.impl.MapController;
import com.synisys.trainings.designPatterns.bridge.impl.MapTabContent;
import com.synisys.trainings.designPatterns.bridge.impl.SvgMapController;


public class BridgeTest {
	@Test
	public void testSvgMap() {
		MapController svgMapController = new SvgMapController();
		MapContent maptabContent = new MapTabContent(svgMapController);
		assertEquals("SvgMap SvgMiniMap", maptabContent.drawMap());		
	}
	
	@Test
	public void testFlashMap() {
		MapController flashMapController = new FlashMapController();
		MapContent maptabContent = new MapTabContent(flashMapController);
		assertEquals("FlashMap FlashMiniMap", maptabContent.drawMap());
		
	}

}
