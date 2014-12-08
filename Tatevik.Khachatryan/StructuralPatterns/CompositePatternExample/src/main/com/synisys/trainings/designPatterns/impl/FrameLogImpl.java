package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.FrameLog;
/**
 * FrameLogImpl will act as "Leaf" for Composite pattern  
 * @author tatevik.khachatryan
 *
 */
public class FrameLogImpl implements FrameLog {
	private String name;
	private int indicatorsCount; 	
	
	public FrameLogImpl(String name, int indicatorsCount){
		this.name = name;
		this.indicatorsCount = indicatorsCount;
	}
	
	protected String getName(){
		return this.name;
	}
	
	protected int getOwnIndicatorsCount(){
		return this.indicatorsCount;
	}
	
	@Override
	public int getIndicatorsCount(){
		return this.indicatorsCount;
	}
}
