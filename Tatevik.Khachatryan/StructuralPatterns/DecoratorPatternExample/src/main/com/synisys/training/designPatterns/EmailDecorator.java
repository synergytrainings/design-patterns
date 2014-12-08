package main.com.synisys.training.designPatterns;

public abstract class EmailDecorator implements Email{
	//wrapped component
	protected Email originalEmail;
}
