package impl.test;

import impl.SettingsMenu;

import org.junit.Assert;
import org.junit.Test;

public class SettingsMenuTest {
	@Test
	public void testSettingsMenuGetInstance(){
		Assert.assertTrue("Instaces are always identical", SettingsMenu.getInstance() == SettingsMenu.getInstance());
	}

}
