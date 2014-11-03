package com.synisys.trainings.designPatterns;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Builder Pattern example 
 * Generates Project class instance which has a number of required and optional parameters
 * @author tatevik.khachatryan
 * 
 */
public class Project {
	private final String title;
	private final String description;
	private final Date startDate;
	private final Date endDate;
	private final ArrayList<Contact> contacts;
	private final Organisation organisation;

	/**
	 * 
	 * Constructor class used to create project complex class
	 * 
	 * @author tatevik.khachatryan
	 * 
	 */
	public static class Builder {
		// Required parameters
		private final String title;
		private final Date startDate;
		private final Organisation organisation;

		// Optional parameters - initialized to default values
		private String description = "";
		private Date endDate = null;
		private ArrayList<Contact> contacts = new ArrayList<>();

		/**
		 * Constructor to initialize builder class with required parameters
		 * @param title
		 * @param startDate
		 * @param organisation
		 */
		public Builder(String title, Date startDate, Organisation organisation) {
			this.title = title;
			this.startDate = startDate;
			this.organisation = organisation;
		}

		/**
		 * Setter-like method to set optional description parameter
		 * @param description
		 * @return current Builder instance
		 */
		public Builder description(String description) {
			this.description = description;
			return this;
		}

		/**
		 * Setter-like method to set optional end date parameter
		 * @param endDate
		 * @return current Builder instance
		 */
		public Builder endDate(Date endDate) {
			this.endDate = endDate;
			return this;
		}

		/**
		 * Setter-like method to set optional contacts parameter 
		 * @param contacts
		 * @return current Builder instance
		 */
		public Builder contacts(ArrayList<Contact> contacts) {
			this.contacts = contacts;
			return this;
		}

		/**
		 * Generates immutable Project object
		 * @return
		 */
		public Project build() {
			return new Project(this);
		}
	}

	private Project(Builder builder) {
		title = builder.title;
		description = builder.description;
		startDate = builder.startDate;
		endDate = builder.endDate;
		contacts = builder.contacts;
		organisation = builder.organisation;
	}

	public String toString() {
		StringBuilder projectStr = new StringBuilder();
		projectStr.append("Title: ").append(title == null ? "" : title)
				.append("\n");
		projectStr.append("Description: ")
				.append(description == null ? "" : description).append("\n");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		projectStr.append("Start Date: ")
				.append(startDate == null ? "" : sdf.format(startDate))
				.append("\n");
		projectStr.append("End Date: ")
				.append(endDate == null ? "" : sdf.format(endDate))
				.append("\n");

		projectStr.append("Contacts...").append("\n");
		if (contacts != null) {
			for (Contact contact : contacts) {
				projectStr.append(contact.toString());
			}
		}

		projectStr.append("Organisation...").append("\n");
		projectStr.append(organisation.toString());

		return projectStr.toString();
	}
}
