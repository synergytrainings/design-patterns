package com.synisys.training.patterns.singleton;

/**
 * Singleton class implementing by  "Enum way" (src : Effective Java)
 * @author : Anania.Mikaelyan
 * @since : 11/10/2014
 */
public enum ApplicationManagerEnumYay {
    INSTANCE;

    //methods goes here
    public String getApplicationName(){
        return "The name of this application is a great secret";
    }
    //other methods.....

}
