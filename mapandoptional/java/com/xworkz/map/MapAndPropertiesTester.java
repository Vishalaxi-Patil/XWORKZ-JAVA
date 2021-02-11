package com.xworkz.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class MapAndPropertiesTester {

	public static void main(String[] args) {

		Map<String, String> maps = new TreeMap<String, String>();
		maps.put("knowledge", "power");
		maps.put("courage", "strenght");
		maps.put("success", "motivation");
		maps.put("love", "trust");
		maps.put("desire", "will");
		// System.out.println(maps);

		Set<Entry<String, String>> entrySet = maps.entrySet();
		entrySet.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
		System.out.println("**********************");
		//or maps.forEach((k,v)->System.out.println(k+" "+v));
		
	//properties
		Properties properties=new Properties();
		properties.setProperty("Vishalaxi", "pooja");
		properties.getProperty("Vishalaxi");

	}

}
