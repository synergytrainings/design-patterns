package test.com.synisys.trainings.designPatterns;

import static org.junit.Assert.*;
import main.com.synisys.trainings.designPatterns.*;
import main.com.synisys.trainings.designPatterns.impl.*;

public class Test {
	private FrameLog activity1_1; 
	private FrameLog activity1_2;
	private FrameLog activity2_1;
	private FrameLog activity2_2;
	private FrameLog activity2_3;
	private FrameLog activity3_1;
	private Composite output1, output2;
	private Composite goal;
	
	@org.junit.Before
	public void before(){
		activity1_1 = new FrameLogImpl("Activity 1.1", 3); 
		activity1_2 = new FrameLogImpl("Activity 1.2", 2);
		activity2_1 = new FrameLogImpl("Activity 2.1", 5);
		activity2_2 = new FrameLogImpl("Activity 2.2", 1);
		activity2_3 = new FrameLogImpl("Activity 2.3", 0);
		activity3_1 = new FrameLogImpl("Activity 3.1", 1);
		
		output1 = new Composite();
		output1.add(activity1_1);
		output1.add(activity1_2);
		
		output2 = new Composite();
		output2.add(activity2_1);
		output2.add(activity2_2);
		output2.add(activity2_3);
		
		goal = new Composite();
		goal.add(activity3_1);
		goal.add(output1);
		goal.add(output2);		
	}
	
	@org.junit.Test
	public void test() {
		assertEquals(activity1_1.getIndicatorsCount(), 3);
		assertEquals(output1.getIndicatorsCount(), 5);
		assertEquals(output2.getIndicatorsCount(), 6);
		assertEquals(goal.getIndicatorsCount(), 1+5+6);
	}

}
