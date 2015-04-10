package com.synisys.design_patterns.observer;

/**
 * Created by haykanush.torchyan on 4/3/2015.
 */
public class Test {

	public static void main(String... args){
		Site site = new Site();
		Subscriber user1 = new Subscriber("Alis", "Johnson");
		Subscriber user2 = new Subscriber("Mary", "Watson");
		Subscriber user3 = new Subscriber("George", "Brown");
		Subscriber user4 = new Subscriber("Hue", "Jackson");
		
		site.subscribe(user1, "topic1");
		site.subscribe(user2, "topic2");
		site.subscribe(user3, "topic2");
		site.subscribe(user4, "topic3");
		
		site.addArticleToTopic1("article1");
		site.addArticleToTopic1("article1");
		site.addArticleToTopic1("article1");
		
		System.out.println(user1.printArticles());
		System.out.println(user2.printArticles());
		System.out.println(user3.printArticles());
		System.out.println(user4.printArticles());
	}
	
}