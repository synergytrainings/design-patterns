import com.synisys.designpatterns.adapter.de.DeApi;
import com.synisys.designpatterns.adapter.de.DeGenerator;
import com.synisys.designpatterns.adapter.kb.KbApi;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		KbApi kbApi = new KbApi();
		DeApi deApi = new DeApi(kbApi);
		
		DeGenerator deGenerator = new DeGenerator(deApi);
		deGenerator.generate();
	}

}
