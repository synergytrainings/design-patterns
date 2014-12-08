package test.com.synisys.trainings.singletonPattern.test;

import static org.junit.Assert.*;

import com.synisys.trainings.singletonPattern.*;

public class Test {
	private static final String LOG_STR1 = "Log is written from LoggerUser1!";
	private static final String LOG_STR2 = "Log is written from LoggerUser2!";

	@org.junit.Test
	public void test() {
		new LoggerUser1();
		// Test1: EnumLogger
		assertEquals(EnumLogger.INSTANCE.getLastLog(), LOG_STR1);
		// Test2: EarlyLoadingLogger
		assertEquals(EarlyLoadingLogger.getInstance().getLastLog(), LOG_STR1);
		// Test3: LazyLoadingLogger
		assertEquals(LazyLoadingLogger.getInstance().getLastLog(), LOG_STR1);
		// Test4: LazyLoadingLogger2
		assertEquals(LazyLoadingLogger2.getInstance().getLastLog(), LOG_STR1);

		new LoggerUser2();
		// Test1: EnumLogger
		assertEquals(EnumLogger.INSTANCE.getLastLog(), LOG_STR2);
		// Test2: EarlyLoadingLogger
		assertEquals(EarlyLoadingLogger.getInstance().getLastLog(), LOG_STR2);
		// Test3: LazyLoadingLogger
		assertEquals(LazyLoadingLogger.getInstance().getLastLog(), LOG_STR2);
		// Test4: LazyLoadingLogger2
		assertEquals(LazyLoadingLogger2.getInstance().getLastLog(), LOG_STR2);
	}

	private static class LoggerUser1 {
		static {
			EnumLogger.INSTANCE.addLog(LOG_STR1);
			EarlyLoadingLogger.getInstance().addLog(LOG_STR1);
			LazyLoadingLogger.getInstance().addLog(LOG_STR1);
			LazyLoadingLogger2.getInstance().addLog(LOG_STR1);
		}
	}

	private static class LoggerUser2 {
		static {
			EnumLogger.INSTANCE.addLog(LOG_STR2);
			EarlyLoadingLogger.getInstance().addLog(LOG_STR2);
			LazyLoadingLogger.getInstance().addLog(LOG_STR2);
			LazyLoadingLogger2.getInstance().addLog(LOG_STR2);
		}
	}

}
