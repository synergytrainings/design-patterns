package design.patterns.mediator;

import org.junit.Assert;
import org.junit.Test;

import design.patterns.mediator.TennisCourt;
import design.patterns.mediator.Coach;
import design.patterns.mediator.Mediator;

public class MediatorTest {

	@Test
	public void testMediatorPattern() {

		Mediator mediator = new Mediator();

		Coach coach1 = new Coach("Name1", mediator);
		Coach coach2 = new Coach("Name2", mediator);
		TennisCourt t1 = new TennisCourt(1, mediator);
		TennisCourt t2 = new TennisCourt(2, mediator);

		coach1.prepareLesson(1);

		Assert.assertFalse(coach1.isCoachAvailable());
		Assert.assertFalse(t1.isCourtAvailable());
		Assert.assertTrue(coach2.isCoachAvailable());
		Assert.assertTrue(t2.isCourtAvailable());
	}
}
