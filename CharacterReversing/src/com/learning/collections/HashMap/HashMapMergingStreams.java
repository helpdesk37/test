package com.learning.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapMergingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] empId = {1001,1002,1003,1004,1005};
		String [] empDesc= {"emp1","emp2","emp3","emp4","emp5"};
		String [] empDesg={"Accountant","Clerk","Salesman","security","driver"};
		
		Map<Integer,String> empDetails = new HashMap();
		for (int i = 0; i < empId.length; i++) {
			empDetails.put(empId[i], empDesc[i]);
		}
		for (Map.Entry<Integer, String> entry : empDetails.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			//System.out.println(key+" "+val);
		}
		Map<Integer,String> empDesignations = new HashMap();
		for (int i = 0; i < empId.length; i++) {
			empDesignations.put(empId[i], empDesg[i]);
		}
		for (Map.Entry<Integer, String> entry : empDesignations.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			//System.out.println(key+" "+val);
		}
		Map<Integer,String> fmap=Stream.concat(
				empDetails.entrySet().stream(),
				empDesignations.entrySet().stream()
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(value1, value2) ->value1+" "+value2));
		for (Map.Entry<Integer, String> entry : fmap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
	}

}
