package com.learning.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> subjects = new HashMap<>();
		subjects.put(1, "Telugu");
		subjects.put(2, "Hindi");
		subjects.put(3, "English");
		subjects.put(4, "Maths");
		subjects.put(5, "Maths");
		/*
		 * for (Map.Entry map : subjects.entrySet()) {
		 * System.out.println(map.getKey()+"\t"+map.getValue()); }
		 */
		
		Map<Integer,String> person = new HashMap<>();
		person.put(1, "person1");
		person.put(2, "person2");
		person.put(3, "person3");
		person.put(4, "person4");
		person.put(5, "person5");
		/*
		 * for (Map.Entry entry : person.entrySet()) {
		 * System.out.println(entry.getKey()+"\t"+entry.getValue());
		 * 
		 * }
		 */
		
		Map<Integer,String> mergedMap = new HashMap<>(subjects);
		for (Map.Entry<Integer, String> entry : person.entrySet()) {
			mergedMap.merge(entry.getKey(), entry.getValue(), (value1,value2)->value1+" "+value2);
			
		}
		for (Map.Entry<Integer, String> entry : mergedMap.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
