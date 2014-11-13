package com.synisys;

import java.util.Enumeration;

public class AdapterDemo {
	public static void main(String[] args) {
		MyArrayList<String> names = new MyArrayList<String>();
		names.add("jim");
		names.add("jack");
		names.add("jai");
		Enumeration<String> iterator = names.enumerator();
		while (iterator.hasMoreElements()) {
			String name = (String) iterator.nextElement();
			System.out.println(name);
		}

	}

}
