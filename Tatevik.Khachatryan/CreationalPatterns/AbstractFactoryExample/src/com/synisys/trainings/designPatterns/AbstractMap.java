package com.synisys.trainings.designPatterns;

public abstract class AbstractMap {
	/**
	 * Holds current map name
	 */
	private final String mapName;
	
	public AbstractMap(String mapName){
		this.mapName = mapName;
	}
	
	/**
	 * 
	 * @return this Map Name
	 */
	public String getMapName(){
		return this.mapName;
	}
	
	/**
	 * Draws this map
	 */
	public abstract void draw();
	
	/**
	 * Refreshes this map
	 */
	public abstract void refresh();
}
