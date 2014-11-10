package com.synisys.training.patterns.singleton.abstractfactory;


import com.synisys.training.patterns.singleton.abstractfactory.api.PersistenceType;
import com.synisys.training.patterns.singleton.abstractfactory.api.UserDAO;
import com.synisys.training.patterns.singleton.abstractfactory.implementation.RdbDAOFactory;
import com.synisys.training.patterns.singleton.abstractfactory.implementation.XmlDAOFactory;

/**
 * Singleton example with inheritance.
 */
public abstract class DAOFactory {

	public static final String PERSISTENCE_TYPE_SYSTEM_PROPERTY = "persistenceType";
	private static volatile DAOFactory instance;

	protected DAOFactory(){}

	public abstract UserDAO getUserDAO();


    public static DAOFactory getInstance() {
	    if(instance == null){
		    synchronized (DAOFactory.class){
			    if (instance == null){
				    PersistenceType persistenceType = PersistenceType.valueOf(System.getProperty(PERSISTENCE_TYPE_SYSTEM_PROPERTY));
				    switch (persistenceType) {
					    case RELATIONAL_DATA_BASE:
						    instance = new RdbDAOFactory();
						    break;
					    case XML:
						    instance = new XmlDAOFactory();
						    break;
					    default:
						    throw new IllegalArgumentException(String.format("Unsupported persistence type %s", persistenceType));
				    }
			    }
		    }
	    }
	    return instance;
    }
}
