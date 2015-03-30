package design.patterns.mediator;

/**
 * @author lilit.abrahamyan
 *
 */
public class TennisCourt{

	private int courtNumber;
	private Mediator mediator;
	
	TennisCourt(int courtNumber){
		this.courtNumber = courtNumber;
	}
	
	public TennisCourt(int courtNumber, Mediator mediator){
		super();
		this.mediator = mediator;
		this.courtNumber = courtNumber;
	}

	public int getCourtNumber() {
		return courtNumber;
	}
	
	public boolean isCourtAvailable(){
		return mediator.isCourtAvailable(this);
	}

}