package main.com.synisys.trainings.designPatterns;

public class Context {
	private int input;
	private String output = "";

	public Context(int input) {
		this.input = input;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	public void addOutput(String newValue){
		this.output = newValue + this.output;
	}
}
