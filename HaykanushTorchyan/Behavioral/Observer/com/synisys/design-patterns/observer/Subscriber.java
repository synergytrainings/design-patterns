package com.synisys.design_patterns.observer;

/**
 * Created by haykanush.torchyan on 4/3/2015.
 */
public class Subscriber {

	private String firstName;
	private String lastName;
	
	private Map<String, List<String>> articles;
	
	public Subscriber(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		articles = new HashMap<String, List<String>>();
	}
	
	public void update(Site site, String topic){
		articles.put(topic, site.getTopicArticles(topic));
	}
	
	//for test!
	public String printArticles(){
		StringBuilder sb = new StringBuilder("");
		if(articles==null){
			return "No article";
		}
		for(String topic : articles.keySet){
			sb.append(topic + ": ");
			if(articles.get(topic)!=null){
				for(String article : articles.get(topic)){
					sb.append(article + ", ");
				}
			}
			sb.append("\n");
		}
	}
	
}