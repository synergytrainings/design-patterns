package com.synisys.trainings.Proxy;

public class User {
	private String name;
	private String password;
	private boolean canInsert;
	private boolean canDelete;
	private boolean canUpdate;

	/**
	 * @return the canInsert
	 */
	public boolean isCanInsert() {
		return canInsert;
	}

	/**
	 * @param canInsert
	 *            the canInsert to set
	 */
	public void setCanInsert(boolean canInsert) {
		this.canInsert = canInsert;
	}

	/**
	 * @return the canDelete
	 */
	public boolean isCanDelete() {
		return canDelete;
	}

	/**
	 * @param canDelete
	 *            the canDelete to set
	 */
	public void setCanDelete(boolean canDelete) {
		this.canDelete = canDelete;
	}

	/**
	 * @return the canUpdate
	 */
	public boolean isCanUpdate() {
		return canUpdate;
	}

	/**
	 * @param canUpdate
	 *            the canUpdate to set
	 */
	public void setCanUpdate(boolean canUpdate) {
		this.canUpdate = canUpdate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
