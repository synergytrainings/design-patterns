package design.patterns.state;

import org.junit.Assert;
import org.junit.Test;

import design.patterns.state.AuthenticationResult.Result;

public class StatePatternTest {

	@Test
	public void testStatePattern() {

		Authentication authentication = new Authentication();
		
		AuthenticationResult result = authentication.authenticate("admin", "123456");		
		Assert.assertEquals(result.getResult(), Result.SUCCESS);
		result = authentication.authenticate("admin", "1");
		Assert.assertEquals(result.getResult(), Result.FAIL);
		
		
	}
}
