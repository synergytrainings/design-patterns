package main.com.synisys.trainings.bridgePattern;

public abstract class Chart {
	protected DrawAPI drawAPI;
	
	protected Chart(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
	
}
