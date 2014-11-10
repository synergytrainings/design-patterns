package impl.test;

import impl.SystemLanguage;

import org.junit.Assert;
import org.junit.Test;

public class SystemLanguageTest {

	@Test
	public void testGetSystemLanguage() {
		Assert.assertEquals("System language id must be", SystemLanguage.INSTANCE.getLanguageId(), 1);
		Assert.assertEquals("System language name must be", SystemLanguage.INSTANCE.getName(), "English");
	}
}
