package main.com.synisys.trainings.designPatterns.impl;

import  main.com.synisys.trainings.designPatterns.*;

public class ReportImpl implements Report{
	/**
	 *   Intrinsic State maintained by Report implementation and stored in ReportImpl object
	 */	 	 
	private String label;
	private ColorScheme colorScheme;
	
	public ReportImpl (String label, ColorScheme colorScheme){
		this.label = label;
		this.colorScheme = colorScheme;
	}
		
	@Override
	/**
	 * Extrinsic state - coordinates are passed to draw method from the client
	 */
	public void draw(int locationX, int locationY) {
		// draw report by given location		
		System.out.println(String.format("Drawing Report %s in %s color at (%s,%s) location", this.label, this.colorScheme.getColor(), locationX, locationY));
	}	
}
