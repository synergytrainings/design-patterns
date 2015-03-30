package design.patterns.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public class Mediator{
	
	private Map<Integer, Coach> schedule;
	
	public Mediator(){
		schedule = new HashMap<>();
	}
	
	public void registerNewGame(TennisCourt court, Coach coach) {
		schedule.put(court.getCourtNumber(), coach);
	}

	public void registerCourt(TennisCourt court) {
		schedule.put(court.getCourtNumber(), null);
	}
	
	public boolean isCourtAvailable(TennisCourt court){
		return !schedule.containsKey(court.getCourtNumber());
	}
     
	public boolean isCoachAvailable(Coach coach){
		return !schedule.values().contains(coach);
	}
	
	
}