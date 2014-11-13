package com.synisys.training.patterns.singleton;

/**
 * Singleton class implementing by "Initialization-on-demand holder idiom" (src : http://en.wikipedia.org/wiki/Singleton_pattern)
 * @author : Anania.Mikaelyan
 * @since : 11/10/2014
 */
public class ApplicationManager {
    // Private constructor. Prevents instantiation from other classes.
    private ApplicationManager() { }

    /**
     * Factory method returning single unique instance of  singleton class
     * @return unique application manager
     */
    public static ApplicationManager getInstance() {
        return ApplicationManagerSingleInstanceHolder.INSTANCE;
    }

    /**
     * Initializes singleton lazily.
     *
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class ApplicationManagerSingleInstanceHolder {
        private static final ApplicationManager INSTANCE = new ApplicationManager();
    }


    //methods goes here
    public String getApplicationName(){
        return "The name of this application is a great secret";
    }
    //other methods.....

}
