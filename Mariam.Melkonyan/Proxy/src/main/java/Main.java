import com.synisys.trainings.proxy.api.ListBuilder;
import com.synisys.trainings.proxy.impl.ListBuilderProxy;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// As creation of list builder is a process with high cost, it will be created in the case it is needed
		ListBuilder listBuilderProxy = new ListBuilderProxy();
		listBuilderProxy.draw();
	}

}
