package main.com.synisys.trainigs.prototypePattern;

public interface Copyable {
	/**
	 * Copies the object references from the original address to the duplicate
	 * 
	 * @return Copy of current object
	 */
	public Object copy();

	/**
	 * Copies the object references from the original address to the duplicate
	 * 
	 * @param shallow
	 *            if true copies only required fields, else all fields
	 * @return Copy of current object
	 */
	public Object copy(boolean shallow);
}
