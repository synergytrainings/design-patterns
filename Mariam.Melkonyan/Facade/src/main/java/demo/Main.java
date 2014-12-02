package demo;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.designPatterns.facade.MapFacade;
import com.synisys.trainings.designPatterns.facade.MapView;
import com.synisys.trainings.designPatterns.facade.Mapbuilder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String adminBorder = "Province";
		List<String> scaleMeasures = new ArrayList<String>();
		scaleMeasures.add("Commitment");
		scaleMeasures.add("disbursement");
		List<String> chartMeasures = new ArrayList<String>();
		chartMeasures.add("# of Projects");		
		
		// without Facade 
		Mapbuilder mapbuilder = new Mapbuilder();
		mapbuilder.setChartMeasures(chartMeasures);
		mapbuilder.setScaleMeasures(scaleMeasures);
		mapbuilder.draw();
		
		MapView mapView = new MapView();
		mapView.setAdminBorder(adminBorder);
		mapView.draw();
		
		//with Facade
		MapFacade mapFacade = new MapFacade();
		mapFacade.drawMap(adminBorder);
		mapFacade.drawMapBuilder(scaleMeasures, chartMeasures);
	}

}
