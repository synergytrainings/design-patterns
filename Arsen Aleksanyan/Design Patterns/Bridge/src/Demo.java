import com.synisys.designpatterns.bridge.logger.ConsoleLogger;
import com.synisys.designpatterns.bridge.performance.logger.PerformanceLogger;
import com.synisys.designpatterns.bridge.performance.logger.PerformanceLoggerImpl;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
			throws Exception {

		PerformanceLogger performanceLogger = new PerformanceLoggerImpl(new ConsoleLogger(), "main() method", 5000);

		performanceLogger.startLog();

		Thread.sleep(6000);

		performanceLogger.endLog();
	}
}
