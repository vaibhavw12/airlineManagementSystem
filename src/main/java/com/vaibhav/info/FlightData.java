package com.vaibhav.info;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightData {
	public static String flightTime = null;
	public static Map<String,String> mapStatic = new HashMap<>();
	public static List<String> timings1 = new ArrayList<>();
	public static List<String> timings2 = new ArrayList<>();
	public boolean available(String sourcedestination,String date ) {
		 LocalDateTime now = LocalDateTime.now();  
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
	        String formatDateTime = now.format(format);  
	      //  System.out.println(formatDateTime.substring(11,13));
	      //  System.out.println(formatDateTime.substring(0,10));
	      //  System.out.println(formatDateTime);
//	        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//	        String formatDateTime1 = now.format(format1);  
//	        System.out.println(formatDateTime1);
		Map<String,String> map = options();
		String set = map.get(sourcedestination);
		System.out.println(map.size());
		
		String s = new String();
		if(date.equals(formatDateTime.substring(0, 10))) {
			System.out.println("in");
			for(int i=0;i<set.length();i++){
				if(set.charAt(i)==':') {
					break;
				}
				s+=set.charAt(i);
			}
			System.out.println(s);
			if(Integer.parseInt(s)>Integer.parseInt(formatDateTime.substring(11,13))) {
				flightTime = set;
				return true;
			}else {
				return false;
			}
		}else {
			System.out.println("reservation confirmed for "+date);
		}
		return false;
		
//		if(set>Integer.parseInt(formatDateTime.substring(11,13))) {
//			if(set>=0 && set<12) {
//				flightTime = set+ " : 00";
//			}else {
//				flightTime = set+ " : 00";
//			}
//			
//			return true;
//		}else {
//			return false;
//			}
	}

	private static Map<String,String> options() {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		
		String[] cities = {"Chennai","Hyderabad","Jaipur","Delhi","Luchnow","Kolkata","Mumbai","Banguluru","Pune","Indore"};
		List<String> list = new ArrayList<>();
		for(String s : cities) {
			//System.out.println(s);
			for(String i : cities) {
				if(s.equals(i)) {
					continue;
				}else {
					list.add(s+i);
				}
				
			}
		}
	//	System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			map.put( list.get(i),(i+1)%24+":"+(i+1)%60);
			mapStatic.put((i+1)%24+":"+(i+1)%60, list.get(i));
		}
		
		System.out.println(map.toString());
		System.out.println(mapStatic.toString());
	//	System.out.println(map.size());
		return map;
	}
	
	public static List<String> flightAvailble(String time) {
		Map<String,String> map = options();
		List<String> available = new ArrayList<>();
		for(String i : mapStatic.keySet()) {
			String s = new String();
			for(int j=0;j<i.length();j++){
				if(i.charAt(j)==':') {
					break;
				}
				s+=i.charAt(j);
			}
			if(Integer.parseInt(s)>Integer.parseInt(time)) {
				timings1.add(i);
				available.add(mapStatic.get(i));
			}
		}
		return available;
	}
	
	public static List<String> flightAvailble() {
		Map<String,String> map = options();
		List<String> available = new ArrayList<>();
		for(String i : mapStatic.keySet()) {
			
				timings2.add(i);
				available.add(mapStatic.get(i));
			
		}
		return available;
	}
	
	public static String time(String sourcedestination) {
		Map<String,String> map = options();
		for(String t : map.keySet()) {
			if(t.equals(sourcedestination)) {
				return map.get(t);
			}
		}
		return null;
		
	}

}
