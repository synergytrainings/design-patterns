package main.com.synisys.trainings.factoryMethodPattern;
/**
 *  The Creator has an abstract "create" method for creation of an object.   
 * @author tatevik.khachatryan
 *
 */
public interface Creator {
	/**
	 * Creates objects of DeItem superclass.
	 */
	DeItem create(Integer id, String name);
}
