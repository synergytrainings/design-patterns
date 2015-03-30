package design.patterns.mediator;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public class Coach {
	
	private String name;
	private Mediator mediator;
	
	public Coach(String name, Mediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return name;
	}

	public void prepareLesson(int courtNumber){
		mediator.registerNewGame(new TennisCourt(courtNumber), this);
	}

	public boolean isCoachAvailable(){
		return mediator.isCoachAvailable(this);
	}
}
