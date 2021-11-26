package com.vaibhav.info;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightData {
	public static String flightTime = null;
	public static Map<Integer,String> mapStatic = new HashMap<>();
	public static List<Integer> timings = new ArrayList<>();
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
		Map<String,Integer> map = options();
		Integer set = map.get(sourcedestination);
//		if(date.equals(formatDateTime.substring(0, 10))) {
//			if(set>Integer.parseInt(formatDateTime.substring(11,13))) {
//				return true;
//			}else {
//				return false;
//			}
//		}else {
//			System.out.println("reservation confirmed for "+date);
//		}
		
		if(set>Integer.parseInt(formatDateTime.substring(11,13))) {
			if(set>=0 && set<12) {
				flightTime = set+ " : 00";
			}else {
				flightTime = set+ " : 00";
			}
			
			return true;
		}else {
			return false;
		}
	}

	private static Map<String,Integer> options() {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		
		String[] cities = {"Mumbai","Delhi","Kolkata","Banguluru","Chennai","Pune"};
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
			map.put( list.get(i),(i+1)%24);
			mapStatic.put((i+1)%24, list.get(i));
		}
		
		System.out.println(map.toString());
	//	System.out.println(map.size());
		return map;
	}
	
	public static List<String> flightAvailble(String time) {
		Map<String,Integer> map = options();
		List<String> available = new ArrayList<>();
		for(Integer i : mapStatic.keySet()) {
			if(i>Integer.parseInt(time)) {
				timings.add(i);
				available.add(mapStatic.get(i));
			}
		}
		return available;
	}

}
