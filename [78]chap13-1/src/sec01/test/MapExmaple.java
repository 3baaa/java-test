package sec01.test;

import java.util.*;
import java.util.Map.Entry;

public class MapExmaple {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name=null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		Set<Entry<String,Integer>> entryset = map.entrySet();
		Iterator<Entry<String,Integer>> iterator = entryset.iterator();
		Entry<String, Integer> t;
		while(iterator.hasNext()) {
			t=iterator.next();
			if(maxScore<t.getValue()) {
				name=t.getKey();
				maxScore=t.getValue();
			}
			totalScore+=t.getValue();
		}
		
		System.out.println("평균점수: "+(totalScore/map.size()));
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고점수를 받은 아이디: "+name);
	}

}
