package com.synisys.trainings.singletonPattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Example of Singleton pattern implementation via Lazy loading. Here Logger is also Serializable. 
 * @author tatevik.khachatryan
 *
 */
public class LazyLoadingLogger implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Holds logs
	 */
	private List<String> logs = new ArrayList<>();
	
	// Pay attention to volatile
    private static volatile LazyLoadingLogger INSTANCE = null;

    /**
     * Empty constructor to prevent creating another instance of Singleton
     */
    private LazyLoadingLogger() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    /**
     * If instance is not created yet method will create it and return. It is thread-safe and implemented via double-checked locking idiom.
     * @return
     */
    public static LazyLoadingLogger getInstance() {
    	 // Creating only  when required.
    	 if (INSTANCE == null) {
             synchronized (LazyLoadingLogger.class) {
                 if (INSTANCE == null) {
                     INSTANCE = new LazyLoadingLogger();
                 }
             }
         }
         return INSTANCE;
    }
    
 // No more fear of serialization: during deserialization no new object will be created
    @SuppressWarnings("unused")
    private LazyLoadingLogger readResolve() {    	
        return INSTANCE;
    }
    
    /**
     * Override clone not to create new object
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
	/**
	 * Add new log to the logs list
	 * 
	 * @param log
	 */
	public void addLog(String log) {
		logs.add(log);
	}

	/**
	 * @return last registered log
	 */
	public String getLastLog() {
		return logs.get(logs.size() - 1);
	}
}
