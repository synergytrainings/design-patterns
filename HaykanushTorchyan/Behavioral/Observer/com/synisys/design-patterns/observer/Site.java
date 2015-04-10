package com.synisys.design_patterns.observer;

/**
 * Created by haykanush.torchyan on 4/3/2015.
 */
public class Site {

	// ... Site content ...
	
    private static List<String> topics = new ArrayList<String>();
		
	private Map<String, List<Subscriber>> observers;

	static{
		topics.add("topic1");
		topics.add("topic2");
		topics.add("topic3");
		topics.add("topic4");
	}
	
	public subscribe(Subscriber subscriber, String topic){
		if(observers.get(topic)==null){
			observers.put(topic, new ArrayList<Subscriber>);
		}
		observers.get(topic).add(subscriber);
	}
	
	private void notify(String topic){
		if(observers.get(topic)!=null){
			for(Subscriber subscriber : observers.get(topic)){
				subscriber.update(this, topic);
			}
		}
	}
	
	public List<String> getTopicArticles(String topic){
		return this.topics.get(topic);
	}
	
	public void addArticleToTopic1(String article){
		if(topics.get("topic1")==null){
			topics.set("topic1", new ArrayList<String>());
		}
		topics.get("topic1").add(article);
		notify("topic1");
	}
	
	public void addArticleToTopic2(String article){
		if(topics.get("topic2")==null){
			topics.set("topic2", new ArrayList<String>());
		}
		topics.get("topic2").add(article);
		notify("topic2");
	}
	
	public void addArticleToTopic3(String article){
		if(topics.get("topic3")==null){
			topics.set("topic3", new ArrayList<String>());
		}
		topics.get("topic3").add(article);
		notify("topic3");
	}
	
	public void addArticleToTopic4(String article){
		if(topics.get("topic4")==null){
			topics.set("topic4", new ArrayList<String>());
		}
		topics.get("topic4").add(article);
		notify("topic4");
	}
	
}